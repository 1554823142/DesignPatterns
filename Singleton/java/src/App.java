import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class App {
    public static void main(String[] args) throws Exception {
        int threadCount = 10; // 线程数量
        Set<Singleton> instances = new HashSet<>(); // 存储获取到的实例
        CountDownLatch latch = new CountDownLatch(threadCount); // 用于同步线程

        // 创建多个线程
        for (int i = 0; i < threadCount; i++) {
            new Thread(() -> {
                try {
                    latch.await(); // 等待所有线程就绪
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Singleton instance = Singleton.getInstance();
                synchronized (instances) {
                    instances.add(instance); // 将实例添加到集合中
                }
            }).start();
            latch.countDown(); // 线程就绪，计数器减一
        }

        // 等待所有线程执行完毕
        Thread.sleep(1000);

        // 检查是否只有一个实例
        if (instances.size() == 1) {
            System.out.println("验证成功：所有线程获取到的都是同一个实例。");
        } else {
            System.out.println("验证失败：存在多个不同的实例。");
        }
    }
}

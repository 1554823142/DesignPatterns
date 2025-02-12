public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {}    // 确保不会被外部实例化

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized(Singleton.class) {     // 实现线程同步的关键字
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
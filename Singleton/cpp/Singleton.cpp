#include <iostream>
#include <memory>
#include <mutex>
#include <thread>
#include <vector>
#include <set>

class Singleton {
private:
    static std::shared_ptr<Singleton> uniqueInstance; // 静态成员变量，存储单例实例
    static std::mutex singletonMutex; // 静态互斥锁，用于保护单例的创建

    // 私有构造函数，防止外部实例化
    Singleton() {
        std::cout << "Singleton created!" << std::endl;
    }

    // 删除拷贝构造函数和赋值运算符
    Singleton(const Singleton&) = delete;
    Singleton& operator=(const Singleton&) = delete;

public:
    // 获取单例实例的静态方法
    static std::shared_ptr<Singleton> getInstance() {
        if (uniqueInstance == nullptr) {
            std::unique_lock<std::mutex> lock(singletonMutex);
            if (uniqueInstance == nullptr) {
                uniqueInstance = std::shared_ptr<Singleton>(new Singleton());
            }
        }
        return uniqueInstance;
    }

    // 析构函数
    ~Singleton() {
        std::cout << "Singleton destroyed!" << std::endl;
    }
};

// 初始化静态成员变量必须在外部初始化
std::shared_ptr<Singleton> Singleton::uniqueInstance = nullptr;
std::mutex Singleton::singletonMutex;

// 全局互斥锁，用于保护 instances 集合
std::mutex setMutex;

// 线程函数：获取单例实例并插入到集合中
void createInstanceOfSingleton(std::set<std::shared_ptr<Singleton>>& instances) {
    auto instance = Singleton::getInstance();
    std::unique_lock<std::mutex> lock(setMutex);
    instances.insert(instance);
}

int main() {
    std::vector<std::thread> threads; // 存储线程对象
    std::set<std::shared_ptr<Singleton>> instances; // 存储单例实例

    // 创建 20 个线程
    for (unsigned int i = 0; i < 20; i++) {
        threads.emplace_back(createInstanceOfSingleton, std::ref(instances));
    }

    // 等待所有线程完成
    for (auto& entry : threads) {
        entry.join();
    }

    // 检查是否只有一个实例
    if (instances.size() == 1) {
        std::cout << "Success! Only one instance was created." << std::endl;
    } else {
        std::cout << "Failed! Multiple instances were created." << std::endl;
    }

    return 0;
}
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        
        Pizza pizza;

        pizza = createPizza(type);      // 调用创建pizza

        // 其实并不知道真正创建的是哪一种披萨, 只知道这只是一个pizza, 然后经过处理后提供给消费者
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);      // 工厂方法: 实例化披萨(由子类实现)
}

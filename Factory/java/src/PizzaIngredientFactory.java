// 建造原料工厂(以解决各地原料的不同)
public interface PizzaIngredientFactory {
    
    // 接口中每个原料都有对应的生产方法, 每个原料都是一个类
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggie();
    public Clams createClam();
    public Pepperoni createPepperoni();
}

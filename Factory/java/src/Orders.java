public class Orders {
    public static void main(String[] args){

        // 首先创建店
        PizzaStore nyPizzaStore = new NYPizzaStore();   
        PizzaStore chicagStore = new ChicagoPizzaStore();

        // 在店内下订单(在其中已经完成pizza的创建和生产)
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Bob ordered a " + pizza.getName() + "\n");

        pizza = chicagStore.orderPizza("cheese");
        System.out.println("Mike ordered a " + pizza.getName() + "\n");        
    }
}

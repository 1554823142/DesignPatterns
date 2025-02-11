// 加盟店: 纽约风味
public class NYPizzaStore extends PizzaStore{

    protected Pizza createPizza(String item) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = 
            new NYPizzaIngredientFactory();             // 纽约店用到纽约的原料工厂

        if(item.equals("cheese")){

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if(item.equals("veggie")){

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        } else if(item.equals("clam")){

            pizza = new ChamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        } else if(item.equals("pepperoni")){

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style pepperoni Pizza");
        }
        return pizza;
    }
}



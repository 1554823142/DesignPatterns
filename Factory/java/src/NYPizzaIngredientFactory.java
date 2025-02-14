public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce(){
        return new MarinaraSauce();
    }

    public Cheese createCheese(){
        return new ReggianoCheese();
    }

    public Veggies[] createVeggie() {
        Veggies veggie[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggie;
    }

    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }

    public Clams createClam(){
        return new FreshClams();
    }
}

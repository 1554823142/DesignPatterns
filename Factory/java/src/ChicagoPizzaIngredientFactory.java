public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }

    public Cheese createCheese(){
        return new ReggianoCheese();
    }

    public Veggies[] createVeggie() {
        Veggies veggie[] = {new Eggplant(), new BlackOlives(), new Mozzarells(), new RedPepper() };
        return veggie;
    }

    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }

    public Clams createClam(){
        return new FrozenClams();
    }
}

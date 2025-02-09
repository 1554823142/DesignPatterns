public class ModelDuck extends Duck{
    public ModelDuck(){
        flybehavior = new FlyNoWay();
        quackbehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}

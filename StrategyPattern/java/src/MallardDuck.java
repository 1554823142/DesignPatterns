public class MallardDuck extends Duck{
    public MallardDuck(){
        // 将行为的职责委托给相应的实现叫和飞的对象
        quackbehavior = new Quack();
        flybehavior = new FlyWithWings();    
    }
}

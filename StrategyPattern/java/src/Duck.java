public abstract class Duck {

    // 声明行为接口类型的两个引用变量
    FlyBehavior flybehavior;
    QuackBehavior quackbehavior;

    public Duck()   {}

    public void performFly(){
        flybehavior.fly();
    }
    
    public void performQuack(){
        quackbehavior.quack();
    }

    public void swim(){
        System.out.println("All duck swim!");
    }

    // 加入两个新方法: 通过设定方法来动态设定行为
    public void setFlyBehavior(FlyBehavior fb){
        flybehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackbehavior = qb;
    }
}

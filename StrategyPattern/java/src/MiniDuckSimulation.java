public class MiniDuckSimulation {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        // 新建modelduck对象
        Duck model = new ModelDuck();
        model.performFly();
        // 动态更改行为(运行时)
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

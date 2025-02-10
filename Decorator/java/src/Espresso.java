// 实现浓缩咖啡具体类
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }

    public double cost(){   // 实现基类定义的抽象方法
        return 1.99;
    }
}

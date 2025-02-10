// 实现concrete decorator
public class Whip extends CondimentDecorator{
    Beverage beverage;      // 实例变量记录被装饰者(饮料)

    // 通过构造函数记录被装饰者
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){ 
        return beverage.getDescription() + ", Whip";   // 完整的描述 饮料 + 调料
    }

    public double cost(){
        return .10 + beverage.cost();       // 将调用委托给被装饰对象
    }
}
// 实现concrete decorator
public class Soy extends CondimentDecorator{
    Beverage beverage;      // 实例变量记录被装饰者(饮料)

    // 通过构造函数记录被装饰者
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){ 
        return beverage.getDescription() + ", Soy";   // 完整的描述 饮料 + 调料
    }

    public double cost(){
        return .15 + beverage.cost();       // 将调用委托给被装饰对象
    }
}
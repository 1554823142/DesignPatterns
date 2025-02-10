public class StarbuzzCoffee {
    public static void main(String args[]){
       
        //无需加调料的Espresso
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + 
            " $" + beverage.cost());
       
        // 加两份Mocha 和一份 Whip
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + 
            " $" + beverage2.cost());

        // 调料为一份Soy Mocha和Whip的HouseBlend
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + 
            " $" + beverage3.cost());
    }
}

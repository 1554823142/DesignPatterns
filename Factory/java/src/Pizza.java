import java.util.ArrayList;

public abstract class Pizza {
    String name;
    // String dough;
    // String sauce;
    //ArrayList toppings = new ArrayList();
    // 采用了新的原料工厂设计
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    // void prepare() {
    //     System.out.println("Preparing " + name);
    //     System.out.println("Tossing dough...");
    //     System.out.println("Adding sauce...");
    //     System.out.println("Adding toppings: ");
    //     for(int i = 0; i < toppings.size(); i++){
    //         System.out.println("    " + toppings.get(i));
    //     }
    // }

    // 声明prepare为抽象方法
    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 min");
    }

    void cut(){
        System.out.println("Cutting...");
    }

    void box(){
        System.out.println("Boxing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name; 
    }

}
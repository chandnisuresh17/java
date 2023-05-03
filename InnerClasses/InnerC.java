package InnerClasses;


 class Fruit{
    String name;
    public void Apple(){
        System.out.println("Red");
    }

static class Vegetable{
    public void Pumpkin(){
        System.out.println("orange");
    }
}
}




public class InnerC {
    public static void main(String[] args){
        Fruit f = new Fruit();
        f.Apple();
        // Fruit.vegetable fv = f.new Vegetable();
        Fruit.Vegetable fv = new Fruit.Vegetable();
        fv.Pumpkin();

    }
    
}
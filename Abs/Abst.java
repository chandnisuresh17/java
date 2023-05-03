package Abs;

abstract class Animal{
    abstract public void sound();
        
    
    public void Dog(){
        System.out.println("Bark");
    }
}
class Tiger extends Animal{
    public void sound(){
    System.out.println("Roar");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Meow");
    }

}

public class Abst{
    public static void main(String[] args){
        Animal a = new Cat();
        Animal a1 = new Tiger();
        a.sound();
        a1.sound();
       
        


    }
}

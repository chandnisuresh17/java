package java;

public class Calc {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public void display(){
        System.out.println("calc");
    }

    
    public static void main(String[] args){
        Calc c = new Calc();
        int r = c.add(2,3);
        System.out.println(r);
        int e = c.sub(4,3);
        System.out.println(e);
    }
}

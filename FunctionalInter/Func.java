package FunctionalInter;
@FunctionalInterface
interface A{
    int display(int i,int j);

}
public class Func{
    public static void main(String[] args){
        // A a1=(int a,int b)->System.out.printl(+i+j);
        // a1.display(54,87);
        A a2 = new A() {
            
        
        
            public int display(int a,int b){
                return a+b;
            }
        };
        
        int res = a2.display(66,87);
        System.out.println(res);

        A a3 = (int i,int j) -> i+j;
        int res1 = a3.display(65,87);
        System.out.println(res1);

    }
}


    
    


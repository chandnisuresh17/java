package InterrF;

interface Textile {
    void clothDetails();
}

interface TextileA extends Textile,Distributor {
  void code();
}


interface Distributor {
    void DistributorDetails();
}

class TextileB implements TextileA, Distributor {
 public void code() {
   System.out.println("code --->compile -->execute --> Desktop");
}

@Override
public void DistributorDetails() {
// TODO Auto-generated method stub
throw new UnsupportedOperationException("Unimplemented method 'vendorDetails'");
}

@Override
public void clothDetails() {
// TODO Auto-generated method stub
throw new UnsupportedOperationException("Unimplemented method 'chipDetails'");
}
}

class TextileC implements TextileA {
public void code() {
System.out.println("code --->compile -->execute --> Laptop");
}
}

class Buyer {
public void buildApp(TextileA t) {
 t.code();
}

}

public class Inter {
public static void main(String[] args) {
TextileA t = new TextileC();

TextileA t1 = new TextileB();

Buyer b = new Buyer();
b.buildApp(t);
b.buildApp(t1);
}
}

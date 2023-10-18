package sample;

//abstract class B{}
//interface interfaceA{}
//
//public class A {
//////  public static void methodOne(long l) {System.out.println("widening");}
////  public static void methodOne(Object o) {System.out.println("autoboxing");}
//////  public static void methodOne(int... i) {System.out.println("var-arg method");}
//  final static int a=1;
//  static void methodOne() {}
//  
//  public static void main(String[] args) { 
////    int x=10;
//    methodOne();
//  }
//}
class A {
static int count = 0;
public static void main(String[] args) {
    if(count<3) {
        count++;
        main(null);
    } else {
        return;
    }
    System.out.println("Hello World!");
  }
}
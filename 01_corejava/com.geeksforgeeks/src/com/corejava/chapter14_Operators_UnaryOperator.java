package com.corejava;
public class chapter14_Operators_UnaryOperator {
  public static void main(String[] args) {
    int a = 20, b = 10, c = 0;  

    // a=b+++c is compiled asb++ +c
    // a=b+c then b=b+1
    a = b++ + c;
    System.out.println("Value of a(b+c), "+ " b(b+1), c = "+ a + ", " + b + ", " + c);

    // a=b+++++c is compiled asb++ ++ +c
    // which gives error.
    // a=b+++++c;
    // System.out.println(b+++++c);
  }
}
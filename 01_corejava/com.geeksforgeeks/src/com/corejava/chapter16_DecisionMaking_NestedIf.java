package com.corejava;

class chapter16_DecisionMaking_NestedIf { 
  public static void main(String args[]) { 
    int i = 10; 
    
    if (i == 10) { 
      // First if statement 
      if (i< 15) 
        System.out.println("i is smaller than 15"); 
      
      // Nested - if statement Will only be executed if statement above is true 
      if (i< 12) 
        System.out.println("i is smaller than 12 too"); 
      else
        System.out.println("i is greater than 15"); 
    } 
  } 
} 

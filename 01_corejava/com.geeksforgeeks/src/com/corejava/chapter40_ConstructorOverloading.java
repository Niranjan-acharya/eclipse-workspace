package com.corejava;

class Box1 {
  double width, height,depth;
  
  // constructor used when all dimensions specified
  Box1(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }
  
  //constructor used when no dimensions specified 
  Box1(){ 
    width = height = depth = 0; 
  } 

  //constructor used when cube is created 
  Box1(double len) { 
    width = height = depth = len; 
  } 

  // compute and return volume
  double volume() {
    return width * height * depth;
  }
}

// Driver code 
public class chapter40_ConstructorOverloading { 
  public static void main(String args[]){ 
    // create boxes using the various constructors 
    Box1 mybox1 = new Box1(10, 20, 15); // Parameterized constructor 
    Box1 mybox2 = new Box1(); //Zero constructor
    Box1 mycube = new Box1(7); // Parameterized constructor

    double vol; 

    // get volume of first box 
    vol = mybox1.volume(); 
    System.out.println(" Volume of mybox1 is " + vol); 
    
    // get volume of second box 
    vol = mybox2.volume(); 
    System.out.println(" Volume of mybox2 is " + vol); 
    
    // get volume of cube 
    vol = mycube.volume(); 
    System.out.println(" Volume of mycube is " + vol); 
  } 
}

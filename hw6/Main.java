public class Main {
  public static void main(String[] args) {
  // create a new object of the class Box
    // object is an instance of the class Box
Box myBox = new Box (); // new operator creates a new object of the class Box
  // variable myBox is an new created object  of the class Box in     // comp memory is a reference to the object memrory.
  // Box is the class, myBox is the object. 
    myBox.width = 2; // .dot operator calls methods or object fields
    myBox.length = 3;
    myBox.height = 4;

    double size = myBox.Size();
    System.out.println("Size is: " + size);
    // we created the new object in comp.memory and stored the reference in myBox. next we named the fields of the object using dot operator 

    Box myBox2 = new Box ();
    myBox2.width = 8;
    myBox2.length = 16;
    myBox2.height = 10;
    double size2 = myBox2.Size();
    System.out.println("Size2 is: " + size2);
  }
}

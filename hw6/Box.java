// class is a blueprint(schema) for creating objects.
public class Box{
  // OOP class fields, describe state of object
  int length;
  int width;
  int height;
  String color;
  String material;
  boolean isOpen;
  double Size(){
    return length*width*height;
  }

  // OOP class methods, describe behavior of object
  public void open(){
    isOpen = true;
  }

  public void close(){
    isOpen = false;
  }

  public void print(){
    System.out.println("Box is " + color + " and made of " + material);
  }
}
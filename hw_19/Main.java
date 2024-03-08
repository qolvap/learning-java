/*
 * This class contains the main method and is the entry point of the program.
 */
public class Main {
    public static void main(String[] args) {
        // Create an array of Polymorphism objects
        Polymorphism[] p = new Polymorphism[3];
        // Initialize array elements with different subclasses of Polymorphism
        p[0] = new Dragon();
        p[1] = new Dino();
        p[2] = new Polymorphism();

        // Iterate through the array and call the Hello method for each object
        for(Polymorphism polymorphism : p){
            polymorphism.Hello();
        }
    }
}

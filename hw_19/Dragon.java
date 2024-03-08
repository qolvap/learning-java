/*
 * This class extends Polymorphism and represents a Dragon.
 * It overrides the Hello method to provide a custom greeting.
 * It also has a specific method Fly to indicate flying behavior.
 */
public class Dragon extends Polymorphism {
    // Override the Hello method to provide a specific greeting
    @Override 
    public void Hello() {
        System.out.println("Dragon says: Hello you");
    }

    // Method to indicate flying behavior
    public void Fly(){
        System.out.println("Dragon can fly");
    }
}

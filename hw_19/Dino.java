/*
 * This class extends Polymorphism and represents a Dino.
 * It overrides the Hello method to provide a custom greeting.
 */
class Dino extends Polymorphism {
    // Method to indicate roaring behavior
    public void Roar() {
        System.out.println("Dino is roaring, rrrrr");
    }

    // Override the Hello method to provide a specific greeting
    @Override
    public void Hello() {
        System.out.println("Dino says: Hello you");
    }
}

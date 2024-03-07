import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Dino d = new Dino();
      System.out.printf("Dino says: %s\n", d.hello());
      Mamunt m = new Mamunt();
      System.out.printf("Mamunt says: %s\n", d.hello());
      Cow c = new Cow();
      System.out.printf("Cow says: %s\n", d.hello());
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Students s1 = new Students("John", 2);
        String mail1 = s1.mail("Massage from ");
      System.out.println(mail1);
        Students s2 = new Students("Jane", 3);
        String mail2 = s2.mail("Massage sent to ");
      System.out.println(mail2);
    }
}

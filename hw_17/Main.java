import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Person p = new Person();
      p.setName("John");
      p.setSurname("Doe");
      p.profession = "Software Engineer";
      p.sex = "Male";
      p.age = 30;
      p.height = 180.0;

      Person p2 = new Person();
      p2.setName("Jane");
      p2.setSurname("Does");
      p2.profession = "Manager";
      p2.sex = "Female";
      p2.age = 30;
      p2.height = 160.0;
    }
}

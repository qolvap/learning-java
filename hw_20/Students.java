// Students.java
public class Students {
    String name;
    int year;

    Students(String name, int year) {
        this.name = name;
        this.year = year;
    }

    String mail(String massage) {
        return massage + name + " he is on " + year + " year";
    }
}

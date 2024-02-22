public class Main {
  public static void main(String[] args) {
    // Implicit type casting: int to double
    int i = 5;
    double d = i; 

    // Explicit type casting: double to int
    double d1 = 5.5;
    int i1 = (int) d1;

    // Parsing string to double and int
    double dStr = Double.parseDouble("1314.3");
    int iStr = Integer.parseInt("5");

    // Converting double and int to string
    String sd = String.valueOf(d);
    String si = String.valueOf(i);

    // Printing the results
    System.out.println(d + " : " + sd); // 5.0 : 5.0
    System.out.println(i + " : " + si); // 5 : 5
  }
}

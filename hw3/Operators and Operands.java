// Arithmetic operators are used in math expressions
public class LearnArithmetic {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
      System.out.println("b % a = " + (b % a));
      System.out.println("c % a = " + (c % a));
      System.out.println("a++ = " + (a++));
      System.out.println("a-- = " + (a--));
      System.out.println("d++ = " + (d++));
      System.out.println("++d = " + (++d));
        System.out.println("a += b = " + (a += b));
        System.out.println("a = " + (a));
        System.out.println("a -= b = " + (a -= b));
        System.out.println("a = " + (a));
    }
}

/*
 * a + b = 30
 * a - b = -10
 * a * b = 200
 * b/a = 2
 * b % a = 0
 * c % a = 5
 * a++ = 10
 * a-- = 11
 * d++ = 25
 * ++d = 27
 * a += b = 30
 * a = 30
 * a -= b = 10
 * a = 10
 */

 // Bit (bitwise) operators deal with bits and perform operations bit by bit. 
 int a = 60; 
int b = 13; 
 
System.out.println("a & b   = " + (a & b)); // 12  = ... 0000 1100
System.out.println("a | b   = " + (a | b)); // 61  = ... 0011 1101
System.out.println("a ^ b   = " + (a ^ b)); // 49  = ... 0011 0001
System.out.println("~a      = " + ~a); // -61 = 1111 1111 1111 1111 1111 1111 1100 0011
System.out.println("a << 2  = " + (a << 2)); // 240 = ... 1111 0000
System.out.println("a >> 2  = " + (a >> 2)); // 15  = ... 0000 1111
System.out.println("a >>> 2 = " + (a >>> 2)); // 15  = ... 0000 1111

// comparison operations
public class LearnEquality {
    public static void main(String[] args) {
         int a = 10;
         int b = 20;
            System.out.println("a == b = " + (a == b) );
            System.out.println("a != b = " + (a != b) );
            System.out.println("a > b = " + (a > b) );
            System.out.println("a < b = " + (a < b) );
            System.out.println("b >= a = " + (b >= a) );
            System.out.println("b <= a = " + (b <= a) );
     }
 }

 /*
  * a == b = false

  * a != b = true

  * a > b = false

  * a < b = true

  * b >= a = true

  * b <= a = false
  */

  // logical operators 
  public class LearnInstanceofMain {
    public static void main(String[] args) {
    String name ="Hello";
        boolean result = name instanceof String;
        System.out.println( result );
    }
}
// output true

// Ternary operator "?:" Syntax of the operator: <condition> ? <expression_1> : <expression_2>
public class LearnTernary {
    public static void main(String[] args){
        int experience = 5;
      	int requirements = 10;
        String result = (experience > requirements) ? "Accept to project" : "Learn more" ;
        System.out.println( result );
	}
}
// output Learn more
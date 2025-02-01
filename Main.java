import java.util.*;
/*
Write a Java program to demonstrate the use of primitive data types and type conversion. The program should:

Declare and initialize variables of different primitive data types (int, double, char, and boolean).
Perform type conversion by converting an int to a double and a char to an int.
Print the values of all variables before and after the conversions.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        double c = a;
        double f = 3.146;
        char ch = 'A';
        int x = ch;
        Boolean d = true;
        System.out.println("Integer is: "+a);
        System.out.println("After conversion of int into Double: "+c);
        System.out.println("Character is: "+ch);
        System.out.println("After conversion of character into int: "+x);
        System.out.println("Boolean value is: "+d);
    }
}
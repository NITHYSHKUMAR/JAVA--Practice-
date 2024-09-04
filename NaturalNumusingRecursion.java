package javapractice;
import java.util.*;
public class NaturalNumusingRecursion{
   
    public static void printNaturalNumbers(int n) {
        if (n > 0) {
            printNaturalNumbers(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the range for natural numbers=");
        int limit = s.nextInt();
        System.out.println("Natural numbers from 1 to " + limit + ":");
        printNaturalNumbers(limit);
    }
}

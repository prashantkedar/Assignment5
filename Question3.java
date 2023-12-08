/*Write a java program to find the power of a number.
Make the user to enter two numbers, keep the second
number as power of first using for loop
i/p ist number = base
    2nd number = power 
Test Case : Input 2 3
Output 2 3 = 8 */

    import java.util.Scanner;

public class Question3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter 1st number (base) : ");
        int base = sc.nextInt();
        System.out.print("enter 2nd number (power) : ");
        int power = sc.nextInt(); 
        int multiply = 1;
        for (int i = 1 ; i <= power ; i++ ) {
            multiply = multiply*base;
            
           
        }
        System.out.println(multiply);


    }
}
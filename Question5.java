/*Write a Java program to print the sum of squares of numbers from 1
to n using a for loop.
Test Case: Enter the value of n = 5
Sum of squares of 1st 5 numbers = 55 */

import java.util.Scanner;
public class Question5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc. nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares of 1st " + n + " numbers = " + sum);
    }
}
/*Input the lower bound and upper bound then print all the Fibonacci
numbers within the bound. The Fibonacci sequence starts with 0
and 1, and each subsequent number is the sum of the two
preceding ones.
Test case : Input lower =5 and upper= 40
            Output: 5 8 13 21 34 */
//Fn = Fn-1+Fn-2
//c  = a + b 

import java.util.Scanner;

public class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter lower number : ");
        int lower = sc.nextInt();
        System.out.print("enter upper number : ");
        int upper = sc.nextInt();

        int fn = 0;
        int b = 1;
        System.out.print("output: ");
        for ( ; fn <= upper; ) {
            if(fn >= lower) {
                System.out.print( fn + " " );
            }
            int c = fn + b;
            fn = b;
            b = c;
        }


    }
}
/* 6. Write a program to find the factorial of a given number. */

package ifelse_loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            int userInput = scan.nextInt();
            int fact = 1;
            for (int i = 1; i <= userInput; i++) {
                fact *= i;
            }
            System.out.println(fact);
        }catch (Exception e){
            System.out.println("Please enter a valid integer");
        }
    }
}

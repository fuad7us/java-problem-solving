/* 7. Write a program to print prime numbers from 2 to n. */

package ifelse_loop;

import java.util.Scanner;

public class PrimeNumberOfN {
    public static void main(String[] args) {
        try {
            String primeNumbers = "";
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            int userInput = scan.nextInt();

            for (int i = 1; i <= userInput; i++)
            {
                int counter=0;
                for(int num =i; num>=1; num--)
                {
                    if(i % num==0)
                    {
                        counter = counter + 1;
                    }
                }
                if (counter ==2)
                {
                    primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out.println("Prime numbers from 1 to " + userInput + " are :");
            System.out.println(primeNumbers);
        }catch (Exception e){
            System.out.println("Please enter a valid number");
        }
    }
}

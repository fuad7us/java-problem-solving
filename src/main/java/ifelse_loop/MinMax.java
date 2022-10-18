/* 10. Write a program to enter the numbers till the user wants and at the end,
the program should display the largest and smallest numbers user entered. */

package ifelse_loop;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        try {
            int number = 0;
            int max = 0;
            int min = 0;
            String choice = "";
            Scanner scan = new Scanner(System.in);


            while (!choice.equals("q")){
                System.out.println("Please enter a number or q to quit.");
                choice = scan.next();
                if (!choice.equals("q")){
                    number = Integer.parseInt(choice);
                    if(number > max){
                        max = number;
                    }else if(number < max){
                        min = number;
                    }
                }
            }

            System.out.println("The largest number is: " + max);
            System.out.println("The smallest number is: " + min);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}


/* 9. Write a program to sum of user input until users input ‘q’ from keyboard */

package ifelse_loop;

import java.util.Scanner;

public class SumUntilPressQ {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int sum = 0;
            String choice = "";

            while(!choice.equals("q")) {
                System.out.println("Please enter a number or quit to q");
                choice = scan.next();

                if (!choice.equals("q")){
                    int userInput = Integer.parseInt(choice);
                    sum += userInput;
                }
            }
            System.out.println("Total sum is :" + sum);
        }catch (Exception e){
            System.out.println("Please enter a valid integer or q to quit");
        }
    }
}

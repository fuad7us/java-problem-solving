/* 2. Write a program according to the following output:

********************Welcome to the Guessing Game! ********************
 ********************A number is already generated. ********************
*****To win, you have 5 chances to guess the generated number. *****

Please, enter an Integer value that you can guess, between 1 to 100: 56 (User input)
Your input is higher than the generated number.

Please, enter an Integer value that you can guess, between 1 to 100: 23 (User input)
Your input is higher than the generated number.

Please, enter an Integer value that you can guess, between 1 to 100: 10 (User input)
Your input is lower than the generated number.

Please, enter an Integer value that you can guess, between 1 to 100: 21 (User input)
Your input is higher than the generated number.

Please, enter an Integer value that you can guess, between 1 to 100: 20 (User input)
Great! You have guessed the correct number.

Congratulation!! You win!! */

package ifelse_loop;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        try {
            int randomValue = (int)(Math.random()*100);
            System.out.println(randomValue);

            for (int i =0; i <= 5; i++){
                Scanner input = new Scanner(System.in);
                int uservalue = input.nextInt();
                if (uservalue > randomValue){
                    System.out.println("Your input is higher than the generated number");
                } else if(uservalue < randomValue){
                    System.out.println("Your input is lower than the generated number");
                } else {
                    System.out.println("Great! You have guessed the correct number");
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("Enter an valid integer value");
        }
    }
}


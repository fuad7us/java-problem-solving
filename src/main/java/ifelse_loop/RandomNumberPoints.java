/* 8. Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally,
repeat this for 10 times and count the total points user achieved at the end of 10 cycle.
*/

package ifelse_loop;

import java.util.Scanner;

public class RandomNumberPoints {
    public static void main(String[] args) {
        try {
            int rand1 = (int) (Math.random() * 20);
            int rand2 = (int) (Math.random() * 20);
            int point = 0;

            Scanner scan = new Scanner(System.in);

            for (int i = 0; i < 10; i++) {
                System.out.println("See you can guess the number between 0 to 20: ");
                int userInput = scan.nextInt();
                if (userInput == rand1 || userInput == rand2) {
                    point += 1;
                    System.out.println("You get 1 point");
                } else if (userInput > 20) {
                    System.out.println("Please guess between 0 to 20");
                } else {
                    System.out.println("You do not get any point");
                }
            }
            System.out.println("Your total point is : " + point);
        }catch (Exception e){
            System.out.println("Enter a valid number");
        }
    }
}

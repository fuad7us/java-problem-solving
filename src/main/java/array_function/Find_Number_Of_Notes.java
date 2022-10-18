/* Input an amount from the user and find out the number of notes from input amount in given array
[1000,500,100,50,20,10,5,2,1] */

package array_function;

import java.util.Scanner;

public class Find_Number_Of_Notes {
    public static void main(String[] args) {
        try {
            int arr[] = {1000,500,100,50,20,10,5,2,1};

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a amount: ");
            int amount = scan.nextInt();

            for (int i = 0; i < arr.length; i++) {
                int note = amount / arr[i];
                amount = amount % arr[i];
                if(note == 0){
                    continue;
                }
                System.out.println(arr[i] + " " + note);
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }
}

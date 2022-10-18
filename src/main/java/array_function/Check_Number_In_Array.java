/* 1. Take input from a user and check if the number exists in the array. */

package array_function;

import java.util.Scanner;

public class Check_Number_In_Array {
    public static void main(String[] args) {
        try {
            int arr[] = {1,3,5,7,2,4,6,8};
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            int userInput = scan.nextInt();

            for (int i = 0; i < arr.length; i++) {
                if (userInput == arr[i]) {
                    System.out.println("Your number is at index " + i);
                }
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}

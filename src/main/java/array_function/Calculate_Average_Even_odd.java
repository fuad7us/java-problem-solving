/* 5. Take 5 numbers from users in an array. Then find out the average number,
   how many even and how many odd numbers using these functions:
   average(), countEvenNumbers(), countOddNumbers() */

package array_function;

import java.util.Scanner;

public class Calculate_Average_Even_odd {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the size of array: ");
            int number = scan.nextInt();
            int[] arr = new int[number];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }

            average(arr);
            countEvenNumbers(arr);
            countOddNumbers(arr);

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void average(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Averge is " + sum / arr.length);
    }

    public static void countEvenNumbers(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("Total " + count + " even numbers");
    }

    public static void countOddNumbers(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        System.out.println("Total " + count + " odd numbers");
    }

}

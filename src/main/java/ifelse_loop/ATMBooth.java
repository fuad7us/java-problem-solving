/* 4. Write a program to check your balance, deposit balance and withdraw balance from ATM booth. */

package ifelse_loop;

import java.util.Scanner;

public class ATMBooth {
    public static void main(String[] args) {
        try {
            int balance = 100000; // Initial balance
            int withdraw;
            int deposit;

            Scanner scan = new Scanner(System.in);

            System.out.println("***** ATM Booth *****");
            System.out.println("1. Choose 1 for withdraw");
            System.out.println("2. Choose 2 for deposit");
            System.out.println("3. Choose 3 for check balance");

            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Please enter money to be withdrawn: ");
                    withdraw = scan.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("You withdraw " + withdraw);
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    System.out.println("Now your balance is " + balance);
                    break;

                case 2:
                    System.out.println("Please enter money to be deposit: ");
                    deposit = scan.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println("Now your balance is " + balance);
                    break;

                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;

                default:
                    System.out.println("Please choose between 1 to 3");
                    break;
            }

        }catch (Exception e){
            System.out.println(e);
        }


    }
}

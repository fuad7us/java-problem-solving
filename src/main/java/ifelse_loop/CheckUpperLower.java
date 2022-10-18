/* 1. Write a program to check if inputted letter is small or capital */

package ifelse_loop;

import java.util.Scanner;

public class CheckUpperLower {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the character  ");
            char ch=scan.next().charAt(0);
            if(ch>='A' && ch<='Z'){
                System.out.println(ch+" is an uppercase letter");
            }
            else {
                System.out.println(ch+" is a lowercase letter");
            }
        }catch (Exception e){
            System.out.println("Please input an alphabet");
        }
    }
}


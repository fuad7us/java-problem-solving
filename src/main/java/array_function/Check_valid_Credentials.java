/* 6. Suppose a software system excepts valid credentials from user to logged in to the system. if the user
   inputs wrong password for 3 times, system will say that "Your user has been temporary locked". Let the
   username: admin, password: adm1n */

package array_function;

import java.util.Scanner;

public class Check_valid_Credentials {
    public static void main(String[] args) {
        try {
            String adminUser = "admin";
            String adminPass = "adm1n";
            int count = 0;

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your username: ");
            String username = scan.next();
            System.out.println("Please enter your password: ");


            while (count < 3){
                String password = scan.next();
                if (!password.equals(adminPass)) {
                    count++;
                    System.out.println("You've entered a password: ");
                }else {
                    System.out.println("Thank you. Login successfully");
                    break;
                }
            }

            if(count == 3){
                System.out.println("Your user has been temporary locked");
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}

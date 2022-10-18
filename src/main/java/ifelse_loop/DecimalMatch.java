/* 3. Input 2 decimal numbers. Check if they are both same or different up to two decimal places.  */

package ifelse_loop;

import java.util.Scanner;

public class DecimalMatch {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            System.out.print("Input floating-point number: ");
            double x = in.nextDouble();
            System.out.print("Input floating-point another number: ");
            double y = in.nextDouble();

            if (Math.abs(x - y) <= 0.01)
            {
                System.out.println("They are the same up to two decimal places");
            }
            else
            {
                System.out.println("They are different");
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}

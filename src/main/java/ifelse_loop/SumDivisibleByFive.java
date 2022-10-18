/* Write a program to sum of numbers which only divisible by 5 from 1 to 100. */

package ifelse_loop;

public class SumDivisibleByFive {
    public static void main(String[] args) {
        try {
            int sum = 0;
            int number = 100;
            for (int i = 0; i <= number; i++) {
                if (i % 5 == 0) {
                    sum += i;
                }
            }
            System.out.println("Total sum is " + sum);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

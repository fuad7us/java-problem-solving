/* 3. Suppose, in a company, here are some employee salaries in an array, [35000, 25000, 28000, 32500, 44000, 32800].
   Find out the 3rd highest salary */

package array_function;

import java.util.Arrays;

public class Find_Third_Highest_Salary {
    public static void main(String[] args) {
        try {
            int salary[] = {35000, 25000, 28000, 32500, 44000, 32800};
            int size = salary.length;
            Arrays.sort(salary);
            System.out.println("Sorted Array : " + Arrays.toString(salary)) ;
            int third_max = salary[size - 3];
            System.out.println("Third highest salary is " + third_max);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}

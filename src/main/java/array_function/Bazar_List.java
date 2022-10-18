/* 4. Create your todays bazar list/pocket expenditure which includes the item name and price.
   Then create a function named searchItem(String item) which will be used to search any item
   from your HashMap and return the price. If found no item, then print message as "No item found"
   and create another function named totalSum() which will return total price of items */

package array_function;

import java.util.HashMap;
import java.util.Scanner;

public class Bazar_List {
    public static void main(String[] args) {
        try {
            HashMap<String,Integer> bazar_list = new HashMap<>();
            bazar_list.put("Apple", 292);
            bazar_list.put("Orange", 350);
            bazar_list.put("Grapes", 470);
            bazar_list.put("Guava", 175);

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your item name: ");
            String userInput = scan.next();

            searchItem(bazar_list, userInput);
            System.out.println("Total sum " + totalSum(bazar_list));

        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void searchItem(HashMap<String, Integer> list, String item){
        if(list.containsKey(item)){
            int result = 0;
            result = list.get(item);
            System.out.println("Your Item " + item + " price is : " + result);
        }else {
            System.out.println("Item not found!");
        }
    }

    public static int totalSum(HashMap<String, Integer> list){
        int sum = 0;
        for(int val: list.values()){
            sum += val;
        }
        return sum;
    }
}

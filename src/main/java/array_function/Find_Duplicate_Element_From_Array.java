/* 7. Find the duplicate element in the given array. [1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5] */

package array_function;

import java.util.HashMap;

public class Find_Duplicate_Element_From_Array {
    public static void main(String[] args) {
       try {
           int array[] = {1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5};
           int c;
           HashMap<Integer,Integer> count = new HashMap<>();

           for(int i=0; i<array.length; i++){
               c = count.getOrDefault(array[i], 0);
               count.put(array[i], c+1);
           }

           System.out.print("Duplicates are: ");
           for(Integer num: count.keySet()){
               if(count.get(num)>1)
                   System.out.print(num+" ");
           }
       }catch (Exception e){
           System.out.println(e);
       }
    }
}

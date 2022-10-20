/* 4. Write a program that will give following output:
      Input: Chattogram
      Output: C8M */

package string_manipulation;

public class Generate_Short_Code_From_String {
    public static void main(String[] args) {
        try {
            String str = "Chattogram";
            String firstLetter = String.valueOf(str.charAt(0)).toUpperCase();
            String lsstLetter = String.valueOf(str.charAt(str.length() - 1)).toUpperCase();
            int count = str.length() - 2;
            System.out.println(firstLetter + Integer.toString(count) + lsstLetter);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

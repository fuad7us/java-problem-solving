/* 8. Write a program to convert each 1st char to uppercase from a string
      Input: rahim lives in sylhet
      Output: Rahim Lives in Sylhet */

package string_manipulation;

public class Capitalize_First_Letter {
    public static void main(String[] args) {
        try {
            String line = "dark side of the moon";
            String[] words = line.split(" ");
            String cap ="";
            for (int i = 0; i < words.length; i++) {
                cap += words[i].substring(0,1).toUpperCase() + words[i].substring(1) + " ";
            }
            System.out.println(cap);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

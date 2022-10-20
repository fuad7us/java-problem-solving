/* 6. Replace "R" from Rahim with "F" from the given String:
      Input: Ratul and Rahim live in Rangpur
      Output: Ratul and Fahim lives in Rangpur */

package string_manipulation;

import java.util.Arrays;

public class Replace_Letter_From_The_String {
    public static void main(String[] args) {
       try {
           String str = "Ratul and Rahim live in Rangpur";
           String[] words = str.split(" ");
           for (int i = 0; i < words.length; i++) {
               if(words[i].equals("Rahim")){
                   String rWord = words[i].substring(0,1).replace("R", "F") + words[i].substring(1);
                   words[i] = rWord;
               }
           }
           StringBuilder sb = new StringBuilder();
           for(String st : words){
               sb.append(" " + st);
           }

           str = sb.toString();
           System.out.println(str);

//        String replaceStr = str.replace("Rahim", "Fahim");
//        System.out.println(replaceStr);

       }catch (Exception e){
           System.out.println(e);
       }

    }
}

/* 5. Write a program that will count how many vowels in the given string:
      Input: "roadtosdet"
      Output: 4 */

package string_manipulation;

public class Count_Vowels {
    public static void main(String[] args) {
        try {
            String str = "roadtosdet";
            char[] ch = {'a', 'e', 'i', 'o', 'u'};
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < ch.length; j++) {
                    if(ch[j] == str.charAt(i)){
                        count++;
                    }
                }
            }
            System.out.println("There are " + count + " vowels in the string");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

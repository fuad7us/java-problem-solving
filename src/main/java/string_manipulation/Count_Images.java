/* 7. Find out how many images are in the given array:
      Input: ["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
      Output: 3 */

package string_manipulation;

public class Count_Images {
    public static void main(String[] args) {
        try {
            String[] images = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf",
                    "msoffice.exe", "photo3.jpg"};
            int count = 0;

            for (String str:images) {
                if (str.contains(".jpg") || str.contains(".png")){
                    count++;
                }
            }

            System.out.println("There are total " + count + " images");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

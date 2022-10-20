/* 1. Extract the transaction ID from the following HTML body
      Input:
      <html>
      <title>Test</title>
      <body>
      Your trnx is successful. Trnx Id is: TXN123456
      </body>
      </html> */

package string_manipulation;

public class Transaction_ID {
    public static void main(String[] args) {
        try {
            String htmlBody = "<html> + ' ' + <title> + ' ' + Test + ' ' + </title> + ' ' + <body> + ' ' + " +
                    "Your trnx is successful. + ' ' + Trnx Id is: TXN123456 + ' ' + </body> + ' ' + </html>";
            int findIndex = htmlBody.indexOf("TXN");
            System.out.println(htmlBody.substring(findIndex, 130));
        }catch (Exception e){
            System.out.println(e);
        }

    }
}

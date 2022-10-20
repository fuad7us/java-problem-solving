/* 2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee,
   then 400 tk will be discounted. After your purchase what will be your total cost? */

package string_manipulation;

public class Total_Cost {
    public static void main(String[] args) {
        try {
            String str = "Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee," +
                    "   then 400 tk will be discounted. After your purchase what will be your total cost?";

            str = str.replaceAll("[^\\d]", " ");
            str = str.trim();
            str = str.replaceAll(" + ", " ");
            String[] arr = str.split(" ");

            int shirtPrice = Integer.parseInt(arr[0]);
            int shareePrice = Integer.parseInt(arr[1]);
            int shirtQuantity = Integer.parseInt(arr[2]);
            int shareeQuantity = Integer.parseInt(arr[3]);
            int discount = Integer.parseInt(arr[4]);
            int totalPrice = 0;

            if (shirtQuantity == 2 && shareeQuantity == 1){
                totalPrice += (shirtPrice * shirtQuantity) + (shareePrice * shareeQuantity);
                totalPrice = totalPrice - discount;
            }

            System.out.println("Total price after 400tk discount is " + totalPrice);

        }catch (Exception e){
            System.out.println(e);
        }

    }
}

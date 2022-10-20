/* 3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price? */

package string_manipulation;

public class Discount_On_Purchase {
    public static void main(String[] args) {
        try {
            String str = "Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. " +
                    "What will be the purchase price?";
            str = str.replaceAll("[^\\d]"," ");
            str = str.trim();
            str = str.replaceAll(" + "," ");

            String[] arr = str.split(" ");

            int laptopPrice = Integer.parseInt(arr[1]);
            int discount = Integer.parseInt(arr[2]);
            discount = (laptopPrice * discount) / 100;
            int purchaseprice = laptopPrice - discount;

            System.out.println("After 10% discount, purchase price will be " + purchaseprice);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

# Java Problem Solving

## Technology and tool used
- Java
- Gradle
- IntelliJ IDEA

## Problems
 - Condition loop problem
 - Array & function problem
 - String Manipulation

# Condition loop problem
#### 01. Write a program to check if inputted letter is small or capital.
```
Scanner scan = new Scanner(System.in);
System.out.println("Enter the character  ");
char ch=scan.next().charAt(0);
if(ch>='A' && ch<='Z'){
   System.out.println(ch+" is an uppercase letter");
}
else {
   System.out.println(ch+" is a lowercase letter");
}
```
#### 02. Write a program of a guessing game
```
int randomValue = (int)(Math.random()*100);
System.out.println(randomValue);

for (int i =0; i <= 5; i++){
    Scanner input = new Scanner(System.in);
    int uservalue = input.nextInt();
    if (uservalue > randomValue){
        System.out.println("Your input " + uservalue + " is higher than the generated number");
    } else if(uservalue < randomValue){
        System.out.println("Your input " + + uservalue + " is lower than the generated number");
    } else {
        System.out.println("Great! " + uservalue + " is the correct number that match with generated number. ");
        break;
    }
}
```
#### 03. Input 2 decimal numbers. Check if they are both same or different up to two decimal places. 
```
Scanner in = new Scanner(System.in);
System.out.print("Input floating-point number: ");
double x = in.nextDouble();
System.out.print("Input floating-point another number: ");
double y = in.nextDouble();

if (Math.abs(x - y) <= 0.01)
{
    System.out.println("They are the same up to two decimal places");
}
else
{
    System.out.println("They are different");
}
```
#### 04. Write a program to check your balance, deposit balance and withdraw balance from ATM booth.
```
int balance = 100000; // Initial balance
    int withdraw;
    int deposit;

    Scanner scan = new Scanner(System.in);

    while(true){
        System.out.println("***** ATM Booth *****");
        System.out.println("1. Choose 1 for withdraw");
        System.out.println("2. Choose 2 for deposit");
        System.out.println("3. Choose 3 for check balance");
        System.out.println("4. Choose 4 to exit");

    int choice = scan.nextInt();
    switch (choice){
        case 1:
            System.out.println("Please enter money to be withdrawn: ");
            withdraw = scan.nextInt();
            if (balance >= withdraw) {
                balance = balance - withdraw;
                System.out.println("You withdraw " + withdraw);
            } else {
                System.out.println("Insufficient balance");
            }
            System.out.println("Now your balance is " + balance);
            break;

        case 2:
            System.out.println("Please enter money to be deposit: ");
            deposit = scan.nextInt();
            balance = balance + deposit;
            System.out.println("Your money has been successfully deposited");
            System.out.println("Now your balance is " + balance);
            break;

        case 3:
            System.out.println("Your current balance is: " + balance);
            break;

        case 4:
            System.exit(0);

        default:
            System.out.println("Please choose between 1 to 4");
            break;
    }
  }
```
#### 05. Write a program to sum of numbers which only divisible by 5 from 1 to 100.
```
int sum = 0;
int number = 100;
for (int i = 0; i <= number; i++) {
    if (i % 5 == 0) {
        sum += i;
    }
}
System.out.println("Total sum is " + sum);
```
#### 06. Write a program to find the factorial of a given number.
```
Scanner scan = new Scanner(System.in);
System.out.println("Please enter a number: ");
int userInput = scan.nextInt();
int fact = 1;
for (int i = 1; i <= userInput; i++) {
    fact *= i;
}
System.out.println(fact);
```
#### 07. Write a program to print prime numbers from 2 to n.
```
String primeNumbers = "";
Scanner scan = new Scanner(System.in);
System.out.println("Please enter a number: ");
int userInput = scan.nextInt();

for (int i = 1; i <= userInput; i++)
{
    int counter=0;
    for(int num =i; num>=1; num--)
    {
        if(i % num==0)
        {
            counter = counter + 1;
        }
    }
    if (counter ==2)
    {        
        primeNumbers = primeNumbers + i + " ";
    }
}
System.out.println("Prime numbers from 1 to " + userInput + " are :");
System.out.println(primeNumbers);
```
#### 08. Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the total points user achieved at the end of 10 cycle.
```
int rand1 = (int) (Math.random() * 20);
int rand2 = (int) (Math.random() * 20);
int point = 0;

Scanner scan = new Scanner(System.in);

for (int i = 0; i < 10; i++) {
    System.out.println("See you can guess the number between 0 to 20: ");
    int userInput = scan.nextInt();
    if (userInput == rand1 || userInput == rand2) {
        point += 1;
        System.out.println("You get 1 point");
    } else if (userInput > 20) {
        System.out.println("Please guess between 0 to 20");
    } else {
        System.out.println("You do not get any point");
    }
}
System.out.println("Your total point is : " + point);
```
#### 09. Write a program to sum of user input until users input ‘q’ from keyboard.
```
Scanner scan = new Scanner(System.in);
int sum = 0;
String choice = "";

while(!choice.equals("q")) {
    System.out.println("Please enter a number or quit to q");
    choice = scan.next();

    if (!choice.equals("q")){
        int userInput = Integer.parseInt(choice);
        sum += userInput;
    }
}
System.out.println("Total sum is :" + sum);
```
#### 10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.
```
int number = 0;
int max = 0;
int min = 0;
String choice = "";
Scanner scan = new Scanner(System.in);

while (!choice.equals("q")){
    System.out.println("Please enter a number or q to quit.");
    choice = scan.next();
    if (!choice.equals("q")){
        number = Integer.parseInt(choice);
        if(number > max){
            max = number;
        }else if(number < max){
            min = number;
        }
    }
}

System.out.println("The largest number is: " + max);
System.out.println("The smallest number is: " + min);
```

# Array & function problem

#### 1. Take input from a user and check if the number exists in the array.
```
try {
    int arr[] = {1,3,5,7,2,4,6,8};
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int userInput = scan.nextInt();

    for (int i = 0; i < arr.length; i++) {
        if (userInput == arr[i]) {
            System.out.println("Your number is at index " + i);
        }
    }

}catch (Exception e){
    System.out.println(e);
}
```
#### 2. Input an amount from the user and find out the number of notes from input amount in given array
[1000,500,100,50,20,10,5,2,1].
```
try {
    int arr[] = {1000,500,100,50,20,10,5,2,1};

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a amount: ");
    int amount = scan.nextInt();

    for (int i = 0; i < arr.length; i++) {
        int note = amount / arr[i];
        amount = amount % arr[i];
        if(note == 0){
            continue;
        }
        System.out.println(arr[i] + " " + note);
    }

}catch (Exception e){
    System.out.println(e);
}
```
#### 3. Suppose, in a company, here are some employee salaries in an array, [35000, 25000, 28000, 32500, 44000, 32800]. Find out the 3rd highest salary.
```
try {
    int salary[] = {35000, 25000, 28000, 32500, 44000, 32800};
    int size = salary.length;
    Arrays.sort(salary);
    System.out.println("Sorted Array : " + Arrays.toString(salary)) ;
    int third_max = salary[size - 3];
    System.out.println("Third highest salary is " + third_max);

}catch (Exception e){
    System.out.println(e);
}
```
#### 4. Create your todays bazar list/pocket expenditure which includes the item name and price. Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price. If found no item, then print message as "No item found" and create another function named totalSum() which will return total price of items.
```
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
```
#### 5. Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers().
```
public static void main(String[] args) {
    try {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int number = scan.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        average(arr);
        countEvenNumbers(arr);
        countOddNumbers(arr);

    }catch(Exception e){
        System.out.println(e);
    }
}

public static void average(int arr[]){
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    System.out.println("Averge is " + sum / arr.length);
}

public static void countEvenNumbers(int arr[]){
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] % 2 == 0){
            count++;
        }
    }
    System.out.println("Total " + count + " even numbers");
}

public static void countOddNumbers(int arr[]){
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] % 2 != 0){
            count++;
        }
    }
    System.out.println("Total " + count + " odd numbers");
}
```
#### 6. Suppose a software system excepts valid credentials from user to logged in to the system. if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked". Let the username: admin, password: adm1n
```
try {
    String adminUser = "admin";
    String adminPass = "adm1n";
    int count = 0;

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your username: ");
    String username = scan.next();
    System.out.println("Please enter your password: ");


    while (count < 3){
        String password = scan.next();
        if (!password.equals(adminPass)) {
            count++;
            System.out.println("You've entered a password: ");
        }else {
            System.out.println("Thank you. Login successfully");
            break;
        }
    }

    if(count == 3){
        System.out.println("Your user has been temporary locked");
    }

}catch (Exception e){
    System.out.println(e);
}
```
#### 7. Find the duplicate element in the given array. [1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5]
```
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
```
# String Manipulation
#### 1. Extract the transaction ID TXN123456 from the HTML body
```
String htmlBody = "<html> + ' ' + <title> + ' ' + Test + ' ' + </title> + ' ' + <body> + ' ' + " +
                    "Your trnx is successful. + ' ' + Trnx Id is: TXN123456 + ' ' + </body> + ' ' + </html>";
int findIndex = htmlBody.indexOf("TXN");
System.out.println(htmlBody.substring(findIndex, 130));

```
#### 2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?
```
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
```
#### 3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?
```
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
```
#### 4. Write a program that will give following output:
#### Input: Chattogram
#### Output: C8M
```
String str = "Chattogram";
String firstLetter = String.valueOf(str.charAt(0)).toUpperCase();
String lsstLetter = String.valueOf(str.charAt(str.length() - 1)).toUpperCase();
int count = str.length() - 2;
System.out.println(firstLetter + Integer.toString(count) + lsstLetter);
```
#### 5. Write a program that will count how many vowels in the given string
```
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
```
#### 6. Replace "R" from Rahim with "F" from the given String:
#### Input: Ratul and Rahim live in Rangpur
#### Output: Ratul and Fahim lives in Rangpur
```
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
```
#### 7. Find out how many images are in the given array
```
String[] images = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf",
                    "msoffice.exe", "photo3.jpg"};
int count = 0;

for (String str:images) {
    if (str.contains(".jpg") || str.contains(".png")){
        count++;
    }
}

System.out.println("There are total " + count + " images");
```
#### 8. Write a program to convert each 1st char to uppercase from a string
```
String line = "dark side of the moon";
String[] words = line.split(" ");
String cap ="";
for (int i = 0; i < words.length; i++) {
    cap += words[i].substring(0,1).toUpperCase() + words[i].substring(1) + " ";
}
System.out.println(cap);
```

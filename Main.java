import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); //to get user input

    System.out.println("Enter a string:");
    String str = scanner.nextLine();

    String reverseStr = "";
    int strLength = str.length();


    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
  }
}

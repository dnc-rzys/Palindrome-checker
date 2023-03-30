import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

    //to get user input
    Scanner scanner = new Scanner(System.in); 

    // get user input continuously
    while(true) { 
    System.out.println("Enter a string:");
    String str = scanner.nextLine();

    // while loop ends when there is no input 
    if(str.isEmpty()) {
        break;
    }

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
    // prints when there is no input therefore program will end
    System.out.println("Program ended.");
  }
}

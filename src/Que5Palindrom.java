import java.util.Scanner;

public class Que5Palindrom {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string for checking palindrome");
    String inputString = in.nextLine();
    System.out.println("is palindrom :"+palindrom(inputString));
  }
  
  public static boolean palindrom(String input) {
    String reverse = "";
    int length = input.length();
    for (int i = length - 1; i >= 0; i--)
       reverse = reverse + input.charAt(i);
    if (input.equals(reverse)) {
      return true;
    }
    else {
      return false;
    }
  }

}

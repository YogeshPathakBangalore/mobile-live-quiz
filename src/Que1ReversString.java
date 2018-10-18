import java.util.Scanner;

public class Que1ReversString {
  
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string");
    String inputString = in.nextLine();
    String reverse = reverse(inputString);
    System.out.println("Reverse of the string: \n" + reverse);
  }
  
  public static String reverse(String input) {
    String reverse = "";
    int length = input.length();
    for (int i = length - 1 ; i >= 0 ; i--)
       reverse = reverse + input.charAt(i);
    return reverse;
  }

}

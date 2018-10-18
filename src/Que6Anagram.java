import java.util.Arrays;
import java.util.Scanner;

public class Que6Anagram {

  private static final int NUMBER_OF_CHAR = 256;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter first string");
    String inputString1 = in.nextLine();
    System.out.println("enter second string");
    String inputString2 = in.nextLine();
    System.out.println("are both the strings anagram ? : " + anagram(inputString1, inputString2));

  }

  public static boolean anagram(String x, String y) {
    
    String s1 = x.replaceAll("\\s", "");  
    String s2 = y.replaceAll("\\s", "");  
    boolean status = true;  
    if (s1.length() != s2.length()) {  
        status = false;  
    } else {  
        char[] ArrayS1 = s1.toLowerCase().toCharArray();  
        char[] ArrayS2 = s2.toLowerCase().toCharArray();  
        Arrays.sort(ArrayS1);  
        Arrays.sort(ArrayS2);  
        status = Arrays.equals(ArrayS1, ArrayS2);  
    }  
    if (status) {  
        return true;
    } else {  
        return false;
    }  
    
  }


}

import java.util.Scanner;

public class Que2EvenOddNumbers {
  
  public static void main(String[] args) {
    
    System.out.println("Enter an integer to check if it is odd or even");
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    System.out.println("for "+x+" calling this.even(), returned:"+even(x));
    System.out.println("for "+x+" calling this.odd(), returned:"+odd(x));
    
  }
  
  public static boolean even(int input) {
    //method to check only even values 
    if (input % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
  
  public static boolean odd(int input) {
    //method to check only odd values 
    if (input % 2 == 0) {
      return false;
    } else {
      return true;
    }
  }
 

}

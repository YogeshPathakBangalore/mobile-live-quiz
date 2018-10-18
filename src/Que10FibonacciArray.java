import java.util.Arrays;
import java.util.Scanner;

public class Que10FibonacciArray {
  
  public static void main(String[] args) {
     System.out.println("enter a limit for fibonacci to generate");
     Scanner scan = new Scanner(System.in);
     int inputLimit = scan.nextInt();
     System.out.println("generated fibonacci series "+ Arrays.toString(fibonacci(inputLimit)));
  }
  
  public static int[] fibonacci(int limit) {
    int series[] = new int[limit];
    series[0] = 1;
    series[1] = 1;
    for(int i=2; i < limit; i++){
      series[i] = series[i-1] + series[i-2];
    }
    return series;
  }
  
}

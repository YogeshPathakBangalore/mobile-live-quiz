import java.util.Arrays;
import java.util.stream.IntStream;

public class Que11IncreaseAndDecreaseBetweenMinMax {
  
  public static void main(String[] args) {
    System.out.println("new position value:" +cycle(3,1,1,5));
    System.out.println("new position value:" +cycle(3,3,1,5));
    System.out.println("new position value:" +cycle(7,-2,3,7));
  }
  
  public static int cycle(int current,int imove, int start, int end) {
    int inputArray[] = IntStream.rangeClosed(start, end).toArray();
    System.out.println("given array : "+Arrays.toString(inputArray));
    int currentLoc = 0;
    int newIndex = 0;;
    for (int i = 0; i < inputArray.length; i++) {
      if(inputArray[i] == current) {
        currentLoc = i;
        newIndex = currentLoc + imove;
      }
    }
    if(newIndex >= inputArray.length) {
      if(newIndex == inputArray.length) {
        newIndex = 0;
      } else {
        newIndex = newIndex-inputArray.length-1;
      }
    }
    int indexValue = inputArray[newIndex];
    return indexValue ;
  }
}

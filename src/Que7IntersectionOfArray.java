import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que7IntersectionOfArray {
  
  
  public static void main(String args[]) {
    String inputArray1[] = {"a", "b", "c"};
    String inputArray2[] = {"b", "c", "d"};
    System.out.println("Intersection of the two arrays ::"+Arrays.toString(intersection(inputArray1, inputArray2)));
     
  }
   
   public static String[] intersection(String[] x, String[] y) {
     String outPutArray[] = new String[x.length] ;
     for(int i = 0; i<x.length; i++ ) {
       for(int j = 0; j<y.length; j++) {
          if(x[i]==y[j]) {
               outPutArray[i] = y[j];
          }
       }
    }
     //This section is used to remove the null values from the array which
     //is initialized with the input size 
    List<String> list = new ArrayList<String>();

     for(String s : outPutArray) {
        if(s != null && s.length() > 0) {
           list.add(s);
        }
     }
     
    return list.toArray(new String[list.size()]);
   }
}

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Que8DifferenceBtwTwoArray {

  public static void main(String[] args) throws java.lang.Exception {
    String[] inputArray1 = {"a", "b", "c"};
    String[] inputArray2 = {"b", "c", "d"};
    System.out.println("unique elements from both the array :"+Arrays.toString(difference(inputArray1, inputArray2)));
   
  }

  public static String[] difference(String[] x, String[] y) {
    List<String> list1 = Arrays.asList(x);
    List<String> list2 = Arrays.asList(y);
    // Prepare a union
    Set<String> union = new HashSet<String>(list1);
    union.addAll(list2);
    // Prepare an intersection
    Set<String> intersection = new HashSet<String>(list1);
    intersection.retainAll(list2);
    // Subtract the intersection from the union
    union.removeAll(intersection);
    // Print the result
    return union.stream().toArray(String[]::new);
  }

}

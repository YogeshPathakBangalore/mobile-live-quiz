
public class Que9BinarySearch {
  
  public static void main(String[] args) {
    
    String inputArray[] = {"a", "b", "c"};
    String findChar = "e";
    
    int result = search(inputArray,findChar); 
    System.out.println(result);
    
  }

  public static int search(String[] input, String match) { 
    int low = 0;
    int high = input.length - 1;
    int mid;

    while (low <= high) {
        mid = (low + high) / 2;

        if (input[mid].compareTo(match) < 0) {
            low = mid + 1;
        } else if (input[mid].compareTo(match) > 0) {
            high = mid - 1;
        } else {
            return mid;
        }
    }
    return -1;
  }
}

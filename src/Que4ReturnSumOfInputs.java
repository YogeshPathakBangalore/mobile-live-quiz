import java.util.Arrays;

import org.json.JSONException;
import org.json.JSONObject;

public class Que4ReturnSumOfInputs {
  
  public static void main(String[] args) throws JSONException {
    String a1 = "{\n" + 
        "  \"id\":\"a\",\n" + 
        "  \"val\":1\n" + 
        "}";
    String a2 = "{\n" + 
        "  \"id\":\"b\",\n" + 
        "  \"val\":2\n" + 
        "}";
    String a3 = "{\n" + 
        "  \"id\":\"c\",\n" + 
        "  \"val\":3\n" + 
        "}";
    Object[] elements = {a1,a2,a3};
    
    System.out.println("output total using method 1: "+total(elements));
    
  }
  
  public static int total(Object[] input) throws JSONException {
    int sum = 0;
    for (int i = 0; i < input.length ; i++) {
      JSONObject jObj = new JSONObject(input[i].toString());
       sum  = sum + jObj.getInt("val");
    }
    return sum;
  }

}

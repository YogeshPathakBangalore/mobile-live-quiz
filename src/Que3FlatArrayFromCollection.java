import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;

public class Que3FlatArrayFromCollection {
  
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
    
    System.out.println("one way of implementing by converting each Object to JSONObject");
    System.out.println("output values are :"+Arrays.toString(values(elements)));
    
    
    
    //another way of impl using KeyValueObjet
    Object[] keyValObjArray = new Object[4];
    keyValObjArray[0] = new KeyValueObject("a", 1);
    keyValObjArray[1] = new KeyValueObject("b", 2);
    keyValObjArray[2] = new KeyValueObject("c", 3);
    System.out.println("==========================");
    System.out.println("another way of implementing by creating a object class which holds id and val");
    System.out.println("output values are :"+Arrays.toString(values1(elements)));
    
    
  }
  
  //first way of impl
  public static int[] values(Object[] input) throws JSONException {
    int outputArray[] = new int[input.length];
    for (int i = 0; i < input.length ; i++) {
      JSONObject jObj = new JSONObject(input[i].toString());
       outputArray[i] = jObj.getInt("val");
    }
    return outputArray;
  }
  
  //Another way of impl
  public static int[] values1(Object[] input) throws JSONException {
    int outputArray[] = new int[input.length];
    for (int i = 0; i < input.length ; i++) {
      JSONObject jObj = new JSONObject(input[i].toString());
       outputArray[i] = jObj.getInt("val");
    }
    return outputArray;
  }
  
}

class KeyValueObject {
  String id;
  int val;
  KeyValueObject(String id,int val) {
    this.id = id;
    this.val = val;
  }
}

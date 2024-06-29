package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashMap {
    // LinkedHashMap also provides O(1) time complexity for basic operations.
    // LinkedHashMap maintains the insertion order.
    public static void main(String[] args) {
        Map<String,Integer> mpp = new LinkedHashMap<>();

        mpp.put("rohit", 264);
        mpp.put("rahul", 115);
        mpp.put("virat", 183);

        for(Map.Entry<String,Integer> it: mpp.entrySet()){
            System.out.println(it.getKey() + ":" + it.getValue());
        }
    }
}

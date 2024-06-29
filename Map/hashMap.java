package Map;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    // HashMap provides O(1) time complexity for basic operations.
    // HashMap does not maintain any order.
    public static void main(String[] args) {
        Map<Character,Integer> mpp = new HashMap<Character,Integer>();

        mpp.put('a', 100);
        mpp.put('b', 200);
        mpp.put('d', 300);
        mpp.put('c', 400);

        for(Map.Entry it: mpp.entrySet()){
            System.out.println(it.getKey() + ":" + it.getValue());
        }
    }
}

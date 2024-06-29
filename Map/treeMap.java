package Map;

import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    // TreeMap offers O(logN) time complexity for basic operations.
    // TreeMap maintains keys in a sorted order.
    public static void main(String[] args) {
        Map<String,Integer> mpp = new TreeMap<>();
        mpp.put("pant", 151);
        mpp.put("virat",183);
        mpp.put("shikhar", 124);
        mpp.put("rohit", 264);
        mpp.put("rahul", 131);

        for(Map.Entry<String,Integer> it: mpp.entrySet()){
            System.out.println(it.getKey() + ":" + it.getValue());
        }
    }
}

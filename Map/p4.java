package Map;

import java.util.HashMap;
import java.util.Map;

public class p4 {
    public static void main(String[] args) {
        Map<Integer,Integer> mpp = new HashMap<>();

        mpp.put(1, 111);
        mpp.put(2, 222);
        mpp.put(3, 333);

        for(Map.Entry it: mpp.entrySet()){
            System.out.println(it.getKey() + ":" + it.getValue());
        }
    }
}

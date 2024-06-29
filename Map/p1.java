package Map;

import java.util.HashMap;
import java.util.Map;

public class p1 {
    // A Map cannot contain duplicate keys
    public static void main(String[] args) {
        Map<Integer,String> mp1 = new HashMap<>();

        mp1.put(1, "G");
        mp1.put(2,"For");
        mp1.put(3,"Geeks");

        System.out.println(mp1);

        for(Map.Entry it: mp1.entrySet()){
            System.out.println(it.getKey()+":"+it.getValue());
        }
    }
}

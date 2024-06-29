package Map;

import java.util.HashMap;
import java.util.Map;

public class p3 {
    public static void main(String[] args) {
        Map<Integer,String> mpp = new HashMap<>();
        mpp.put(1, "a");
        mpp.put(2, "b");
        mpp.put(3, "c");
        mpp.put(4, "d");
        
        System.out.println("Initial map " + mpp);

        mpp.remove(3);

        System.out.println("Update map " + mpp);
    }
}

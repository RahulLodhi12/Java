package Map;

import java.util.HashMap;
import java.util.Map;

public class p2 {
    public static void main(String[] args) {
        Map<Integer,String> mp = new HashMap<>();

        mp.put(1,"Geeks");
        mp.put(2,"Geeks");
        mp.put(3, "Geeks");

        System.out.println("Initial Map " + mp);

        mp.put(2, "For");

        System.out.println("Updated Map " + mp);
    }
}

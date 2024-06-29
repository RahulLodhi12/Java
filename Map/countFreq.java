package Map;

import java.util.HashMap;
import java.util.Map;

public class countFreq {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;

        Map<Integer,Integer> mpp = new HashMap<>();

        for(int i=0;i<n;i++){
            if(mpp.containsKey(arr[i])){
                mpp.put(arr[i], mpp.get(arr[i])+1);
            }
            else{
                mpp.put(arr[i], 1);
            }
        }

        for(Map.Entry it: mpp.entrySet()){
            System.out.println(it.getKey() + ":" + it.getValue());
        }
    }
}

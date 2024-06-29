package List;

import java.util.List;
import java.util.Scanner;
import java.util.*;

public class p2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> l1 = new ArrayList<>();
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            int t = input.nextInt();
            l1.add(t);
        }
        
        System.out.println(l1);

        input.close();
    }
}

package List;

import java.util.ArrayList;
import java.util.List;

public class p1 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();

        //add or insert
        l1.add(1);
        l1.add(7);
        l1.add(2);
        l1.add(2);
        l1.add(4);
        l1.add(2);

        l1.add(1, 3);

        System.out.println(l1);

        //update
        l1.set(2,5);

        System.out.println(l1);

        //search
        System.out.println(l1.indexOf(2));
        System.out.println(l1.lastIndexOf(2));

        //remove
        List<String> l2 = new ArrayList<>();
        l2.add("Rahul");
        l2.add("Rohit");
        l2.add("Virat");
        l2.add("Gill");
        l2.add("Hardik");
        l2.add("Ishan");

        System.out.println(l2);

        //remove - by index
        l2.remove(0);

        System.out.println(l2);

        //remove - by object
        l2.remove("Virat");

        System.out.println(l2);

        //accessing element
        System.out.println(l2.get(0));
        System.out.println(l2.get(2));

        //check if an element present in list
        System.out.println(l2.contains("Rohit"));
    }
}

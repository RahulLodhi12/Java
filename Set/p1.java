package Set;

import java.util.HashSet;
import java.util.Set;

public class p1 {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();

        st.add(2);
        st.add(7);
        st.add(3);
        st.add(4);
        st.add(1);

        System.out.println(st);

//   Basic	      HashSet 	               HashMap 
// Implements 	Set interface 	           Map interface 
// Duplicates	     No 	              Yes duplicates values are allowed but no duplicate key is allowed 
// Speed	    slower than HashMap	      faster than HashSet because of hashing technique(x%10) has been used here.
// Null 	  Have a single null value 	   Single null key and any number of null values
// Insertion   Add() function              Put() function
// Data    data is stored as objects	   data is stored as key-value pair.
// Complexity	   O(n) 	                  O(1)
    }
}

package Functions;

/*
A halting condition in Java is a condition that determines when a recursive method should stop calling itself. 
Without a halting condition, a recursive method will continue to call itself indefinitely, resulting in a stack overflow error.
*/

public class Method_in_Recursion {

    public static int sum(int n){
        if(n==0) return 0; //base case

        return n + sum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}

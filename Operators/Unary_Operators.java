package Operators;

import java.util.Scanner;

public class Unary_Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println("Post-Increment : " + (n++));
        System.out.println("Pre-Increment : " + (++n));
        System.out.println("Post-Decrement : " + (n--));
        System.out.println("Pre-Decrement : " + (--n));

        boolean flag = true;
        System.out.println(!flag);

        in.close();
    }
}

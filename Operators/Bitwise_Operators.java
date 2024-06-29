package Operators;

import java.util.Scanner;

public class Bitwise_Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("a & b: "+ (a&b));
        System.out.println("a | b: "+ (a|b));
        System.out.println("a ^ b: "+(a^b));
        System.out.println("~a: "+(~a));
        System.out.println("a<<2: "+(a<<2));
        System.out.println("b>>1: "+(b>>1));

        in.close();
    }
}

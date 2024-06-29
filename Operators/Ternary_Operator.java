package Operators;

import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();

        System.out.println(a>b?"Greater":"Less");

        in.close();
    }
}

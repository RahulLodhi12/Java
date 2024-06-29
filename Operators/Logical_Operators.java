package Operators;

import java.util.Scanner;

public class Logical_Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean a = in.nextBoolean();
        boolean b = in.nextBoolean();

        System.out.println("a && b : "+ (a&&b));
        System.out.println("a || b : "+ (a||b));
        System.out.println("!a : "+ (!a));

        in.close();
    }
}

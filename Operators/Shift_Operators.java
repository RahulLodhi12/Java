package Operators;

import java.util.Scanner;

public class Shift_Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println("n<<1 : "+(n<<1));
        System.out.println("n>>2 : "+(n>>2));

        in.close();
    }
}

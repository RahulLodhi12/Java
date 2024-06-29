package Intro;

import java.util.Scanner;

public class Calculate_Simple_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int p=in.nextInt();
        float r=in.nextFloat();
        int t=in.nextInt();

        System.out.println((int)(p*r*t)/100);

        in.close();
    }
}

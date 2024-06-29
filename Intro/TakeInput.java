package Intro;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt(); //integer
        System.out.println(n);

        float f = input.nextFloat(); //float
        System.out.println(f);

        boolean flag = input.nextBoolean(); //boolean
        System.out.println(flag);

        String s = input.nextLine(); //string
        System.out.println(s);

        char c = input.next().charAt(0);  //character
        System.out.println(c);

        byte b = input.nextByte(); //byte
        System.out.println(b);

        input.close();
    }
}

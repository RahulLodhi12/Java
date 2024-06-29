package Operators;

import java.util.Scanner;

public class Assignment_Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println("n += 3 : " + (n+=3));
        System.out.println("n -= 2 : " + (n-=2));
        System.out.println("n *= 3 : " + (n*=3));
        System.out.println("n /= 3 : " + (n/=3));
        System.out.println("n %= 2 : " + (n%=2));
        System.out.println("n &= 0b1010 : " + (n&=0b1010));
        System.out.println("n |= 0b0101 : " + (n|=0b0101));
        System.out.println("n ^= 0b1100 : " + (n^=0b1100));
        System.out.println("n <<= 2 : " + (n<<=2));
        System.out.println("n >>= 3 : " + (n>>=3));

        in.close();
    }
}

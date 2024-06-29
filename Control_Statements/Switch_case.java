package Control_Statements;

import java.util.Scanner;

public class Switch_case{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num=in.nextInt();

        switch (num) {
            case 5:
                System.out.println("It is 5");
                break;
            
            case 10:
                System.out.println("It is 10");
                break;

            case 15:
                System.out.println("It is 15");
                break;

            case 20:
                System.out.println("It is 20");
                break;

            default:
                System.out.println("Default case");
                break;
        }

        in.close();
    }
}
package Intro;

// A local variable is a variable declared within a method, constructor, or block of code

public class Local_Variable {
    public static void main(String[] args) {
        int a=10;
        if(a>5){
            int b=10;
            a=a+b;
            System.out.println(a+" "+b);
        }
        // System.out.println(a+" "+b); -> error
    }
}

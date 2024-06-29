package Functions;

public class Method_Overloading {
    public static int plusMethod(int a, int b){
        return a+b;
    }

    public static double plusMethod(double x, double y){
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println(plusMethod(10,20));
        System.out.println(plusMethod(21.21313, 12.45313));
    }
}

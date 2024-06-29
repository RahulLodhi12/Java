package Functions;

public class Methods_Parameter {

    public static void myName(String name){
        System.out.println("Hello " + name);
    }

    public static String myString(String str){
        return "Hi, " + str;
    }

    public static int myNum(int n){
        return n;
    }

    public static void myNameAge(String name, int age){
        System.out.println(name + " is " + age);
    }

    public static void main(String[] args) {
        myName("Rahul");

        System.out.println(myString("Lodhi"));

        System.out.println(45);

        myNameAge("Rohit", 37);
    }
}

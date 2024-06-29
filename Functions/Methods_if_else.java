package Functions;

public class Methods_if_else {

    public static void checkAge(int age){
        if(age<18){
            System.out.println("Not old enough");
        }
        else{
            System.out.println("Old enough");
        }
    }

    public static void main(String[] args) {
        checkAge(17);
    }
}

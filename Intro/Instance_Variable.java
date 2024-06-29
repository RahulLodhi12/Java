package Intro;

// An instance variable in Java is a variable that is declared inside a class but outside of any method, constructor, or block.
// and accessible to all the constructors, methods, or blocks in the class.

public class Instance_Variable {
    private int num;
    public Instance_Variable(int var){ //constructor
        num=var;
    }
    public void display(){
        System.out.println(num);
    }
    public static void main(String[] args) {
        Instance_Variable obj = new Instance_Variable(10);
        obj.display();
    }
}

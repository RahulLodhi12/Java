package Intro;

// The static variable can be used to refer to the common property of all objects,
// for example, the company name of employees, college name of students, etc.
// It makes your program memory efficient (i.e., it saves memory).


// The static keyword is a non-access modifier that is used to declare variables, methods, blocks, and nested classes. 
// It is used to indicate that the particular member belongs to the class itself, rather than to an object of the class.
// This means that there is only one copy of the static member shared across all instances of the class.

class Student{
    int rollno;//instance variable  
    String name;  
    static String college ="ITS";//static variable  

    //constructor  
    Student(int r, String n){  
        rollno = r;  
        name = n;  
    }

    //method to display the values  
    public void display (){
        System.out.println(rollno+" "+name+" "+college);
    }
}

public class Static_Variable{
    public static void main(String[] args) {
        Student s1 = new Student(111,"Rahul");
        Student s2 = new Student(222,"Raju");
        
        s1.display();
        s2.display();
    }
}

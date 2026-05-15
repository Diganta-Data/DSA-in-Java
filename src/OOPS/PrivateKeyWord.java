package OOPS;

class Student{
    String name;
    private int rno;
    double cgpa;
     void print() {
        System.out.println(name + " " + cgpa + " " + rno);
        // in case private then
         // public void p(){
         // print();
         //} create a new function
    }
}

public class PrivateKeyWord {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.print();
        s1.cgpa =8.36;
        s1.name = "digha";
        s1.print();
    }
}

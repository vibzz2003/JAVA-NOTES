import java.util.*;
class Student{
    int sapid;
    String name;

    Student(int x, String y){
        this.sapid = x;
        this.name = y;
    }

    Student(Student temp){
        this.sapid = temp.sapid;
        this.name = temp.name;
    }

    void output(){
        System.out.printf("%d /n %s /n", sapid,name);
    }
}

public class Copyconstructor{
    public static void main(String args[]){
        Student obj = new Student(500093004,"Vibhor Minocha");
        obj.output();
        Student copy = new Student(obj);
        copy.sapid = 500093618;
        copy.name = "Aditya Sharma";
        copy.output();
        System.out.println(obj);
        System.out.println(copy);
        System.out.println(obj.hashCode());
        System.out.println(copy.hashCode());
    }
}
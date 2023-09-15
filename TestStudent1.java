class Student{
    int id;
    String name;
}
// initialising with reference variable//

class TestStudent1{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.id = 11;
        s1.name = "Vibhor";
        s2.id = 16;
        s2.name = "Ranya";

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}
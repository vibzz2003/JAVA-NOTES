class Student{
    int id;
    String name;
}
//the main is outside the class//
class TestStudent{
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
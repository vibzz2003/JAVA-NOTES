class Student{
    int rollno;
    String name;
    void insertData(int r, String n){
        rollno = r;
        name = n;
    }
}
// initialising by method//

void displayData(){
    System.out.println(rollno + " " + name);
} 

class TestStudent2{
    public static void main(String[] args){
        Student.s1 = new Student();
        Student.s2 = new Student();

        s1.insertData(11,"Vibhor");
        s2.insertData(16,"Ranya");
        s1.displayData();
        s2.displayData();
    }
}
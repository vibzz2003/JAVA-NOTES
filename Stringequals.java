public class Stringequals{
    public static void main(String args[]){
        String s1 = "SACHIN";
        String s2 = "SACHIN";
        String s3 = new String("Sachin");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
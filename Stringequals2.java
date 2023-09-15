public class Stringequals2{
    public static void main(String args[]){
        String s1 = "sachin";
        String s2 = "kochin";
        String s3 = new String("chuchu");
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
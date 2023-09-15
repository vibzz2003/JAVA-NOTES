public class String2{
    public static void main(String args[]){
        StringBuilder s1  = new StringBuilder("SACHIN");
        StringBuilder s2 = new StringBuilder("TENDULKAR");
        StringBuilder s = s1.append(s2);
        System.out.println(s.toString());
    }
}
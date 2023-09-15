import java.io.*;
public class Bitstuff{
        public static void main(String args[]) throws IOException{
            System.out.println("Enter the Binary Message :");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //BufferedReader class is used to read text from a character input stream

            String str = br.readLine();
            String newstr = new String();
            int counter = 0;
            for(int i=0; i<str.length();i++){
                if(str.charAt(i)!='1' && str.charAt(i) != '0'){
                    System.out.println("Enter only Binary values.");
                }
                if(str.charAt(i)=='1'){
                    counter++;
                    newstr = newstr + str.charAt(i);
                }
                else{
                    newstr = newstr + str.charAt(i);
                    counter = 0;
                }

                if(counter == 5){
                    newstr = newstr + '0';
                    counter  = 0;
                }
            }
        
            System.out.println("The encrypted string is:" + newstr);
        }
}
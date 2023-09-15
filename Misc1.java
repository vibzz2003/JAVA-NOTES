// METHOD OVERLOADING BY USING CHANGE IN ARGUMENTS//
class adder{
    static int add(int a, int b){
        return(a+b);
    }
    //we can also change data types of a,b,c and then also the code will run//
    //that would be the example of method overloading due to change in data type//
    static int add(int a, int b, int c){
        return (a+b+c);
    }
}

class Misc1{
    public static void main(String args[]){
        System.out.println(adder.add(11,11));
        System.out.println(adder.add(11,11,11));
    }
}
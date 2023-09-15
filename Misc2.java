//THIS IS AN EXAMPLE OF METHOD OVERLOADING//
class bank{
    int interest(){
        return 0;
    }
}
class Sbi extends bank{
    int interest(){
        return 8;
    }
}
class Hdfc extends bank{
    int interest(){
        return 7;
    }
}
class Icici extends bank{
    int interest(){
        return 10;
    }
}
class Misc2{
    public static void main(String args[]){
        Sbi s = new Sbi();
        Hdfc h = new Hdfc();
        Icici i = new Icici();
        System.out.println("SBI : " + s.interest());
        System.out.println("HDFC : " + h.interest());
        System.out.println("ICICI : " + i.interest());
    }
}

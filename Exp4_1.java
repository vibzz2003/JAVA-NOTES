class parent{
    private void add(){
        System.out.println("Add");
    };
}

class child extends parent{
    public static void main(String args[]){
    parent obj = new parent();
    obj.add();    
}
}
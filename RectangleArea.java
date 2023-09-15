class Rectangle{
    int length;
    int width;
    void insertData(int l,int w){
        length = l;
        width = w;
    }
    void displayData(){
        System.out.println(length * width);
    }
}

class RectangleArea{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.insertData(1,2);
        r2.insertData(2,3);
        r1.displayData();
        r2.displayData();
    }
}

public class aR {
    public static void main(String[] args) {
        rectanglearea r1= new rectanglearea();//instantiation of object
        r1.area(4, 5);
    }
}
class rectanglearea{
    void area(int l,int b){//function to calculate the area
        System.out.println(l*b);
    }
}
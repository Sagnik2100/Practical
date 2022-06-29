public class perimeterSqare {
    public static void main(String[] args) {
        perimeter s1= new perimeter();//creating an object of a square
        s1.calculate(44);
    }
}
class perimeter{
    void calculate(int a){//function to calculate the perimeter
        System.out.println(4*a);
    }
}
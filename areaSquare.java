public class areaSquare {
    public static void main(String[] args) {
        area s1= new area();//creating object of a square
        s1.calculate(44);//calling the fucntion to calculate the area
    }
}
class area{
    void calculate(int a){// function to calculate the area 
                System.out.println(a*a);
    }
}
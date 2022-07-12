package day8;

public class shape {
    void drawShape(){

    }
    public static void main(String[] args) {
        Circle c1= new Circle();
        c1.drawShape();
        Square s1= new Square();
        s1.drawShape();
        Triangle t1= new Triangle();
        t1.drawShape();
    }
    }
class Circle extends shape{
    void drawShape(){
        System.out.println("Circle");
    }
}
class Square extends shape{
    void drawShape(){
        System.out.println("Square");
    }
}
class Triangle extends shape{
    void drawShape(){
        System.out.println("Triangle");
    }
}
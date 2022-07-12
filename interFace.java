package day9;

public interface interFace {
    void print();
}
class Main implements interFace{
    void print(){
        System.out.println('Print');
    }
    public static void main(String[] args) {
        Main m1= new Main();
        m1.print();
    }
}
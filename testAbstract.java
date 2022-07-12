package day9;

abstract class testAbstract {
    testAbstract(){
        System.out.println("Abstract Class is Created");
    }
    abstract void run();
    void changeSpeed(){
        System.out.println("Speed Changed");
    }
}
class Child extends testAbstract{
    void run(){
        System.out.println("Running Safely");
    }
}
class testAbstraction{
    public static void main(String[] args) {
        testAbstract t1= new Child();
        t1.run();
    }
}
public class pR{
    public static void main(String[] args) {
        class1 r1= new class1();//initializing object to calculate perimeter
        r1.rectangle(12,22);// calling the function
    }
    
}
class class1{ 
    void rectangle(int l,int w){//function to calculate perimeter 
        System.out.println(2*(l+w));
    }
}
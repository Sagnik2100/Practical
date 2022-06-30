package day5;

public class defaultConstructor {
    String name;
	
	Defaultcons(){
		name= "non-para constructor";
	}
	public static void main(String[] args) {
		Defaultcons obj1 = new Defaultcons();
		
		System.out.println(obj1.name);
	}
}

package day6;

public class mehodOverloading {
    public static void main(String[] args) { // main method 
		
		//output
		System.out.println(Addition.add(5, 7)); // two arguments wala add method invoked
		System.out.println(Addition.add(5, 7, 9)); // three arguments wala add method invoked

	}
}
class Addition{
	static int add(int a ,int b) { //taking two arguments
		return a+b;
	}
	
	static int add(int a, int b, int c) { //taking three arguments but name is same
		return a+b+c;
	}
}
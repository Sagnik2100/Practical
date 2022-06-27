package day2;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
		
		//taking input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for checking odd or even number");
		int n = scan.nextInt();
		
		//logic
		if (n%2==0){
			System.out.println("The number is even");
		}else{
			System.out.println("The number is odd");
		}
	
    }
    
}

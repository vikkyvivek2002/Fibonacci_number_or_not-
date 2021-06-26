import java.util.*;
public class Fibonacci_number_or_not 
 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt(); 		
		int t1 = 0,t2 =1, sum =0;	
		while(sum < n) 
		{
			sum = t1+t2; 
			t1 = t2;
			t2 = sum;
		}
		if (sum == n)
			System.out.print("Fibonacci Number");
		else
			System.out.print("Not Fibonacci Number");
	} }

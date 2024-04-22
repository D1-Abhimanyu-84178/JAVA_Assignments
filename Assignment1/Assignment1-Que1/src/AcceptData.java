
import java.util.Scanner;

public class AcceptData {
public static void main(String[] args) {
	
	double value1;
	double value2;
	double average;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Value : ");
	if(sc.hasNextDouble()) {
	  value1 = sc.nextDouble();
	  System.out.println("Enter Second Value : ");
	
	  if(sc.hasNextDouble()) {
	    value2 = sc.nextDouble();  
	    average = (value1+value2)/2;
	    System.out.println("Average of Numbers is "+ average);
	  }	
	}
	else {
	System.out.println("Enter the values of type double");	
	}
	
}
}

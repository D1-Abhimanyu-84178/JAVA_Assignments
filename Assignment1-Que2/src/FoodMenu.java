import java.util.Scanner;

public class FoodMenu {

	public static void main(String[] args) {
		
	   double price = 0;
	   int choice;
	   int quantity;
	   int dosaAmt = 30;
	   int samosaAmt = 15;
	   int idliAmt = 15;
	   
	   Scanner sc = new Scanner(System.in);
	   do {
		System.out.println("Enter Your choice : ");
		
		System.out.println("1. Dosa");
		System.out.println("2. Samosa");
		System.out.println("3. Idli");
		System.out.println("0. Generate Bill");
		
		choice = sc.nextInt();
	    
		   switch(choice) {
		   
		   case 1:
			   System.out.println("enter quantity: ");
			   quantity =sc.nextInt();
			   price +=  dosaAmt*quantity;
			   break;
			   
		   case 2:
			   System.out.println("Enter quantity: ");
			   quantity = sc.nextInt();
			   price += samosaAmt*quantity;
			   break;
			   
		   case 3:
			   System.out.println("Enter quantity: ");
			   quantity = sc.nextInt();
			   price +=idliAmt*quantity;
			   break;
		   case 0:
			   System.out.println("Your total bill is: "+ price);
			   break;
		   }
	} while (choice!=0);
	}
}

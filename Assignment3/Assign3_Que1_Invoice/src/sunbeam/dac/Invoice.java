package sunbeam.dac;

import java.awt.PageAttributes.PrintQualityType;
import java.util.Scanner;

public class Invoice {

	String partNO;
	String partDesc;
	int quantityOfItem;
	double priceperItem;
	double invoiceAmount;
	
	Scanner sc = new Scanner(System.in);
	public Invoice() {
		partNO = " ";
		partDesc = " ";
		quantityOfItem = 0;
		priceperItem = 0;
		
	}
	
	public Invoice(String partNO, String partDesc, int quantityOfItem, double priceperItem) {
		this.partNO = partNO;
		this.partDesc = partDesc;
		this.quantityOfItem = quantityOfItem;
		this.priceperItem = priceperItem;
	}
		
	
	//Getters
   public String getPartNo() {
	return partNO;
	}
   String getPartDesc() {
	   return partDesc;
   }
   int getQuantityOfItem() {
	   return quantityOfItem;
   }
   double getpriceperItem() {
	   return priceperItem;
   }
   
   
   //setters
   
   public void setPartNO(String partNO) {
	   this.partNO = partNO;
   }
   
   public void setPartDesc(String partDesc) {
	   this.partDesc = partDesc;
   }
   
   public void setQuantityOfItem(int quantityOfItem) {
	   this.quantityOfItem = quantityOfItem;
   }
   
   public void setpriceperItem(double priceperItem) {
	   this.priceperItem = priceperItem;
   }
	
   public void acceptData() {
	   System.out.println("Enter the PartNO: ");
	   partNO = sc.nextLine();
	   System.out.println("Enter the Part Description: ");
	   partDesc = sc.nextLine();
	   System.out.println("Enter the Quatity of Item : ");
	   quantityOfItem = sc.nextInt();
	   if(quantityOfItem < 0)
		   quantityOfItem = 0;
	   System.out.println("Enter the price: ");
	   priceperItem = sc.nextInt();
	   if(priceperItem < 0)
		   priceperItem = 0; 
   }
   
  public double calculateInvoice() {
	  invoiceAmount = quantityOfItem * priceperItem;
	  
	  return invoiceAmount;
  }
  }

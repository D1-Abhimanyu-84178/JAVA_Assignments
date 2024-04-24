package sunbeam.dac;

public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoice invoice1 = new Invoice();
		invoice1.acceptData();
		double amt = invoice1.calculateInvoice();
		System.out.println("Total Invoice is : " + amt);
		
	}

}

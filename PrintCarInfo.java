package car;

public class PrintCarInfo {

	public static void main(String[] args) {
		Car car = new Car("Renault Duster", Colour.WHITE, 2012, 1.6);
		Customer customer = new Customer ("Ivanov Ivan", "Kyiv, Pobedy str., 88", "044-443-43-43");
		Purchase purchase = new Purchase ();
		car.printInfo();
		customer.printCustomerInfo();
		purchase.printPurchaseInfo();
	}
	
}

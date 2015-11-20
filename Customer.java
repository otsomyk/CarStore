package car;

public class Customer {
	private String name;
	private String adress;
	private String phone;

	public Customer(String name, String adress, String phone) {
		this.name = name;
		this.adress = adress;
		this.phone = phone;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void printCustomerInfo() {
		System.out.println("Name: " + this.name + "; Adress: " + this.adress
				+ "; Phone: " + this.phone);
	}

}

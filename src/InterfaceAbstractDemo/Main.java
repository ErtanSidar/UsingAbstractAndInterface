package InterfaceAbstractDemo;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		Customer customer= new Customer(1,"Ertan","Sidar","1997","123456789");
		customerManager.save(customer);
	}

}

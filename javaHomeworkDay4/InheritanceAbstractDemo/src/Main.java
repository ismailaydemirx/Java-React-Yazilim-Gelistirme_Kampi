
public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager =  new NeroCustomerManager();
		
		Customer customer = new Customer();
		
		customer.firstName="ismail";
		customer.lastName="aydemir";
		customer.id=1;
		customer.nationalId="12312312312";
		
		customerManager.add(customer);
		
		
	}

}

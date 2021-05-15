
public abstract class BaseCustomerManager extends CustomerManager{
	
	@Override
	public void add(Customer customer) {
		System.out.println("Saved to Base Database : " + customer.firstName);
	}

}

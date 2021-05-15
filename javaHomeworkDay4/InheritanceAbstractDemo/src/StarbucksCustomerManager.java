

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	ICustomerCheckService customerCheckService;
	
	public void StarbucksCustomerManager (ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
		
	}
	
	@Override
	public void add(Customer customer) {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.add(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
		
	}


	

}

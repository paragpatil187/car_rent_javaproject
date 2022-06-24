package rentcar;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Customer extends Person{
	
	
	private int bill;
	
	public Customer(int id, String aadhar, String name, String contact_no, int bill) {
		super(id, aadhar, name, contact_no);
		this.bill =bill;
	}
	
	
	
	public static ArrayList<Customer> searchByName(String name)
	{
		// code
	}
	
	public static Customer searchByAadhar(String aadhar)
	{
		// code
	}
	
	public static Customer searchByID(int id)
	{
		// code
	}
	
	

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> customerList = RentRunner.customerList ;
		if(customerList.isEmpty()) {
			this.id=1;
		}
		else {
			int last_id=customerList.get(customerList.size()-1).id;
			this.id=last_id;
		}
		customerList.add(this);
		File file=new File("Customer.txt");
		if(file.exists()== false) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		ArrayList<Customer> customerList = RentRunner.customerList ;
		for(int i=0;i<customerList.size();i++) {
			if(customerList.get(i).id==this.id) {
				customerList.remove(i);
			}
		}
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> customerList = RentRunner.customerList ;
		
		for(Customer c : customerList)
		{
			System.out.println(c);
		}
		
	}
	

}

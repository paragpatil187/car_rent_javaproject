package rentcar;

import java.util.ArrayList;

public class RentRunner {
	
	static ArrayList<Customer> customerList = new ArrayList<Customer>();
	 static ArrayList<CarOwner> carOwnerList = new ArrayList<CarOwner>();

	public static void main(String[] args) {
		Customer ramu = new Customer(1,"y","Ramu","Z",1);
		ramu.add();
		ramu.print();
	}

}

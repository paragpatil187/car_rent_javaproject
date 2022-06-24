package rentcar;
public abstract class Person {
	
	protected int id;
	protected String aadhar;
	protected String name;
	protected String contact_no;
	
	public Person(int id, String aadhar, String name, String contact_no) {
		this.id = id;
		this.aadhar = aadhar;
		this.name = name;
		this.contact_no = contact_no;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", aadhar=" + aadhar + ", name=" + name + ", contact_no=" + contact_no + "]";
	}
	
	public abstract void add();
	public abstract void update();
	public abstract void remove();
	public abstract void print();
	
	
	
	/**
	 * Valid Aadhar Card : 16 characters, only digits + unique
	 * @param : aadhar
	 * @return true if the aadhar is valid
	 */
	
	public static boolean isAadharValid(String aadhar)
	{
		boolean valid =true;
		if(aadhar.length()==16) {
			for(int i=0;i<aadhar.length();i++) {
				if(!Character.isDigit(aadhar.charAt(i))==false) {
					valid=false;
					break;
				}
			}
			
		}
		else {
			valid=false;
		}
		return valid;
		
	}
	
	/**
	 * Valid name : contain only letters and white spaces
	 * @param : name
	 * @return true if the name is valid
	 */
	
	public static boolean isNameValid(String name)
	{
		boolean valid =true;
		
			for(int i=0;i<name.length();i++) {
				if(Character.isLetter(name.charAt(i))==false) {
					valid=false;
					break;
				}
			}
			
		
		
		return valid;
	}
	
	
	/**
	 * Valid contact : contact number has 12 digits and starts with "91"
	 * @param : name
	 * @return true if the contact is valid
	 */
	
	public static boolean isContactValid(String contact)
	{
		boolean valid =true;
		if(contact.length()==12) {
			if(contact.substring(0,2).equals("91")) {
		for(int i=2;i<contact.length();i++) {
			
				if(Character.isDigit(contact.charAt(i))==false) {
					valid=false;
					break;
				}
			}
			
		}
			else {
				valid=false;
			}
		}
		else {
			valid=false;
		}
		return valid;
	}
	
	
	/**
	 * Valid ID : can only be digit greater than 0, unique
	 * @param : id
	 * @return true if the id is valid
	 */
	
	public static boolean isIDValid(int id)
	{
		boolean valid =true;
		String ID = Integer.toString(id);
		for(int i=0;i<ID.length();i++) {
			if(Character.isDigit(ID.charAt(i))==false) {
				valid=false;
				break;
			}
		}
		return valid;
		
		
	}
	
	

}

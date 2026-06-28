/**
 * Represents a Contact with required fields and verification rules
 */
public class Contact {
	
	private final String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	/**
	 * Constructs Contact object with verification
	 */
	
	public Contact(String id, String firstName, String lastName, String phoneNumber, String address) {
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
			throw new IllegalArgumentException("Invalid phoneNumber");
		}
		if (address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	/** @return contact ID */
	public String getId() {
		return id;
	}
	/** @return contact first name */
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		this.firstName = firstName;
	}
	/** @return contact last name */
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		this.lastName = lastName;
	}
	/** @return contact phone number */	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
			throw new IllegalArgumentException("Invalid phoneNumber");
		}
		this.phoneNumber = phoneNumber;
	}
	/** @return contact address */
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
	}

}

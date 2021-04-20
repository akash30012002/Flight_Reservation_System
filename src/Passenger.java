
public class Passenger {
	
	Contact contact;
	Address address;
	
	
	Passenger(String name, String phoneNumber, String email, String street, String city, String state){
		this.contact = new Contact(name, phoneNumber, email);
		this.address = new Address(street, city, state);
	}
	
	
	public String getAddress() {
		return address.sendAddress();
	}
	
	public String getContact() {
		return contact.sendContact();
	}
	
	public void setAddress(String street, String city, String state) {
		address.updateAddress(street, city, state);
	}
	
	public void setContact(String name, String phoneNumber, String email) {
		contact.updateContact(name, phoneNumber, email);
	}
	
	
}

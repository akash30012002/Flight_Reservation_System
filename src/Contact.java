
public class Contact {

	String name;
	String phoneNumber;
	String email;
	
	Contact(String name, String phoneNumber, String email){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String sendContact() {
		return "Name: " + this.name + ", Phone: " + this.phoneNumber + ", Email: " + this.email;
	}
	
	public void updateContact(String name, String phoneNumber, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
}


public class Address {

	String street;
	String city;
	String state;
	
	Address(String street, String city, String state){
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	public String sendAddress() {
		return "Street: " + this.street + ", City: " + this.state + ", State: " + this.state;
	}
	
	public void updateAddress(String street, String city, String state) {
		this.street = street;
		this.city = city;
		this.state = state;
	}
}

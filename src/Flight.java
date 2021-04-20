
public class Flight {

	String flightNo;
	String airline;
	int capacity;
	int seatsBooked;
	
	
	public Flight(String flightNo, String airline, int capacity, int seatsBooked) {
		this.flightNo = flightNo;
		this.airline = airline;
		this.capacity = capacity;
		this.seatsBooked = seatsBooked;
	}
	
	public String getFlightDetails() {
		return "Airline: " + this.airline + ", Flight No: " + this.flightNo;
	}
	
	public boolean checkAvailability() {
		return (this.seatsBooked < this.capacity) ? true : false; 
	}
	
	public void updateSeatsBooked() {
		this.seatsBooked++ ;
	}
	
}

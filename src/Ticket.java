
public class Ticket {

	String pnr;
	String source;
	String destination;
	Flight flight;
	String departureDateTime;
	String arrivalDateTime;
	Passenger passenger;
	String seatNo;
	float price;
	boolean isCancelled;
	
	
	public Ticket(String pnr, String source, String destination, Flight flight, String departureDateTime,
			String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean isCancelled) {

		this.pnr = pnr;
		this.source = source;
		this.destination = destination;
		this.flight = flight;
		this.departureDateTime = departureDateTime;
		this.arrivalDateTime = arrivalDateTime;
		this.passenger = passenger;
		this.seatNo = seatNo;
		this.price = price;
		this.isCancelled = isCancelled;
		
		if (flight.checkAvailability()) {
			System.out.println("Seat Booked");
			flight.updateSeatsBooked();
		}
		
		else {
			this.cancelTicket();
			System.out.println("The ticket cannot be booked as the flight is full");
		}
	}
	
	public String checkStatus() {
		String state = (this.isCancelled) ? "Cancelled" : "Confirmed";
		return state;
	}
	
	public float journeyDuration() {
		return 0.0f;
	}
	
	public void cancelTicket() {
		this.isCancelled = true;
	}
	
}

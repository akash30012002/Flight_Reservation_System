
public class Main {

	public static void main(String[] args) {
		
		Flight indigo320 = new Flight("A11","indigo",2,0);
		Passenger passenger = new Passenger("Akash", "26749372", "abc@gmail.com", "Sesame", "Mumbai", "Mah");
		
		Ticket ticket1 = new Ticket("abcd", "Delhi", "mumbai", indigo320, "1/1/2021 5:50",
				"1/1/2021 5:50", passenger, "A1", 5400, false);
		Ticket ticket2 = new Ticket("abcd", "Delhi", "mumbai", indigo320, "1/1/2021 5:50",
				"1/1/2021 5:50", passenger, "A1", 5400, false);
		Ticket ticket3 = new Ticket("abcd", "Delhi", "mumbai", indigo320, "1/1/2021 5:50",
				"1/1/2021 5:50", passenger, "A1", 5400, false);
		
		System.out.println(ticket1.getIsCancelled());
		System.out.println(ticket2.getIsCancelled());
		System.out.println(ticket3.getIsCancelled());
		
		System.out.println(indigo320.getSeatsBooked());
		System.out.println(indigo320.checkAvailability());
	}

}

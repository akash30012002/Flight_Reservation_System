
public class Main {

	public static void main(String[] args) {
		
		Flight indigo320 = new Flight("A11","indigo",2,0);
		Passenger passenger = new Passenger("Akash", "26749372", "abc@gmail.com", "Sesame", "Mumbai", "Mah");
		
		Regular ticket1 = new Regular("abcd", "Delhi", "mumbai", indigo320, "1/1/2021 5:50",
				"1/1/2021 5:50", passenger, "A1", 5400, false, "Food");
		Regular ticket2 = new Regular("abcd", "Delhi", "mumbai", indigo320, "1/1/2021 5:50",
				"1/1/2021 5:50", passenger, "A1", 5400, false, "Drink");
		Regular ticket3 = new Regular("abcd", "Delhi", "mumbai", indigo320, "1/1/2021 5:50",
				"1/1/2021 5:50", passenger, "A1", 5400, false, "Wifi");
		
		System.out.println(ticket1.getIsCancelled());
		System.out.println(ticket2.getIsCancelled());
		System.out.println(ticket3.getIsCancelled());
		
		System.out.println(indigo320.getSeatsBooked());
		System.out.println(indigo320.checkAvailability());
	}

}

package functionaltesting;

public @interface RestController {
	
	@RestController
	public class FlightController {

	    @GetMapping("/flights")
	    public List<Flight> getFlights(@RequestParam String date) {
	        // Logic to retrieve flights on the given date
	        return flightService.getFlightsByDate(date);
	    }

	    @GetMapping("/booked-seats")
	    public List<Seat> getBookedSeats(@RequestParam String flightId) {
	        // Logic to retrieve booked seats for a given flight
	        return seatService.getBookedSeats(flightId);
	    }
	}


}

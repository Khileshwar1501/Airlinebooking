package functionaltesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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




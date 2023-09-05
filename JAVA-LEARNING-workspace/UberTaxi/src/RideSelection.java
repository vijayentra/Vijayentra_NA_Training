public class RideSelection {
private User user;
    private Driver driver;
    private Ride ride;
    private Payment payment;

    public RideSelection(User user, Driver driver, Ride ride, Payment payment) {
        this.user = user;
        this.driver = driver;
        this.ride = ride;
        this.payment = payment;
    }

    public void confirmRide() {
        // Confirm the ride selection
        System.out.println("Ride confirmed!");
        this.ride.updateRideStatus("Confirmed");
        this.payment.processPayment();
    }
}


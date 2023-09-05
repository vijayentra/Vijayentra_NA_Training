public class Driver {

private String name;
    private String email;
    private String phone;
    private String password;
    private String location;
    private String carDetails;

    public Driver(String name, String email, String phone, String password, String location, String carDetails) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.location = location;
        this.carDetails = carDetails;
    }

    public void register() {
        // Register the driver
        System.out.println("Driver registered successfully!");
    }

    public void searchRide() {
        // Search for available rides
        System.out.println("Searching for available rides...");
    }

    public void selectRide() {
        // Select a ride
        System.out.println("Selecting a ride...");
    }
}

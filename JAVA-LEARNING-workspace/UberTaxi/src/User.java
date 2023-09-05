public class User {
private String name;
   private String email;
   private String phone;
   private String password;
   private String location;

   public User(String name, String email, String phone, String password, String location) {
       this.name = name;
       this.email = email;
       this.phone = phone;
       this.password = password;
       this.location = location;
   }

   public void register() {
       // Register the user
       System.out.println("User registered successfully!");
   }

   public void searchRide() {
       // Search for available rides
       System.out.println("Searching for available rides...");
   }

   public void selectRide() {
       // Select a ride
       System.out.println("Selecting a ride...");
   }

   public void payForRide() {
       // Pay for the ride
       System.out.println("Paying for the ride...");
   }
}

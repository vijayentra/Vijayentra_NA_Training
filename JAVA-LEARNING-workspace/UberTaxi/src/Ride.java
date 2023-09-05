public class Ride {
private int rideId;
   private String startLocation;
   private String endLocation;
   private float fare;
   private String rideStatus;
   private RideCategory rideCategory;

   public Ride(int rideId, String startLocation, String endLocation, float fare, String rideStatus, RideCategory rideCategory) {
       this.rideId = rideId;
       this.startLocation = startLocation;
       this.endLocation = endLocation;
       this.fare = fare;
       this.rideStatus = rideStatus;
       this.rideCategory = rideCategory;
   }

   public void getRideDetails() {
       // Get the ride details
       System.out.println("Ride Details: Ride ID - " + rideId + ", Start Location - " + startLocation + ", End Location - " + endLocation + ", Fare - " + fare + ", Status - " + rideStatus + ", Category - " + rideCategory.getCategoryName());
   }

   public void updateRideStatus(String newStatus) {
       // Update the ride status
       this.rideStatus = newStatus;
       System.out.println("Ride status updated to " + newStatus);
   }

}


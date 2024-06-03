public class Reservation4 {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    public Reservation4(int count, int capacity, boolean open) {
      if (count < 1 || count > 8) {
        System.out.println("Invalid reservation!");
      }
      guestCount = count;
          restaurantCapacity = capacity;
          isRestaurantOpen = open;
    }  
    
    public void confirmReservation() {
      if (restaurantCapacity >= guestCount && isRestaurantOpen) {
        System.out.println("Reservation confirmed");
        isConfirmed = true;
      } else {
        System.out.println("Reservation denied");
              isConfirmed = false;
      }
    }
    
    public void informUser() {
      if (!isConfirmed) {
        System.out.println("Unable to confirm reservation, please contact restaurant.");
      } else {
        System.out.println("Please enjoy your meal!");
      }
    }
    
    public static void main(String[] args) {
      // Create instances here
  
      // Test case 1: Valid reservation
          Reservation res1 = new Reservation(4, 20, true);
          res1.confirmReservation();
          res1.informUser();
  
          // Test case 2: Invalid reservation (guest count out of range)
          Reservation res2 = new Reservation(10, 20, true);
          res2.confirmReservation();
          res2.informUser();
  
          // Test case 3: Restaurant is closed
          Reservation res3 = new Reservation(4, 20, false);
          res3.confirmReservation();
          res3.informUser();
  
          // Test case 4: Not enough capacity
          Reservation res4 = new Reservation(5, 4, true);
          res4.confirmReservation();
          res4.informUser(); 
      
    }
  }

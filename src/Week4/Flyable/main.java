package Week4.Flyable;

public class main {
  public static void main(String... args) {
    Vehicle vehicle = new Vehicle();
    vehicle.fly(100);
    System.out.println(vehicle.distanceTaken);

    Flyable something = new Vehicle();
    Flyable.fly(200);
    System.out.println(((Vehicle)something).distanceTaken); //?????
  }

}

package Week4.Flyable;

public class Vehicle implements Flyable {

  public static int distanceTaken;
  String name;
  int age;
  boolean isFlying;

  public Vehicle() {
    distanceTaken = 0;
  }

  public static void fly(int meter) {
    distanceTaken+=meter;
  }

}

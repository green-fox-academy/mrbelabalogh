package Week4.CloneablePROPER;

public class CloneableMain {
  public static void main(String[] args) {
  John car = new John();
  car.move(100);
  System.out.println(car.distanceTaken);

  Cloneable something = new John();
  something.move(200);
  System.out.println(((John)something).distanceTaken);
}
}

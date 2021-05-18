package Week4.Garden;

public abstract class Plants {

  String type;
  String color;
  static int waterAmount;
  int waterMax;

  public Plants(String color, String type, int waterAmount) {
    this.color = color;
    this.type = type;
    this.waterAmount = waterAmount;

  }

  public void Plants(int waterAmount) {
    this.waterAmount = waterAmount;
  }


  public String needwater() {
    if (waterAmount >= waterMax) {
      System.out.println("The " + color + " " + " doesn't need water");
    } else {
      System.out.println("The " + color + " " + "need water");
    }

    return null;
  }





  public String setNeedsWater() {

    return null;
  }

  public abstract String getPlantType();

  public static double getAbsorbWater() {
    return 0;
  }

  public static int getWaterMax() {
    return 0;
  }


  public static void watering1(double amount) {
    System.out.println("Watering by " + amount);
    if (waterAmount < getWaterMax()) {
      waterAmount += amount * getAbsorbWater();
    }

  }

  public boolean needWater() {
    return waterAmount < getWaterMax();
  }

  public void moreWater() {
    if (waterAmount >= getWaterMax()) {

    }
  }
  public void watering2() {

  }
}

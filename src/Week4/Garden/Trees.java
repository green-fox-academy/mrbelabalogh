package Week4.Garden;

public class Trees extends Plants {

  public Trees(String color, String type, int waterAmount) {
    super(color, type, waterAmount);
  }

  @Override
  public String setNeedsWater() {
    if (waterAmount < 10) {
      return "needs water";
    }else {
      return("doesn't need water");
    }

  }

  @Override
  public String getPlantType() {
    return "tree";
  }


  public static double getAbsorbWater() {
    return 0.4d;
  }


  public static int getWaterMax() {
    return 10;
  }


  /*
  @Override
  public void watering1() {
    if (waterAmount < 10)
      waterAmount += 40;


  }

   */
}

package Week4.Garden;

public class Flowers extends Plants{

  public Flowers(String color, String type, int waterAmount) {
    super(color, type, waterAmount);
  }

  @Override
  public String setNeedsWater() {
    if (waterAmount < 5) {
      return "needs water";
    }else {
      return "doesn't need water";
    }
}

  @Override
  public String getPlantType() {
    return "flower";
  }


  public static double getAbsorbWater() {
    return 0.75d;
  }


  public static int getWaterMax() {
    return 10;
  }


  /*
  @Override
  public void watering1() {

    if (waterAmount < 5)
      waterAmount += 40;




  }

   */

}

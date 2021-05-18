package Week4.GardenAlternative;

public class Plant {
  protected String color;
  protected int maxWater;
  protected double waterAmount;
  protected double absorbRate;


  public Plant(String color, int maxWater, double waterAmount,
      double absorbRate) {
    this.color = color;
    this.maxWater = maxWater;
    this.waterAmount = waterAmount;
    this.absorbRate = absorbRate;
  }

  public void needwater(){
    if(waterAmount>= maxWater){
      System.out.println("The " + color + " " + " doesn't need water");
    }else {
      System.out.println("The " + color + " "  + "need water");
    }
  }

  public void water(double waterAmount) {
    if (this.waterAmount < maxWater) {
      this.waterAmount += absorbRate * waterAmount;
    }
  }
  public boolean ne() {
    return !(waterAmount >= maxWater);
  }
}


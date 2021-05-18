package Week4.GardenAlternative;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private List<Plant> plants;

  public Garden() {
      this.plants = new ArrayList<>();
    }
    public void water ( int waterAmount){
      if (waterAmount == 0) {
        System.out.println("Yeah mate, that's ain't gonna work");
        return;
      }
      System.out.println("Watering with " + waterAmount);

      double plantWater = (double) waterAmount / checkPlants();
      for (Plant plant : plants) {
        if (plant.ne()) {
          plant.water(plantWater);
        }
      }
      checkGarden();
    }

    public void checkGarden () {
      for (Plant plant : plants) {
        plant.needwater();
      }
      System.out.println();
    }

    private int checkPlants () {
      int sum = 0;
      for (Plant plant : plants) {
        if (plant.ne()) {
          sum++;
        }
      }
      return sum;
    }
  }



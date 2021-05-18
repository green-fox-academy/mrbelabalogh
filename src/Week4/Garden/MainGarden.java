package Week4.Garden;

import java.util.ArrayList;
import java.util.List;

public class MainGarden {
  public static void main(String[] args) {
    List<Plants> plantsList = new ArrayList<>();
    Flowers blueFlower =  new Flowers("blue", "flower", 0);
    plantsList.add(blueFlower);
    Flowers yellowFlower = new Flowers("yellow", "flower", 0);
    plantsList.add(yellowFlower);

    Trees purpleTree = new Trees("purple", "tree", 0);
    plantsList.add(purpleTree);
    Trees orangeTree = new Trees("orange", "tree", 0);
    plantsList.add(orangeTree);


    /*
    Plants plants1 = new Plants();
plants1.watering1(40);

     */
       Plants.watering1(40);

    for (Plants plants: plantsList) {

      System.out.println("The " + plants.color + " " + plants.type + " " + plants.needwater());

      plants.moreWater();

    }

  }

}

package Week4.AirCraftCarrier;


import Week4.GreenFoxOrganization.Cohort;
import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier {
  public static void main(String[] args) {
    int i = 0;
    List<AirCraft> airCraftList = new ArrayList<>();

    AirCraft F16 = new AirCraft("F16",8,30,0);
    airCraftList.add(F16);
    AirCraft F35 = new AirCraft("F35",12,50,0);
    airCraftList.add(F35);
    AirCraft F40 = new AirCraft("F40",25,40,0);
    airCraftList.add(F40);



    for (AirCraft aircraft : airCraftList) {
      aircraft.fight();


    }

    for (AirCraft aircraft: airCraftList) {
      aircraft.refillAmmo();
    }

    for (AirCraft aircraft: airCraftList) {
      aircraft.isPriority();
    }

    for (AirCraft aircraft: airCraftList) {
      aircraft.getType();
    }

    for (AirCraft aircraft: airCraftList) {
      aircraft.getStatus();
    }

    List<AirCraftCarrierClass> airCraftCarrierList = new ArrayList<>();

    AirCraftCarrierClass awesome = new AirCraftCarrierClass("AWESOME");
    awesome.fill();





    /*
    for (i = 0; i < airCraftList.size(); i++) {
      AirCraft s = airCraftList.get(i);
      s.fight();
  }

     */


      /*
    for (AirCraft airCraft : airCraftList) {
      airCraft.fight();
    }

       */

    AirCraftCarrierClass Carrier = new AirCraftCarrierClass("carrier");
    Carrier.add(F16);
    Carrier.add(F35);


  }
}

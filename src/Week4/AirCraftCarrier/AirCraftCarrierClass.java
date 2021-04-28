package Week4.AirCraftCarrier;

import Week4.GreenFoxOrganization.GreenFoxOrganization;
import java.util.ArrayList;
import java.util.List;

public class AirCraftCarrierClass extends AirCraft {
  String name;
  List<AirCraft> aircrafts;

  AirCraftCarrierClass (String name) {
    this.name = name;
    this.aircrafts = new ArrayList<>();
  }
  // Ez a pár sor külön String name miért kell, hogy működjön???



  public void add(Week4.AirCraftCarrier.AirCraft aircraft) {
    aircrafts.add(aircraft);

  };

  void fill() {

  };


  void fight() {};

  void getStatus() {};
}


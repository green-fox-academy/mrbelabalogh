package Week4.AirCraftCarrier;

import Week4.GreenFoxOrganization.GreenFoxOrganization;
import java.util.ArrayList;
import java.util.List;

public class AirCraftCarrierClass extends AirCraft {

  String name;
  List<AirCraft> aircrafts;


  AirCraftCarrierClass(String name) {
    this.name = name;
    this.aircrafts = new ArrayList<>();

  }

  AirCraftCarrierClass(int InitialAmmoStorage) {
    this.InitialAmmoStorage = 2300;
  }

  AirCraftCarrierClass(String type, int MaxAmmo, int BaseDamage, int AmmoStorage) {
    super(type, MaxAmmo, BaseDamage, AmmoStorage);
  }
  // Ez a pár sor külön String name miért kell, hogy működjön???


  public void add(Week4.AirCraftCarrier.AirCraft aircraft) {
    aircrafts.add(aircraft);

  }

  ;

  void fill() {
    //int airCraftCarrierAmmoStorageInitial = 2300;
    boolean priority;



    if (AmmoStorage == 0) {
      if (InitialAmmoStorage > MaxAmmo) {

        AmmoStorage = MaxAmmo;
        InitialAmmoStorage = InitialAmmoStorage - MaxAmmo;
      }
    }

    if (InitialAmmoStorage < MaxAmmo) {
      if (type == "F16") {
        priority = false;
        {

        }
        if (type == "F35") {
          priority = true;
          {
            AmmoStorage = MaxAmmo;
            InitialAmmoStorage = InitialAmmoStorage - MaxAmmo;
          }



        }
      }


    }
    System.out.println(InitialAmmoStorage);
  }
}

/*
  void fight() {};

  void getStatus() {};
}


 */

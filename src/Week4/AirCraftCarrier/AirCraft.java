package Week4.AirCraftCarrier;

public class AirCraft {

  public String type;
  public int MaxAmmo;
  public int BaseDamage;
  public int AmmoStorage;
  public int AllDamage = BaseDamage * MaxAmmo;
  public int InitialAmmoStorage;

  AirCraft(String type, int MaxAmmo, int BaseDamage, int AmmoStorage) {
    this.type = type;
    this.MaxAmmo = MaxAmmo;
    this.BaseDamage = BaseDamage;
    this.AmmoStorage = 0;
  }

  AirCraft() {

  }


/*
  AirCraft(int InitialAmmoStorage) {
    this.InitialAmmoStorage = 2300;

 */



  void fight() {

    //for (MaxAmmo = 0; AmmoStorage > MaxAmmo; MaxAmmo--) {
    int AllDamage = BaseDamage * MaxAmmo;

    System.out.println("Damage dealt: " + AllDamage);
  }


  void refillAmmo() {

    this.AmmoStorage = AmmoStorage;
    this.MaxAmmo = MaxAmmo;
    int RefilledAmmo = 300;
    System.out.println("Ammo refilled by 300.");
    int RemainingAmmo = RefilledAmmo - MaxAmmo;


    System.out.println("Unused Ammo: " + RemainingAmmo);
/*
    for (AmmoStorage=0; AmmoStorage < MaxAmmo;AmmoStorage++) {
      System.out.println(RemainingAmmo);

 */
  }

  //System.out.println("Hello,hello");

  void getStatus() {
    int AllDamage = BaseDamage * MaxAmmo;
    System.out.println(
        "Type: " + type + ", Ammo: " + MaxAmmo + ", Base Damage: " + BaseDamage + ", All Damage: "
            + AllDamage);

  }

//Type F35, Ammo: 10, Base Damage: 50, All Damage: 500

  void isPriority() {
    boolean priority;
    
    if (type == "F16") {
      priority = false;
      System.out.println(type+ " Priority: "+ priority);

    }
    if (type == "F35") {
      priority = true;
      System.out.println(type+ " Priority: " +priority);
    }

  }


  void getType() {
    System.out.println(type);
  }
}

package Week4.CloneablePROPER;

public class John implements Cloneable {

  public int distanceTaken;

  public John() {
    distanceTaken = 0;
  }

  @Override
  public void move(int meter) { distanceTaken += meter;
  }
}

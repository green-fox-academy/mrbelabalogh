package Week4.Cloneable;

public class ClonableMain {
  public static void main(String[] args)
      throws CloneNotSupportedException
    {
      johnTheClone t1 = new johnTheClone();
      t1.name = "John";
      t1.age = 20;
      t1.c.name = "John";
      t1.c.age = 40;

      johnTheClone t2 = (johnTheClone)t1.clone();
      t2.name = "Johnas";

      t2.c.name = "Johnas";


      System.out.println(t1.name + " " + t1.age + " " + t1.c.name
          + " " + t1.c.age);
      System.out.println(t2.name + " " + t2.age + " " + t2.c.name
          + " " + t2.c.age);



    }
  }


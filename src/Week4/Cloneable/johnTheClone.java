package Week4.Cloneable;

public class johnTheClone implements Cloneable {
  String name;
  int age;
  String gender;
  String previousOrganization;
  Student c = new Student();
  public Object clone() throws CloneNotSupportedException {
    return super.clone();

    }




  }


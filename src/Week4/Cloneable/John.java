package Week4.Cloneable;

public class John extends Student implements Cloneable{
  int x,y ;


  //constructor
  public John(String name, int Age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    skippedDays = 0;

  }
}

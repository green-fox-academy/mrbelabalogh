
package ClassesAndObjectsMatReview;

public class Student {

  public String name;
  public String className;
  public int age;

  Student(String nagy_dávid, String cosmo) {
    // Ez egy default constructor! Ez = 0!
  }


  Student(String name, String className, int age) {
    this.name = name;
    this.className = className;
    this.age = age;
    //Ez a constructor, és a felette lévő constructor nem ugyanaz!
    // 3 paraméteres, tehát 3 paramétert kell megadni majd lentebb, hogy
    //felismerje a progi, hogy erről a Constructorról van szó!
  }

  Student(String name, int age) {
    this.name = name;
    this.age = age;
    className = "Default";
    // Ez 2 paraméteres
  }

  public Student() {

  }


  void introduceYourself() {
    System.out.println("Hello my name is " + name + "and I'm " + age + "years old");
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age <= 0) {
      throw new IllegalArgumentException();
    }
    this.age = age;

  }
}



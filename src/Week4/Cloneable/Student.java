package Week4.Cloneable;

public class Student extends Person {

  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;


  Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  Student() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "School of Life";
    this.skippedDays = 0;
  }




  void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization
        + " who skipped " + skippedDays + " days from the course already.");

  }

  void getGoal() {
    System.out.println("Be a Junior Software Developer.");
  }

  void skipDays(int skippedDays) {

  }





  }


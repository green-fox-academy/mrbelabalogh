package Week4.GreenFoxOrganization;

public class Mentor extends Person {


  String level;

  Mentor(String name, int age, String gender, String level) {
    super (name, age, gender);
    this.level = level;
  }

  Mentor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    level = "intermediate";
  }


  void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + level + " mentor.");
  }

  void getGoal() {
    System.out.println("Educate brilliant Junior Software Developers");
  }
}















  /*
  Create a Mentor class that has the same fields and methods as the Person class, and has the following additional


    fields:
    level: the level of the mentor (junior / intermediate / senior)
    methods:
    getGoal(): prints "Educate brilliant junior software developers."
    introduce(): prints "Hi, I'm name, a age year old gender level mentor."
    The Mentor class has the following constructors:

    Mentor(name, age, gender, level)
    Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate

   */
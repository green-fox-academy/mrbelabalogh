package Week4.Cloneable;

public class Person {
  String name;
  int age;
  String gender;

  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  Person() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }




  void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender);
  }

  void getGoal() {
    System.out.println("Live for the moment!");
  }









}

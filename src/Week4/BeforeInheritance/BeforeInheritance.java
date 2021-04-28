package Week4.BeforeInheritance;

import java.util.ArrayList;

public class BeforeInheritance {

  public static void main(String[] args) {

    ArrayList<Person> people = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    Person mark = new Person("Mark", 46, "male");
    people.add(mark);
    Person jane = new Person();
    people.add(jane);
    Student john = new Student("John Doe", 20, "male", "BME");
    students.add(john);
    Student student = new Student();
    students.add(student);

    student.skipDays(3);

    for (Person person : people) {
      person.introduce();
      person.getGoal();
    }

    for (Student person : students) {
      person.introduce();
      person.getGoal();
    }


  }
}

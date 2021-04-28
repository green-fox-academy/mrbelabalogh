package Week4.GreenFoxOrganization;

import Week4.GreenFoxOrganization.Person;
import Week4.GreenFoxOrganization.Student;
import Week4.GreenFoxOrganization.Cohort;
import Week4.GreenFoxOrganization.Mentor;

import java.util.ArrayList;

public class GreenFoxOrganization {
  public static void main(String[] args) {

    ArrayList<Person> people = new ArrayList<>();

    Person mark = new Person("Mark", 46, "male");
    people.add(mark);
    Person jane = new Person();
    people.add(jane);
    Student john = new Student("John Doe", 20, "male", "BME");
    people.add(john);
    Student student = new Student();
    people.add(student);
    Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
    people.add(gandhi);
    Mentor mentor = new Mentor();
    people.add(mentor);

    student.skipDays(3);

    for (Person person : people) {
      person.introduce();
      person.getGoal();
    }


    Cohort awesome = new Cohort("AWESOME");
    awesome.addStudent(student);
    awesome.addStudent(john);
    awesome.addMentor(mentor);
    awesome.addMentor(gandhi);
    awesome.info();


  }
}

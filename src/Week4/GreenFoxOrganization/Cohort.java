

package Week4.GreenFoxOrganization;

import java.util.ArrayList;
import java.util.List;

public class Cohort extends Person {
  String name;
  List<Student> students;
  List<Mentor> mentors;

  Cohort(String name) {
    this.name = name;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }

  /*
  List <students> studentsList = new ArrayList<>();

   */
  /*
  String students;
  String mentors; Nem stringet hozunk létre, hanem ArrayList-et neki!

   */





  /*


  addStudent(Student): adds the given Student to students list
  addMentor(Mentor): adds the given Mentor to mentors list
  info(): prints "The name cohort has students.size() students and mentors.size() mentors."
  The Cohort


 */
  public void addStudent(Week4.GreenFoxOrganization.Student student) {
    students.add(student);
  }


  public void addMentor(Week4.GreenFoxOrganization.Mentor mentor) {
    mentors.add(mentor);

  }

  public void info() {
    System.out.println("The " + String.valueOf(name) + " cohort has " + students.size() + " students and " + mentors.size() + " mentors."

    );
  }
/*


  };
  */
}





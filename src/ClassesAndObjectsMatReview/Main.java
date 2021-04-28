

package ClassesAndObjectsMatReview;


import java.util.ArrayList;

public class Main {

//Rendszerben lévő diákok adatainak megtek
//Diákok listája
//
//

  public static void main(String[] args) {
    int i = 0;

  Student alexStudent = new Student();
  alexStudent.name = "Teper Alex";
  alexStudent.className = "TIDBIT";
  alexStudent.age = 25;




    System.out.println(alexStudent.age); //?? Befejezni

    Student erikStudent = new Student ("Bíró Erik", "TIDBIT", 25);
        Student davidStudent = new Student ("Nagy Dávid", "COSMO", 27);

    ArrayList<Student> studentList = new ArrayList<>();
    studentList.add(alexStudent);
    studentList.add(davidStudent);

    for (i = 0; i < studentList.size(); i++) {
      Student s = studentList.get(i);
      s.introduceYourself();
    }

    for (i = 0; i < studentList.size(); i++) {
      Student s = studentList.get(i);
      s.getAge();
    }
  }
  }


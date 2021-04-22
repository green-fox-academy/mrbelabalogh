package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListIntroductionOne {
  public static void main(String[] args) {
    List<String> contacts = new ArrayList<>();

    System.out.println(contacts.size());

    contacts.add(new String("William"));
  System.out.println(contacts.isEmpty());

  contacts.add(new String("John"));
  contacts.add(new String("Amanda"));

  System.out.println(contacts.size());
  System.out.println(contacts.get(2));

  contacts.remove(1);

  /*
  contacts.listIterator()

  HOW DOES THE ITERATOR WORK???
   */






  /*
  if {
        contacts.size() = 0;
      System.out.println("Empty");
      }
      else {

      }

      else contacts.size() > 0;
      System.out.println("Not Empty");
*/

  }
}


     // Create an ArrayList object
package com.company;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookExercise {
  public static void main(String[] args) {

    Map<String, String> phoneBook = new HashMap<>();

    String[] inputadat = {
        "James;06303456465",
        "Angela;0615042846",
        "Ollie;0653506721",
    };

    for (int i = 0; i < inputadat.length; i++) {
      String[] data = inputadat[i].split(";");

      /* CONVERTING STRING TO INTEGER!

      phoneBook.put(data[1], Integer.valueOf(data[0]));
      phoneBook.put(data[1], Integer.valueOf(data[0]));

      // integer típusú változóban eltárol egy számot a változóban
      //int i = (int) 5.5f;
      // double d = 5;
       */

      phoneBook.put(data[1], (data[0]));
      phoneBook.put(data[1], (data[0]));
    }

    System.out.println(phoneBook);



  }
}

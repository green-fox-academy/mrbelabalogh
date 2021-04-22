package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapIntroductionOne {
  public static void main(String[] args) {


    Map<Integer, String> MapIntroduction = new HashMap<>();
    System.out.println(MapIntroduction.isEmpty());

    MapIntroduction.put(97, "a");
    MapIntroduction.put(98, "b");
    MapIntroduction.put(99, "c");
    MapIntroduction.put(65, "A");
    MapIntroduction.put(66, "B");
    MapIntroduction.put(67, "C");

    System.out.println(MapIntroduction.keySet());

    System.out.println(MapIntroduction);

    MapIntroduction.put(68, "D");

    System.out.println(MapIntroduction.size());

    System.out.println(MapIntroduction.get(99));

    MapIntroduction.remove(97);

    System.out.println(MapIntroduction.containsKey(100));

    MapIntroduction.remove(97);
    MapIntroduction.remove(98);
    MapIntroduction.remove(99);
    MapIntroduction.remove(65);
    MapIntroduction.remove(66);
    MapIntroduction.remove(67);
    MapIntroduction.remove(68);
    // Remove all the key-value pairs --> Correct?






  }
}

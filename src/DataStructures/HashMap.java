package DataStructures;

import java.util.Map;

public class HashMap {
  public static void main(String[] args) {
    Map<String, String> myMap = new java.util.HashMap<>();

    //ISBN számhoz könyv címét rendelni --> ennél HashMap hasznos
  // key is unique! (Overwrite!)
    // Value is not unique

    //Adding elements
    myMap.put("citrom", "sarga" + " és " + "zold");
    myMap.put("alma", "sarga");

    System.out.println(myMap);

    for (Map.Entry< String, String> entry: myMap.entrySet()) {
      System.out.println(entry);
    }

    //Retrieve an element
    System.out.println(myMap);
    // Value irányából nem lehet lekérni!

    //Update a value in an element
    myMap.put("alma", "");
        //vagy:
    myMap.replace("alma", "sarga");

    System.out.println(myMap);

    // Remove an element
    myMap.remove("alma");

    // Print out only a key
    System.out.println(myMap.keySet());


    //Map<String, Map>String, ArrayList<int[]>>>
    // Don't do this!!! Too complicated!



  }


  }



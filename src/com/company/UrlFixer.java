package com.company;

public class UrlFixer {
  public static void main(String... args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";
    System.out.println("Wrong url: " + url);


    String fixedurl = url.replace("bots","odds");
    System.out.println("After replacing" + ":");
    System.out.println(fixedurl);

    StringBuilder fixedurl2 = new StringBuilder(fixedurl);


      fixedurl2.insert(5, ":");

      System.out.println("After insertion: ");
      System.out.println(fixedurl2.toString());




    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crucial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!






  }
}

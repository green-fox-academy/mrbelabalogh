package String;


import java.util.Arrays;

public class StringMatReview {



public static void main(String[] args) {

   // .split()
    String s13 = "alma";
    s13.split(";"); //delimiter (elválasztó karakter)
    System.out.println(Arrays.toString(s13.split(";")));
    System.out.println(Arrays.toString(s13.split(";")));

    //String sentence = "Get the last character of the longest word"
//???? befejezni

    /*
    String s = "asd";
    String[] stringArray = {"a", "b", "c"};
    stringArray[0].length();

    System.out.println(s.length());
    System.out.println(stringArray.length);
    System.out.println(stringArray[0].length());


     */

    /* .substring()

    String longString = "this is a longer string";
    longString = longString.substring(4);

    System.out.println(longString.substring(3));
    System.out.println(longString.substring(3, 8));

     */

    /* .replace()
    String s3 = "alma";
    String s4 = s3.replace("a", "b");
    System.out.println(s4);
    System.out.println(s3.replace("al", "la"));

 */


    /* .charAt()
    String s5 = "alma";
    System.out.println(s5.charAt('0')); //' ' -t kell használni!

     */



    /* .toUpperCase() és .toLowerCase()

    String s6 = "Alma";
    System.out.println(s6.toLowerCase());
    System.out.println(s6.toUpperCase());
    //Ha csak egy részét akarjuk kicsibe tenni, akkor substringet és
    //lowercase-t kell használni együtt!
    System.out.println(s6.substring(2).toUpperCase().contains("a"));
    //Erre már azért nem mehet több metódus, mert a contains már boolean
    //művelet, és nem String. Akkor újra stringé kell tenni, akkor már lehetne.


     */


/* .contains()

    String s9 = "alma";
    System.out.println(s9.contains("a"));
    boolean b1 = s9.contains("a");
    System.out.println(s9.contains("b"));
    boolean b2 = s9.contains("b");

 */

    /* .endWith()
       .startsWith()

    String s10 = "alma";
    System.out.println(s10.endsWith("a"));
    System.out.println(s10.endsWith("ma"));
    System.out.println(s10.endsWith("lma"));
    System.out.println(s10.endsWith("alma"));
    System.out.println(s10.startsWith("alma"));

     */


    /* .indexOf()
    String s11 = "alma";
    System.out.println(s11.indexOf('a'));
    //if (s11.indexOf('b') >= 0 ) { --> EZT HELYETTESÍTI AZ .indexOf()

     */


    /* .LastIndexOf()
        String s12 = "Alma";
        System.out.println(s12.LastIndexOf('a'));

     */

        /* .split()
    String s13 = "alma";
    s13.split("1"); //delimiter (elválasztó karakter)
    System.out.println(Arrays.toString(s13.split(";")));
    System.out.println(Arrays.toString(s13.split(";"))); ???

         */

    /* .equals

    String s14 = "alma";
    String s15 = "alma";
    System.out.println(s14 == s15);
    System.out.println(s14.equals(s15));

     */

    /* .compareTo()
    String s16 = "aaalma";
    String s17 = "aaakorte";
    System.out.println(s16.compareTo(s17));
    System.out.println(s16.compareTo(s16));

    System.out.println(s17.compareTo(s16));

     */

  /*
// stringbuilder: hozzáíráshoz és beleíráshoz, gyorsabb, kevesebb
  // helyet foglal, mintha stringeket adnánk hozzá egyenként
  StringBuilder sb = new StringBuilder();
  sb.append("a").append("b");
  sb.append("c");
  System.out.println(sb.toString());

   */

}
}
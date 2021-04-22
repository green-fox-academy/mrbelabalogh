package Pokemony;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class PokemonProject {

  public static void main(String[] args) {
    System.out.println("Pokemon Project");

    List<String> Pokemons = new ArrayList<>();

    Pokemons.add(0, "Pikachu");
    Pokemons.add(1, "Squirtle");
    Pokemons.add(2, "Bulbasaur");
    Pokemons.add(3, "Charmander");
    Pokemons.add(4, "Charizard");

    /* Elements:
    Pikachu: Electric
    Squirtle: Water
    Bulbasaur: Grass
    Charmander: Fire
    Charizard: Fire
     */

    String[] Elements = {"Electric", "Water", "Grass", "Fire", "Fire"};
    String[] WeakAgainstElements = {"Water", "Electric", "Fire", "Water", "Water"};

    /*
    System.out.println(Pokemons.get(0));
    System.out.println(Elements[0]);
    System.out.println(WeakAgainstElements[0]);
     */

  /* Println: List all Pokemon name and index+1 with FOR
    Println: Please select a pokemon from 1 to 5
    Println: Pikachu is weak against water (for example: Squirtle) WITH FOR BASED ON INDEX


     */

    System.out.println("Please select a Pokemon from Index 1 to 5");

    for (int i = 0; i < 5; i++) {
      System.out.println(i + 1 + " " + Pokemons.get(i));
    }

    Scanner pokemoninput = new Scanner(System.in);
    String userInput1 = pokemoninput.nextLine();

    int userInput2;
    userInput2 = Integer.valueOf(userInput1);
    userInput2 = userInput2 - 1;

    System.out.println(Pokemons.get(userInput2) + " is weak against " +
        WeakAgainstElements[userInput2]);








    /*


     */

























  }
}

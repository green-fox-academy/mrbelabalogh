package CardsProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;



public class Tarot {

  public static void main(String[] args) {
    double count = 0;
    //int count_old = 0;
    int i = 0;
    double RandomNumber = Math.random() * 4;
    int TheActualCard = (int) RandomNumber;

    int[] DrawnCards = new int[4];
    RandomNumber = Math.random() * 4;

    List<String> TarotCards = new ArrayList<>();

    TarotCards.add(0, "Child card");
    TarotCards.add(1, "Love card");
    TarotCards.add(2, "UnexpectedVisit card");
    TarotCards.add(3, "Death card");

    for (i = 0; i < TarotCards.size(); i++) {
      System.out.println("Please press Enter, to draw a card from the Tarot cards deck!");

      Scanner DrawTarotCard = new Scanner(System.in);
      String userInput1 = DrawTarotCard.nextLine();

      for (int j = 0; j < TarotCards.size(); j++) {
        for (int k = 0; k < DrawnCards.length; k++) {
          if (
              DrawnCards[k] == TheActualCard) {
            RandomNumber = Math.random() * 4;
            TheActualCard = (int) RandomNumber;
            j = 0;
          }
        }
      }

      System.out.println(TarotCards.get(TheActualCard));
      DrawnCards[i] = TheActualCard;
      if (i == 3) {
        break;
      }

      //A már kihúzott kártyák Listája (Integer lehet
      // csak, int nem!!

    }

    }


  }



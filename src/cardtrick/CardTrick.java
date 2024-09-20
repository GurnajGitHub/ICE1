/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author GurnajKaur
 * @studentid 991759929
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Random random = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);  
            c.setSuit(Card.SUITS[random.nextInt(4)]);  
            magicHand[i] = c;  
         }
            Scanner scanner = new Scanner(System.in);
 
         System.out.println("Pick a card of your choice\n1 for Ace, \n2 for Jack, \n3 for Queen, \n4 for King -> ");
         int userValue = scanner.nextInt();
         
         System.out.println("Pick a suit of your choice \nHearts, Diamonds, Spades, Clubs: ");
         String userSuit = scanner.next();
         
         
         Card userCard = new Card();
         userCard.setValue(userValue);
         userCard.setSuit(userSuit);
 
         
         boolean found = false;
         for (Card card : magicHand) {
             if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                 found = true;
                 break;
             }
         }
 
         
         if (found) {
             System.out.println("Congrats! Your card is in  magic hand.");
         } else {
             System.out.println("Sorry, your card is not in 1 magic hand.");
         }
 
        
         System.out.println("\nThe magic hand contains:");
         for (Card card : magicHand) {
             System.out.println(card.getValue() + " of " + card.getSuit());
         }
     }
 }
 
           
    
    

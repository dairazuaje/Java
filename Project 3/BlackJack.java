/* Dair Azuaje
 * CMSC 255-02
 * Project 2, BlackJack.java
 */

/**********************************************************************************************************************
  *  BlackJack class
***********************************************************************************************************************
* Function:
*   User will play a simplified version of blackjack
* ---------------------------------------------------------------------------------------------------------------------
*   @author Dair Azuaje
*   @version 03/2/2018  CMSC 255 Section 2 Spring of 2018
**********************************************************************************************************************/ 

import java.util.Scanner;

public class BlackJack 
{ //Begin BlackJack class
  
 /**********************************************************************************************************************
   * PrintHeading Method
   * -------------------------------------------------------------------------------------------------------------------
   * Function:
   *   Prints heading to console
   * ******************************************************************************************************************/
  
   public static void PrintHeading()
 { //Begin PrintHeading
    System.out.println("<Dair Azuaje>");
    System.out.println("<CMSC 255-002>");
    System.out.println("<BlackJack.java>");
    System.out.println("<Project 3>");
  } // End PrintHeading
   
/**********************************************************************************************************************
  * Main Method
  * -------------------------------------------------------------------------------------------------------------------
  * Function:
  *   User will play a simplified version of blackjack against the dealer.
  *   Either player wins if they reach 21, the other busts, or if one has a higher card total than the other below 21
**********************************************************************************************************************/
   
  public static void main (String[] args)
  
  { //Begin main
    
/*---------------------------------------------------------------------------------------------------------------------
 * Call PrintHeading Method to print out heading
 *-------------------------------------------------------------------------------------------------------------------*/  
    
    PrintHeading();
    
/*---------------------------------------------------------------------------------------------------------------------
 * Declare Variables:
 * playGame - Will take input from user to determine if game will be played
 * playerCard1 - Random number will be generated and stored as 1st card
 * playerCard2 - Random number will be generated and stored as 2nd card
 * playerCardTotal - Total of all cards drawn by the user
 * playerHit - Will determine if program will hit for user
 * dealerCard1 - Random number will be generated and stored as 1st card
 * dealerCard2 - Random number will be generated and stored as 2nd card
 * dealerCardTotal - Total of all cards drawn by the dealer
 * dealerHit - Will determine if program will hit for dealer
 * userInput - Will determine if playerHit is true or false based on input from the user
 * playerDraw - Draws random card for player upon hit
 * dealerDraw - Draws random card for dealer upon hit
 * ------------------------------------------------------------------------------------------------------------------*/
    
    System.out.println();
    System.out.println("Welcome to Dair's BlackJack game!");
    Scanner in = new Scanner(System.in);
    
/*---------------------------------------------------------------------------------------------------------------------
 * Ask user if they want to play game
 * ------------------------------------------------------------------------------------------------------------------*/
    
    System.out.print("Would you like to play? (yes or no)");
    String playGame = in.next(); //Will take input from user to determine if game will be played 
    
/**********************************************************************************************************************
  * DO WHILE (playGame is equal to yes)
  *   Generate random number for playerCard1 and playerCard2
  *   Find total of player cards
  *   Generate random number for dealerCard1 and dealerCard2
  *   Find total of dealer cards
  *   Tell player what they've drawn and card total
  *   Tell player what card dealer has
  *   Prompt user if they would like to hit or stay
  * 
  *   IF (userInput equals hit) THEN
  *     set playerHit to true
  *   ELSE 
  *     set playerHit to false
  *   END IF
  * 
  *   DO WHILE (playerHit equals true)
  *     Draw new card for user
  *     Add new card to player card total
  *     Tell player new card total 
  * 
  *       IF (playerCardTotal > 21) THEN
  *         set dealerHit to false
  *         Tell user they have lost
  *         Thank user for playing and prompt if they would like to play again
  *         break;
  *       END IF
  * 
  *     Prompt player if they would like to hit or stay
  *     
  *       IF (userInput equals stay) THEN
  *         set playerHit to false
  *         break;
  *       END IF
  * 
  *   END DO
  * 
  *   IF (dealerCardTotal < 21 && playerCardTotal < 21) THEN
  *     Set dealerHit to true
  *     Tell user it is now the dealer's turn
  *     Tell user the dealer's hidden card
  *     Tell user the dealer's card total
  *   ELSE
  *     Set dealerHit to false
  *   END IF
  * 
  *   DO WHILE (dealerHit equals true && playerCardTotal < 21)  
  * 
  *     IF (dealerCardTotal > 21) THEN   
  *       Tell user dealer busts, you win!
  *       Tell user Thank you for playing and prompt if they would like to play again
  *       break;
  *     ELSE IF (dealerCardTotal < 17)
  *       Tell user dealer chooses to hit
  *       Set dealerHit to true
  *     ELSE
  *       Set dealerHit to false;
  *       Tell user dealer chooses to stay
  *       break; 
  *     END IF
  *           
  *    Draw new card for dealer
  *    Tell user what dealer has drawn
  *    Tell user new dealerCardTotal
  * 
  *   END DO
  * 
  *   IF (dealerCardTotal > playerCardTotal && dealerCardTotal <= 21) THEN
  *     Tell user dealer wins because his total was higher and less than 21
  *     Prompt user if they would like to play again
  *   END IF
  * 
  *   IF (playerCardTotal > dealerCardTotal && dealerCardTotal <= 21 && playerCardTotal <= 21) THEN
  *     Tell user that they win because their total is higher and less than 21
  *   END IF
  * 
  *   IF (dealerCardTotal equals playerCardTotal) THEN
  *     Tell user they have tied and that the dealer wins
  *     Prompt user if they would like to play again
  *   END IF
  * 
  * END DO
  *  
  ********************************************************************************************************************/
    while (playGame.equals("yes"))
    { //Begin while
/*---------------------------------------------------------------------------------------------------------------------
 * Generator for cards and calculations for player card totals
 * ------------------------------------------------------------------------------------------------------------------*/
      
      int playerCard1 = 2 + (int)(Math.random() * ((11-2)+1)); //Random number will be generated and stored as 1st card
      int playerCard2 = 2 + (int)(Math.random() * ((11-2)+1)); //Random number will be generated and stored as 2nd card
      int playerCardTotal = playerCard1 + playerCard2; // Total of all cards drawn by the user
      boolean playerHit; //Will determine if program will hit for user
      
/*---------------------------------------------------------------------------------------------------------------------
 * Generator for cards and calculations for dealer card totals
 * ------------------------------------------------------------------------------------------------------------------*/
       
      int dealerCard1 = 2 + (int)(Math.random() * ((11-2)+1)); //Random number will be generated and stored as 1st card
      int dealerCard2 = 2 + (int)(Math.random() * ((11-2)+1)); //Random number will be generated and stored as 2nd card
      int dealerCardTotal = dealerCard1 + dealerCard2; //Total of all cards drawn by the dealer
      boolean dealerHit; //Will determine if program will hit for dealer
      
      System.out.println("You drew a " + playerCard1 + " and a " + playerCard2); //Tell user what they have drawn
      System.out.println();
      System.out.println("Your total is " + playerCardTotal); //Tell user their total
      
      System.out.println();
      
      System.out.println("The dealer has a " + dealerCard1 + " and a hidden card"); //Tell user 1st card dealer drew
      System.out.println("His total is hidden, too");
      
      System.out.println();
      
      System.out.print("Would you like to hit or stay?"); //Prompt player to hit or stay
      String userInput = in.next(); //Will determine if playerHit is true or false based on input from the user
      
/**********************************************************************************************************************
  * IF (userInput equals hit) THEN
  *   set playerHit to true
  * ELSE 
  *   set playerHit to false
  * END IF
  ********************************************************************************************************************/
/*---------------------------------------------------------------------------------------------------------------------
 * Determine if program should hit or stay for user
 * ------------------------------------------------------------------------------------------------------------------*/
     
      if (userInput.equals("hit")) 
      { ///Begin if
        playerHit = true;
      } //End if
      else 
      { //Begin else
        playerHit = false;
      } //End else
      
/**********************************************************************************************************************
  *  DO WHILE (playerHit equals true)
  *     Draw new card for user
  *     Add new card to player card total
  *     Tell player new card total 
  * 
  *       IF (playerCardTotal > 21) THEN
  *         set dealerHit to false
  *         Tell user they have lost
  *         Thank user for playing and prompt if they would like to play again
  *         break;
  *       END IF
  * 
  *     Prompt player if they would like to hit or stay
  *     
  *       IF (userInput equals stay) THEN
  *         set playerHit to false
  *         break;
  *       END IF
  *   END DO
  * ******************************************************************************************************************/
/*---------------------------------------------------------------------------------------------------------------------
 * Hit, draw cards for player, and calculate playerCardTotal
 * ------------------------------------------------------------------------------------------------------------------*/
      
      while (playerHit == true)
      { //Begin while
        int playerDraw = 2 + (int)(Math.random() * ((11-2)+1)); //Random card is drawn
        System.out.println("You drew a " + playerDraw); //Tell user what they drew
        playerCardTotal = playerCardTotal + playerDraw; //Total is updated with new drawn card
        System.out.println("Your total is " + playerCardTotal); //Tell user their new total
        System.out.println();
        
/**********************************************************************************************************************
  * IF (playerCardTotal > 21) THEN
  *   set dealerHit to false
  *   Tell user they have lost
  *   Thank user for playing and prompt if they would like to play again
  *   break;
  * END IF
  * ******************************************************************************************************************/
       
        if (playerCardTotal > 21) 
        { //Begin if
          dealerHit = false;
          System.out.println("YOU LOSE"); 
          System.out.print("Thank you for playing. Would you like to play again? (yes or no) :");
          playGame = in.next();
          break;
        } //End if
        
/*---------------------------------------------------------------------------------------------------------------------
 * Determine if user will hit or stay
 * ------------------------------------------------------------------------------------------------------------------*/
        
        System.out.print("Would you like to hit or stay?"); //Prompt for hit or stay
        userInput = in.next();
 
/**********************************************************************************************************************
  * IF (userInput equals stay) THEN
  *   set playerHit to false
  *   break;
  * END IF
  * ******************************************************************************************************************/
      
        if (userInput.equals("stay"))
        { //Begin if
          playerHit = false;
          break;
        } //End if
        
      } //End while
      
/**********************************************************************************************************************
  * IF (dealerCardTotal < 21 && playerCardTotal < 21) THEN
  *   Set dealerHit to true
  *   Tell user it is now the dealer's turn
  *   Tell user the dealer's hidden card
  *   Tell user the dealer's card total
  * ELSE
  *   Set dealerHit to false
  * END IF
  * ******************************************************************************************************************/
      
      if (dealerCardTotal < 21 && playerCardTotal < 21)
      { //Begin if
        dealerHit = true;
        System.out.println("It is now the dealer's turn");
        System.out.println("The dealer's hidden card was a " + dealerCard2);
        System.out.println("His total is now " + dealerCardTotal);
        System.out.println();
      } //End if
      else
      { //Begin else
        dealerHit = false;
      } //End else
      
/**********************************************************************************************************************
  * DO WHILE (dealerHit equals true && playerCardTotal < 21)  
  * 
  *     IF (dealerCardTotal > 21) THEN   
  *       Tell user dealer busts, you win!
  *       Tell user Thank you for playing and prompt if they would like to play again
  *       break;
  *     ELSE IF (dealerCardTotal < 17)
  *       Tell user dealer chooses to hit
  *       Set dealerHit to true
  *     ELSE
  *       Set dealerHit to false;
  *       Tell user dealer chooses to stay
  *       break; 
  *     END IF
  *           
  *    Draw new card for dealer
  *    Tell user what dealer has drawn
  *    Tell user new dealerCardTotal
  * 
  * END DO
  ********************************************************************************************************************/
     
      while (dealerHit == true && playerCardTotal < 21)
      { //Begin while  

 /**********************************************************************************************************************
  * IF (dealerCardTotal > 21) THEN   
  *   Tell user dealer busts, you win!
  *   Tell user Thank you for playing and prompt if they would like to play again
  *   break;
  * ELSE IF (dealerCardTotal < 17)
  *   Tell user dealer chooses to hit
  *   Set dealerHit to true
  * ELSE
  *   Set dealerHit to false;
  *   Tell user dealer chooses to stay
  *   break; 
  * END IF
  ********************************************************************************************************************/       
        
        if (dealerCardTotal > 21)
        { //Begin if
          System.out.println("Dealer busts, you win!"); //Tell user they lose
          System.out.print("Thank you for playing. Would you like to play again? (yes or no) :"); //Prompt user to play
          playGame = in.next();
          break;
        } //End if
        else if (dealerCardTotal < 17)
        { //Begin else if
          System.out.println("Dealer chooses to hit");
          dealerHit = true;
        } //End else if
        else
        { //Begin else
          dealerHit = false;
          System.out.println("Dealer chooses to stay");
          break; 
        } //End else 
        
/*---------------------------------------------------------------------------------------------------------------------
 * Draw random card for dealer and calculate new dealer total
 * Output to user
 * ------------------------------------------------------------------------------------------------------------------*/
       
        int dealerDraw = 2 + (int)(Math.random() * ((11-2)+1)); //Random card is drawn
        System.out.println("Dealer has drawn a " + dealerDraw);
        dealerCardTotal = dealerCardTotal + dealerDraw; 
        System.out.println("His total is now " + dealerCardTotal); 
        System.out.println();
      } //End while
      
 /*********************************************************************************************************************
   * IF (dealerCardTotal > playerCardTotal && dealerCardTotal <= 21) THEN
   *   Tell user dealer wins because his total was higher and less than 21
   *   Prompt user if they would like to play again
   * END IF
   * *****************************************************************************************************************/
     
      if (dealerCardTotal > playerCardTotal && dealerCardTotal <= 21 && playerCardTotal <= 21)
      { //Begin if
        System.out.println("Sorry, dealer wins because his total was higher than yours and less than 21");
        System.out.print("Thank you for playing. Would you like to play again? (yes or no) :");
        playGame = in.next();
      } //End if
      
/**********************************************************************************************************************
  * IF (playerCardTotal > dealerCardTotal && dealerCardTotal <= 21 && playerCardTotal <= 21) THEN
  *   Tell user that they win because their total is higher and less than 21
  * END IF
  * ******************************************************************************************************************/
     
      if (playerCardTotal > dealerCardTotal && dealerCardTotal <= 21 && playerCardTotal <= 21) 
      { //Begin if
        System.out.println("Your total is higher than the dealer and less than 21, you win!");
      } //End if
   
 /*********************************************************************************************************************
   * IF (dealerCardTotal equals playerCardTotal) THEN
   *   Tell user they have tied and that the dealer wins
   *   Prompt user if they would like to play again
   * END IF
   * *****************************************************************************************************************/
      
      if (dealerCardTotal == playerCardTotal) 
      { //Begin if
        System.out.println("You and the dealer have tied, dealer wins");
        System.out.print("Thank you for playing. Would you like to play again? (yes or no) :");
        playGame = in.next();
      } //End if
      
    } // End while
      
  } // End Main
  
} //End Class

/* Dair Azuaje
 * CMSC 255-002
 * Project 2, JellyBeans.java
 */
 
/***********************************************************************************************************************
  *    JellyBeans Class
  **********************************************************************************************************************
  * Function:
  *    Based on user input of jelly bean size, diameter and jar size, program will calculate number of jelly beans that 
  *    can fit in the given jar
  *---------------------------------------------------------------------------------------------------------------------  
  *    @author Dair Azuaje  
  *    @version 02/16/2018   CMCS 255 Section 2 Spring of 2018
***********************************************************************************************************************/ 

import java.util.Scanner;

public class JellyBeans
{ //Begin JellyBeans class
 

 public static void PrintHeading()
 { //Begin PrintHeading
    System.out.println("<Dair Azuaje>");
    System.out.println("<CMSC 255-002>");
    System.out.println("<JellyBeans.java>");
    System.out.println("<Project 2>");
  } // End PrintHeading

/***********************************************************************************************************************
  *   Main Method
  * --------------------------------------------------------------------------------------------------------------------
  *  Function:
  *     Calculates number of jelly beans that can fit in a given har based on the length and diameter of the jelly bean
***********************************************************************************************************************/
  
 public static void main (String[] args) 
 { //Begin Main
   
/***********************************************************************************************************************
  * Declare Variables:
  * LOAD_FACTOR - constant that jarCapacity variable will be mulitplied by to determine usable jar volume
  * jarSize - Jar size by user input
  * usableJarVolume - Jar volume determined by user input of jarCapacity multiplied by LOAD_FACTOR
  * jellyBeanLength - Length of jelly bean in cm determined by user input
  * jellyBeanDiameter - Diameter of jelly bean in cm determined by user input
  * jellyBeanVolume - Mathematical formula for volume of prolate spheroid will be used to calculate volume of jelly bean
  * numberOfJellyBeans - Number of jelly beans in a given jar determined by dividing usableJarVolume by jellyBeanVolume
***********************************************************************************************************************/
   
   final double LOAD_FACTOR = 0.698; //Space taken up in jar by jelly beans in percent
   Scanner input = new Scanner (System.in); //variable declaration for scanner
      
/***********************************************************************************************************************
  * PrintHeading method will be called and heading will be printed to the console
  * Program will prompt user for input on jelly bean diameter, length, and jar size
  * usableJarVolume will be calulated by multiplying jarSize by LOAD_FACTOR
***********************************************************************************************************************/  
 
   PrintHeading(); 

   System.out.print("Enter the jelly bean length (cm): ");
   double jellyBeanLength = input.nextDouble(); //User input of jelly bean length in cm
   
/***********************************************************************************************************************
  * DO WHILE (jellyBeanLength is less than or equal to 0)
  *   Ask user for a valid number greater than 0 for jellyBeanLength
  *   Prompt user for new number
  * END DO
***********************************************************************************************************************/
  
   while(jellyBeanLength <= 0)
   { //Begin while
     System.out.print("You have entered a number 0 or below. Please enter a valid number for jelly bean length (cm) :");
     jellyBeanLength = input.nextDouble();
   } //end while
   
   System.out.print("Enter the jelly bean diameter (cm): ");
   double jellyBeanDiameter = input.nextDouble(); //User input of jelly bean diameter in cm

/***********************************************************************************************************************
  * DO WHILE (jellyBeanDiameter is less than or equal to 0)
  *   Ask user for a valid number greater than 0 for jellyBeanDiameter
  *   Prompt user for new number
  * END DO
***********************************************************************************************************************/
   
   while(jellyBeanDiameter <= 0)
   { //Begin while
     System.out.print("You have entered a number 0 or below. Please enter a valid number for jelly bean diameter (cm) :");
     jellyBeanDiameter = input.nextDouble();
   } //End while
     
   System.out.print("Enter the jar size (mL): ");
   double jarSize = input.nextDouble(); //User input for size of jar in mL
   
/***********************************************************************************************************************
  * DO WHILE (jarSize is less than or equal to 0)
  *   Ask user for a valid number greater than 0 for jarSize
  *   Prompt user for new number
  * END DO
***********************************************************************************************************************/   
  
   while(jarSize <= 0)
   { //Begin while
     System.out.print("You have entered a number 0 or below. Please enter a valid number for jar size (mL) :");
     jarSize = input.nextDouble();
   } //End while
   double usableJarVolume = jarSize * LOAD_FACTOR; //Multipied by LOAD_FACTOR to determine the usable jar volume in mL
   
/***********************************************************************************************************************
  * Variables a and c will be assigned jellyBeanDiameter and jellyBeanLength, respectively for mathematical use
  * Using mathematical formula ((PI/6) x (A^2) x C) volume of jelly bean will be calculated. A = diameter, C = Length
  * Volume of jelly bean will be in centimeters cubed
  * 1 cubic centimeter = 1 milliliter
***********************************************************************************************************************/
     
   double a = jellyBeanDiameter;
   double c = jellyBeanLength;
   double jellyBeanVolume = ((Math.PI/6) * (Math.pow(a, 2)) * c);
 
/***********************************************************************************************************************
  * numberOfJellyBeans will be calculated by dividing usableJarVolume by jellyBeanVolume
  * Program will print to the console the appoximate number of jelly beans in the jar rounded to the nearest hundredth
***********************************************************************************************************************/
   
   double numberOfJellyBeans = usableJarVolume/jellyBeanVolume;
   System.out.println("There are approximately " + Math.round(numberOfJellyBeans) + " jelly beans in the jar");
     
 }//End Main
}//End JellyBeans class


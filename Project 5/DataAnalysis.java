/* Dair Azuaje
 * CMSC 255-02
 * Project 5, DataAnalysis.java
 * Program will read weather data from file, calculate averages and sum, and write them to a file
 * User will let program know if they want to read a file and then provide file name
 */
import java.util.Scanner;
import java.io.*;

/***********************************************************************************************************************
  *    DataAnalysis Class
  **********************************************************************************************************************
  * Function:
  *    Read weather data from file provided by user and write formatted data to output file 
  *---------------------------------------------------------------------------------------------------------------------  
  *    @author Dair Azuaje  
  *    @version 04/04/2018   CMCS 255 Section 2 Spring of 2018
***********************************************************************************************************************/

public class DataAnalysis 
{ //Begin class
  
/***********************************************************************************************************************
  * PrintHeading Method
  * -------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Prints heading to console
***********************************************************************************************************************/
  
  public static void printHeading() 
  { //Begin PrintHeading
    System.out.println("<Dair Azuaje>");
    System.out.println("<CMSC 255-002>");
    System.out.println("<DataAnalysis.java");
    System.out.println("<Project 5>");
  } // End PrintHeading 
 
/***********************************************************************************************************************
  *   Main Method
  * --------------------------------------------------------------------------------------------------------------------
  *  Function:
  *     -Reads weather data from file determines months, number of days, and outputs formatted data to output file
***********************************************************************************************************************/  
  
  public static void main (String [] args) throws FileNotFoundException
  { //Beging main method
    
/*----------------------------------------------------------------------------------------------------------------------
 * Declare Variables:
 * fileRead - Scanner that will read the file
 * weatherData - Will be the file that is read by the scanner
 * fileWrite - PrintWriter that will write out to output file
 * year - Year read from input file
 * month - Month read from input file
 * numDaysInMonth - Number of days in month
 * monthDates - Array that will hold the dates of the month read from the file
 * highTemperatures - Array that will hold the high temperatures for the month read from the file
 * lowTemperatures - Array that will hold the low temperatures for the month read from the file
 * rainfall - Array that will hold the rainfall for the month read from the file
 * city - Name of city read from file
 * arrayIndex - Used to fill and iterate through array
 * highTemperatureAverage - Average high temperature for month
 * lowTemperatureAverage - Average low temperature for month
 * rainfallTotal - Total rainfall for month
 * ------------------------------------------------------------------------------------------------------------------*/
    
    printHeading();
    Scanner in = new Scanner(System.in);
    System.out.print("Would you like to read a file? (Y/N)"); //If user types in Y program will read and process data
    String userInput = in.nextLine();
    
/*----------------------------------------------------------------------------------------------------------------------
 * While user input is "Y" program will read data from file while there is more data
 * Will determine days in month, high and low temperature averages, and rainfall total
 * 
 * DO WHILE userInput = Y
 *   Begin program
 *   Initialize Variables
 *   Set up File, Scanner, and PrintWriter
 *   Process file and retrieve data
 *   Calculate high and low temperature averages
 *   Calulate total rainfall
 *   Write formatted data to output file
 *   Prompt user to read another file
 *   Close File, Scanner, and PrintWrite
 * END DO
 * -------------------------------------------------------------------------------------------------------------------*/   
    
    while (userInput.equals("Y"))
    {
      System.out.print("Please enter file name: ");
      File weatherData = new File(in.nextLine()); //Uses scanner to get file name
      Scanner fileRead = new Scanner(weatherData);
      PrintWriter fileWrite = new PrintWriter("dataOutput.txt"); //Name of file data will be written out to 
      
      int year = fileRead.nextInt(); //Year read from input file
      String month = fileRead.next(); //Month read from input file
      int numDaysInMonth = numDaysInMonth(month, year); //Calls method to determine number of days in month 
      //System.out.println(numDaysInMonth(month, year));
      int [] monthDates = new int [numDaysInMonth]; //Array with days of the month 
 
/*----------------------------------------------------------------------------------------------------------------------
 * Populating numDaysInMonth array with days of month
 *--------------------------------------------------------------------------------------------------------------------*/
      
      int [] highTemperatures = new int[numDaysInMonth]; //Uses number of days to determine how large array should be
      int [] lowTemperatures = new int[numDaysInMonth]; //Uses number of days to determine how large array should be
      double [] rainfall = new double [numDaysInMonth]; //Uses number of days to determine how large array should be
      String city = fileRead.next(); //Read and skip location
      int arrayIndex = 0; //Index of array. Will be used to fill in arrays for temp and rainfall

/*----------------------------------------------------------------------------------------------------------------------
 * While file has more data program will read data from file
 * Will determine days in month, high and low temperature averages, and rainfall total and fill their respective arrays
 * 
 * DO WHILE file has more data
 *   Read Dates of month, highTemperatures, lowTemperatures, and rainfall and fill their respective arrays
 * END DO
 * -------------------------------------------------------------------------------------------------------------------*/      
      
      while (fileRead.hasNext())
      { 
        monthDates[arrayIndex] = fileRead.nextInt(); //Read dates of month and fill monthDates array       
        highTemperatures[arrayIndex] = fileRead.nextInt(); //Read high temperatures and fill highTemperatures array
        lowTemperatures[arrayIndex] = fileRead.nextInt(); //Read low temperatures and fill lowTemperatures array
        rainfall[arrayIndex] = fileRead.nextDouble(); //Read rainfalls and fill rainfall array
        arrayIndex++;       
      }

/*----------------------------------------------------------------------------------------------------------------------
 * Average high temperature
 * -------------------------------------------------------------------------------------------------------------------*/
         
      int highTemperatureAverage = calculateAverage(highTemperatures); //Calls method to calculate average
      
/*----------------------------------------------------------------------------------------------------------------------
 * Average low temperature
 * -------------------------------------------------------------------------------------------------------------------*/
     
      int lowTemperatureAverage = calculateAverage(lowTemperatures); //Calls method to calculate average
     
      
/*----------------------------------------------------------------------------------------------------------------------
 * Total rainfall
 * -------------------------------------------------------------------------------------------------------------------*/
      
      double rainfallTotal = calculateSum(rainfall); //Calls method to calculate total
      
/*----------------------------------------------------------------------------------------------------------------------
 * Writing out data to dataOutput.txt
 * -------------------------------------------------------------------------------------------------------------------*/
      
      fileWrite.println("For the month of " + month + " " + year + " in " + city + ":");
      fileWrite.println("The average high temperature was " + highTemperatureAverage + " degrees.");
      fileWrite.println("The average low temperature was " + lowTemperatureAverage + " degrees.");
      fileWrite.print("The total rainfall was ");
      fileWrite.printf("%.2f", rainfallTotal);
      fileWrite.print(" inches.");
      fileWrite.println();
 
/*----------------------------------------------------------------------------------------------------------------------
 * DO WHILE i < monthDates.length
 *   Print out days of month
 *   Print out high and low temperatures with correct formatting
 *   Print out rainfall per day with correct formatting
 * END DO
 * -------------------------------------------------------------------------------------------------------------------*/      
      int i = 0;
      while (i < monthDates.length)
      { //Begin while    
        fileWrite.printf("%-3d", monthDates[i]);
        
/*----------------------------------------------------------------------------------------------------------------------
 * -If else statement that will print out the high temperatures for the month, determine if it is above or below the 
 * average high temperature and add + or -
 * 
 * IF highTemperatures > highTemperatureAverage
 *   print out high temp with a +
 * ELSE IF highTemperatures < highTemperatureAverage
 *   print out high temp with a -
 * ELSE
 *   print out high temp alone
 * END IF
 *   
 * -------------------------------------------------------------------------------------------------------------------*/        
        
        if (highTemperatures[i] > highTemperatureAverage)
        { //Begin if
          fileWrite.printf("%5d+", highTemperatures[i]);
        } //End if
        else if (highTemperatures[i] < highTemperatureAverage)
        { //Begin else if
          fileWrite.printf("%5d-", highTemperatures[i]);   
        } //End else if
        else
          fileWrite.printf("%5d ", highTemperatures[i]);
        
 
/*----------------------------------------------------------------------------------------------------------------------
 * -If else statement that will print out the low temperatures for the month, determine if it is above or below the 
 * average low temperature and add + or -
 * 
 * IF lowTemperatures > lowTemperatureAverage
 *   print out low temp with a +
 * ELSE IF lowTemperature < lowTemperatureAverage
 *   print out low temp with a -
 * ELSE
 *   print out low temp alone
 * END IF
 * 
 * -------------------------------------------------------------------------------------------------------------------*/        
       
        if (lowTemperatures[i] > lowTemperatureAverage)
        { //Begin if
          fileWrite.printf("%5d+", lowTemperatures[i]);
        } //End if
        else if (lowTemperatures[i] < lowTemperatureAverage)
        { //Begin else if
          fileWrite.printf("%5d-", lowTemperatures[i]);
        } //End else if
        else
          fileWrite.printf("%5d ", lowTemperatures[i]);
          

/*----------------------------------------------------------------------------------------------------------------------
 * -If else statement that will print out the rainfall for the month, determine if it is above 0.00
 * -Will format the rainfall output to two decimal places
 * 
 * IF rainfall > 0.00
 *   print out rainfall with *
 * ELSE
 *   print out rainfall alone
 * -------------------------------------------------------------------------------------------------------------------*/
        
        if (rainfall[i] > 0.00)
        { //Begin if
          fileWrite.printf("%7.2f*", rainfall[i]);
        } //End if
        else 
          fileWrite.printf("%7.2f", rainfall[i]);
          fileWrite.println();
        i++;       
      } //End while
      
      fileWrite.close(); //Close PrintWriter
      System.out.print("Would you like to read another file? (Y/N)");
      
      userInput = in.nextLine(); //Takes user input to determine if another file should be processed   
      
    } //End while
    System.out.println("Program ending");
    in.close(); //Close Scanner
    
  } //End main method

/***********************************************************************************************************************
  * numDaysInMonth Method
  * -------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Determines number of days in month and returns an integer
  * Parameters: String month, int year
  * Return Value: integer of number of days in month
***********************************************************************************************************************/
  
  private static int numDaysInMonth (String month, int year)
  { //Begin numDaysInMonth
    int numberOfDays = 0; //Number of days depending on month
    
/*----------------------------------------------------------------------------------------------------------------------
 * Switch Case statment will determine number of days in a month depending on what month is read in from data file
 * If statement within case for month of february determines whether the year is a leap year or not
 * -------------------------------------------------------------------------------------------------------------------*/
    
    switch (month) 
    { //Begin switch
      case "January": numberOfDays = 31;
      break;
      case "February": 
        if ((year % 4 == 0) && ((year % 100 !=0) && (year % 400 != 0)))
          { //Begin if
            numberOfDays = 29;
          } //End if
        else
            numberOfDays = 28;      
      break;
      case "March": numberOfDays = 30;
      break;
      case "April": numberOfDays = 30;
      break;
      case"May": numberOfDays = 31;
      break;
      case"June": numberOfDays = 30;
      break;
      case"July": numberOfDays = 31;
      break;
      case"August": numberOfDays = 31;
      break;
      case "September": numberOfDays = 30;
      break;
      case"October": numberOfDays = 31;
      break;
      case "November": numberOfDays = 30;
      break;
      case"December": numberOfDays = 31;
      break;     
    } //End switch
    return numberOfDays;
  } //End numDaysInMonth

/***********************************************************************************************************************
  * calculateAverage Method
  * -------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Calculates average temperature (low and high temps)
  * Parameters: int [] temp
  * Return Value: integer of calulated average
***********************************************************************************************************************/
  
  private static int calculateAverage (int [] temp)
  { //Begin calculateAverage method
    double totalTemp = 0; //Will be total temp after enhanced for loop goes through all elements of array
    double numDaysInMonth = 0; //Will be total days in month after enhanced for loop goes through all elements of array

/*----------------------------------------------------------------------------------------------------------------------
 * Enhanced for loop to add up all temperatures for month and divide by number of days in month to get average temp
 * -------------------------------------------------------------------------------------------------------------------*/    
    
    for (int element: temp)
      { //Begin for
        totalTemp = element + totalTemp;
        numDaysInMonth++;
      } //End for
      
      double averageTemp = (totalTemp/numDaysInMonth); //Average temperature based on temps in array
      
      return (int) Math.round(averageTemp);
  } //End method

/***********************************************************************************************************************
  * calculateSum Method
  * -------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Calculates total rainfall for month
  * Parameters: double [] rainfall
  * Return Value: double of rainfall total
***********************************************************************************************************************/
  
  private static double calculateSum (double [] rainfall)
  { //Begin calculateSum method
    double rainfallTotal = 0;
    
/*----------------------------------------------------------------------------------------------------------------------
 * Enhanced for loop to add up rainfall per day for the month and returns an integer
 * -------------------------------------------------------------------------------------------------------------------*/
    
    for (double element: rainfall)
    { //Begin for
      rainfallTotal = element + rainfallTotal;       
    } //End for
    
    return rainfallTotal; //Sum of rainfall for everyday of month
  } //End method
} //End class
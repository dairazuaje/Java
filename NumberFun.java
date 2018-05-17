import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
  
/***********************************************************************************************************************
  *    NumberFun Class
  **********************************************************************************************************************
  * Function:
  *    Read data from file and determine if integers are even, prime, emirp, or palindrom
  *---------------------------------------------------------------------------------------------------------------------  
  *    @author Dair Azuaje  
  *    @version 03/23/2018   CMCS 255 Section 2 Spring of 2018
***********************************************************************************************************************/

public class NumberFun 
{ //Begin Class


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
    System.out.println("<NumberFun.java");
    System.out.println("<Project 4>");
  } // End PrintHeading 
  
/***********************************************************************************************************************
  *   Main Method
  * --------------------------------------------------------------------------------------------------------------------
  *  Function:
  *     Determine if integers from file are even, prime, emirp, or palindrome
***********************************************************************************************************************/
  
  public static void main (String[] args) throws FileNotFoundException
    
  { //Begin main
    
/*----------------------------------------------------------------------------------------------------------------------
 * Variable Declaration:
 * num - integers from input.txt file
 * numType2 - doubles from input.txt file
 * numType3 - Strings from input.txt file
 * output - output of properties for each integer from input.txt file
 * numReversed - reversed integer from input.txt file
 * numSqRt- square root of integer from input.txt file
 *--------------------------------------------------------------------------------------------------------------------*/
    
    printHeading(); //call method to print heading
    System.out.println();
    Scanner in = new Scanner(System.in); //Declare scanner variable
    System.out.print("Please enter the file name."); //Prompt user for file name
    File fileName = new File(in.nextLine()); //User input will be assigned to fileName 
    Scanner fileRead = new Scanner(fileName); //Will read data from file
    System.out.println();

/***********************************************************************************************************************
  DO WHILE (fileRead.hasNext)
  
    IF (fileRead.hasNextInt)
    
      Set num to next int from file
      Call all methods (isEven, isPrime, isEmirp, isPalindrome)
      Set String output to ""
      
      IF (integer is not even, prime, emirp, or palindrome)
        print out integer alone
      END IF
      
      If (integer is even, prime, emirp, or palindrome)
        
        IF (even)
          add "even" to output
        END IF
        
        IF (prime)
          add "prime" to output
        END IF
        
        IF (emirp)
          add "emirp" to output
        END IF
        
        IF (palindrome)
          add "palindrome" to output
        END IF
        
        Print output
        
      END IF
        
    END IF    
        
    ELSE IF (fileRead.hasNextDouble)
      set numType2 to next double from file
      print double and say that it is an invalid format
    END ELSE IF
      
    ELSE IF (fileRead.hasNext)
      set numType3 to next String from file
      print String and say that it is an invalid format
    END IF
      
  END DO     
      
***********************************************************************************************************************/    
   
   while (fileRead.hasNext())
   { //Begin while
      
/***********************************************************************************************************************
   IF (fileRead.hasNextInt)
   
     Set num to next int from file
     Call all methods (isEven, isPrime, isEmirp, isPalindrome)
     Set String output to ""
     
     IF (integer is not even, prime, emirp, or palindrome)
       print out integer alone
     END IF
      
     IF (integer is even, prime, emirp, or palindrome)
        
       IF (even)
         add "even" to output
       END IF
        
       IF (prime)
         add "prime" to output
       END IF
        
       IF (emirp)
         add "emirp" to output
       END IF
        
       IF (palindrome)
         add "palindrome" to output
       END IF
       
       Print output
     
     END IF
     
   END IF
     
***********************************************************************************************************************/
/*----------------------------------------------------------------------------------------------------------------------
 * Determines if file has another integer. Reads next integer and calls methods to determine if even, prime, emirp, or
 * palindrome
 *--------------------------------------------------------------------------------------------------------------------*/   
     
     if (fileRead.hasNextInt())
     { //Begin if
       int num = fileRead.nextInt();
       isEven(num); //Calls isEven method
       isPrime(num); //Calls isPrime method
       isPalindrome(num); //Calls isPalindrome method
       isEmirp(num); //Calls isEmirp method
       
       String output = ""; 
       
/***********************************************************************************************************************
   IF (integer is not even, prime, emirp, or palindrome)
     print out integer alone
   END IF
***********************************************************************************************************************/
/*----------------------------------------------------------------------------------------------------------------------
 * Determines if integer is not even, prime, emirp, or palindrome and if so, prints out integer alone
 *--------------------------------------------------------------------------------------------------------------------*/       
       if (!isEven(num) && !isPrime(num) && !isEmirp(num) && !isPalindrome(num))
       { //Begin if
         System.out.println(num);
       } //End if
       
/***********************************************************************************************************************
  IF (integer is even, prime, emirp, or palindrome)
        
       IF (even)
         add "even" to output
       END IF
        
       IF (prime)
         add "prime" to output
       END IF
        
       IF (emirp)
         add "emirp" to output
       END IF
        
       IF (palindrome)
         add "palindrome" to output
       END IF
       
       Print output
     
  END IF
***********************************************************************************************************************/       
 /*----------------------------------------------------------------------------------------------------------------------
 * Determines if integer is even, prime, emirp, or palindrome
 *--------------------------------------------------------------------------------------------------------------------*/      
       if (isEven(num) || isPrime(num) || isEmirp(num) || isPalindrome(num))
       { //Begin if
         
/***********************************************************************************************************************
  IF (even)
    add "even" to output
  END IF
***********************************************************************************************************************/         
/*----------------------------------------------------------------------------------------------------------------------
 * Determines if integer is even
 *--------------------------------------------------------------------------------------------------------------------*/         
         if (isEven(num))
         { //Begin if
           output+= " Even."; 
         }  //End if  
         
/***********************************************************************************************************************
  IF (prime)
    add "even" to output
  END IF
***********************************************************************************************************************/         
/*----------------------------------------------------------------------------------------------------------------------
 * Determines if integer is prime
 *--------------------------------------------------------------------------------------------------------------------*/        
         if (isPrime(num))
         { //Begin if
           output+= " Prime.";
         } //End if 
         
/***********************************************************************************************************************
  IF (emirp)
    add "even" to output
  END IF
***********************************************************************************************************************/         
 /*----------------------------------------------------------------------------------------------------------------------
 * Determines if integer is emirp
 *--------------------------------------------------------------------------------------------------------------------*/        
         if (isEmirp(num))
         { //Begin if
           output+= " Emirp.";
         } //End if 
         
/***********************************************************************************************************************
  IF (palindrome)
    add "even" to output
  END IF
***********************************************************************************************************************/         
 /*----------------------------------------------------------------------------------------------------------------------
 * Determines if integer is palindrome
 *--------------------------------------------------------------------------------------------------------------------*/       
         if (isPalindrome(num))
         { //Begin if
           output+= " Palindrome.";
         } //End if   
         
/*----------------------------------------------------------------------------------------------------------------------
 * Prints out integers with properties
 *--------------------------------------------------------------------------------------------------------------------*/
         
        System.out.println(num + " - " + output); //Prints out integers along with properties
       } //End if             
     } //End if 
     
/***********************************************************************************************************************
  ELSE IF (fileRead.hasNextDouble)
    set numType2 to next double from file
    print double and say that it is an invalid format
  END ELSE IF
***********************************************************************************************************************/      
/*----------------------------------------------------------------------------------------------------------------------
 * Determines if file has a double and returns error if true
 *--------------------------------------------------------------------------------------------------------------------*/     
     else if (fileRead.hasNextDouble())
     { //Begin else if
       double numType2 = fileRead.nextDouble();
       System.out.println(numType2 + " - Invaid format, not an integer."); //Prints out error message for invalid format
     } //End else if
     
/***********************************************************************************************************************
  ELSE IF (fileRead.hasNext)
    set numType3 to next String from file
    print String and say that it is an invalid format
  END IF
***********************************************************************************************************************/     
 /*----------------------------------------------------------------------------------------------------------------------
 * Determines if file has a string and returns error if true
 *--------------------------------------------------------------------------------------------------------------------*/    
     
     else if (fileRead.hasNext())
     { //Begin else if
       String numType3 = fileRead.next();
       System.out.println(numType3 + " - Invaid format, not an integer."); //Prints out error message for invalid format
     } //End else if
        
   } //End while 

    in.close();
  } //End main
  
/***********************************************************************************************************************
  *   isEven Method
  * --------------------------------------------------------------------------------------------------------------------
  *  Function:
  *     Determine if integers from file are even
***********************************************************************************************************************/
  
    public static boolean isEven(int num)
    { //Begin isEven Method
      
/***********************************************************************************************************************
  IF (remainder num/2 = 0)
    return true
  Else
    return false
  END IF
***********************************************************************************************************************/
 /*----------------------------------------------------------------------------------------------------------------------
 * Determines if integer is divisible by two
 *--------------------------------------------------------------------------------------------------------------------*/     
       
      if ((num % 2) == 0)
        { //Begin if
          return true;       
        } //End if
        return false;
    } //End isEven
    
/***********************************************************************************************************************
  *   isPrime Method
  * --------------------------------------------------------------------------------------------------------------------
  *  Function:
  *     Determine if integers from file are prime
***********************************************************************************************************************/
    
    public static boolean isPrime(int num)
    { //Begin isPrime Method
      
/***********************************************************************************************************************
  IF (num = 2)
    return true
  ELSE IF (num isEven)
    returm flase
  END IF
***********************************************************************************************************************/
 /*----------------------------------------------------------------------------------------------------------------------
 * Determines if integer is equal to 2 and return true. If not equal to 2, returns false
 *--------------------------------------------------------------------------------------------------------------------*/     
      if (num == 2)
      { //Begin if
        return true;
      } //End if
      
      else if (isEven(num))
      { //Begin else if
        return false;
      } //End else if
      
      int numSqrRt = (int) Math.sqrt(num); // Square root of integer

/***********************************************************************************************************************
  DO WHILE (i <= square root of num tested)
    IF (remainder num = 0)
      return false
    END IF
    
    return true
    
  END DO
***********************************************************************************************************************/
      
      for (int i = 3; i <= numSqrRt; i += 2)
      { //Begin for
        
/***********************************************************************************************************************
  IF (remainder num = 0)
    return false
  END IF 
***********************************************************************************************************************/
 /*----------------------------------------------------------------------------------------------------------------------
 * Determines if integer is divisible by odd numbers that are less than the square root of the integer being checked
 *--------------------------------------------------------------------------------------------------------------------*/       
        if (num % i == 0)
        { //Begin if
          return false;
        } //End if                      
      } //End for
      
      return true;
      
    } //End isPrime
 
    
/***********************************************************************************************************************
  *   isPalindrome Method
  * --------------------------------------------------------------------------------------------------------------------
  *  Function:
  *     Determine if integers from file are palindrome
***********************************************************************************************************************/
   
    public static boolean isPalindrome(int num)
    { //Begin isPalindrome Method
      
/***********************************************************************************************************************
  IF (num = reverse of num)
    return true
  ELSE
    return false
  END IF
***********************************************************************************************************************/
 /*----------------------------------------------------------------------------------------------------------------------
 * Determines if integer is equal to the reverse of that integer and return true if true, false if false
 *--------------------------------------------------------------------------------------------------------------------*/     
      if (num == reverse(num))
      { //Begin if
        return true;
      } //End if
      return false;
      
    } //End isPalindrome
    
/***********************************************************************************************************************
  *   reverse Method
  * --------------------------------------------------------------------------------------------------------------------
  *  Function:
  *     Reverses integer to be called by palindrome and emirp methods
***********************************************************************************************************************/
    
    public static int reverse(int num)
    { //Begin reverse method
      
/***********************************************************************************************************************
  Set numReversed to 0
  
  DO WHILE (num does not = 0)
     numReversed = (numReversed X 10) + (remainder of num/10)
     num = num/10
  END WHILE
  
  return numReversed   
***********************************************************************************************************************/
 /*----------------------------------------------------------------------------------------------------------------------
 * Reverses integer
 *--------------------------------------------------------------------------------------------------------------------*/     
      int numReversed = 0;
      while (num != 0)
      { //Begin while
        numReversed = (numReversed * 10) + (num % 10);
        num = num/10;      
      } //End while
      return numReversed;
    } //End reverse

/***********************************************************************************************************************
  *   isEmirp Method
  * --------------------------------------------------------------------------------------------------------------------
  *  Function:
  *     Determine if integers from file are emirp
***********************************************************************************************************************/
    
    public static boolean isEmirp(int num)
    { //Begin isEmirp Method
      
/***********************************************************************************************************************
  IF (num is prime and numReversed is prime)
    return true
  ELSE
    return false
  END IF
***********************************************************************************************************************/
/*----------------------------------------------------------------------------------------------------------------------
 * Determines if integer and reverse of integer are prime and returns true if true, false if false
 *--------------------------------------------------------------------------------------------------------------------*/      
      if (isPrime(reverse(num)) && isPrime(num))
      { //Begin if
        return true;
      } //End if
      return false;
    } //End isEmirp
} //End Class

/***********************************************************************************************************************
  * Customer Class
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Define attributes that the customer object will have
  *   Set attributes based on what is passed into setter methods and constructors
  * *******************************************************************************************************************/
public class Customer 
{ 
/*----------------------------------------------------------------------------------------------------------------------
 * Private instance variables that will define the customer
 * -------------------------------------------------------------------------------------------------------------------*/
  
  private String firstName; 
  private String lastName;
  private String eMail;
  private String phone;
  private int bikesOwned;
  private Bicycle bicycle;
  
/***********************************************************************************************************************
  * Customer constructor (no parameters)
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Sets default values for customer objects
  * *******************************************************************************************************************/
  
  public Customer()
  { //Begin default Customer constructor
    firstName = "Jane";
    lastName = "Doe";
    eMail = "jane_doe@gmail.com";
    phone = "(804) 342-2000";
    bikesOwned = 2;
    bicycle = new Bicycle();
  } //End default Customer constructor

/***********************************************************************************************************************
  * Customer constructor (parameters for phone number, first name, and last name)
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Builds custom bicycle based on data passed as parameters
  * *******************************************************************************************************************/  
  
  public Customer (String phone, String firstName, String lastName)
  { //Begin Customer constructor
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
  } //End Customer constructor
  
  
/*----------------------------------------------------------------------------------------------------------------------
 * Setter Methods
 * -------------------------------------------------------------------------------------------------------------------*/
  
/***********************************************************************************************************************
  * setName method
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Sets name for customer object using parameters passed
  * *******************************************************************************************************************/
  
 public void setName(String firstName, String lastName)
 { //Begin setName
   this.firstName = firstName;
   this.lastName = lastName;
 } //End setName

/***********************************************************************************************************************
  * setPhone method
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Sets phone number for customer object using parameters passed
  * *******************************************************************************************************************/  
  
  public void setPhone(String phone)
  { //Begin setPhone
    this.phone = phone;
  } //End setPhone

/***********************************************************************************************************************
  * seteMail method
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Sets eMail for customer object using parameters passed
  * *******************************************************************************************************************/
  
  public void seteMail(String eMail)
  { //Begin seteMail
    this.eMail = eMail;
  } //End seteMail

/***********************************************************************************************************************
  * setCustBike method
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Sets bicycle for customer object using parameters passed
  * *******************************************************************************************************************/  
  
  public void setCustBike(Bicycle bicycle)
  { //Begin setCustBike
    this.bicycle = bicycle;
  } //End setCustBike
  
/*----------------------------------------------------------------------------------------------------------------------
 * Accessor Methods
 * -------------------------------------------------------------------------------------------------------------------*/

/***********************************************************************************************************************
  * getBicycle method
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Returns bicycle of customer
  * *******************************************************************************************************************/  
  
  public Bicycle getCustBike()
  { //Begin getCustBike
    return bicycle;
  } //End getCustBike

/***********************************************************************************************************************
  * toString method
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Returns String of formatted customer information
  * *******************************************************************************************************************/  
  
  public String toString()
  { //Begin toString
    String output;
    output = "Customer: " + firstName + " " + lastName + "\n";
    output = output + "Phone: " + phone + "\n";
    output = output + "Email: " + eMail + "\n";
    output = output + firstName + "'s Bikes: \n";
    output = output + getCustBike();
    return output;  
  } //End toString
} //End class
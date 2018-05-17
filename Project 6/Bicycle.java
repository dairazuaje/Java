import java.util.Scanner;

/***********************************************************************************************************************
  * Bicycle Class
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Define attributes that the bike object will have
  *   Set attributes based on what is passed into setter methods and constructors
  * *******************************************************************************************************************/

public class Bicycle 
{ //Begin class
  
/*----------------------------------------------------------------------------------------------------------------------
* Private instance variables that will define the bicycle
* -------------------------------------------------------------------------------------------------------------------*/
  private float weight;
  private int numGear;
  private String brand;
  private String color;
  private FrameMat frameMat;
  private WheelSize wheelSize;
  private BikeType bikeType;
  private UserType userType;
  private BrakeType brakeType;
  private Condition condition;
 
/***********************************************************************************************************************
  * Bicycle constructor (no parameters)
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Constructs a bicycle object with default settings
  * *******************************************************************************************************************/  
  
  public Bicycle()
  { //Begin bicycle default constructor
    weight = 10;
    numGear = 5;
    brand = "REI";
    color = "Red";
    wheelSize = wheelSize.TEN;
    bikeType = bikeType.Mountain;
    userType = userType.Men;
    frameMat = frameMat.Aluminum;
    condition = condition.New;
    brakeType = brakeType.Cantilever;
  } //End bicycle default constructor

/***********************************************************************************************************************
  * Bicycle constructor (parameters for bike type, user type, frame material, and condition)
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Constructs a bicycle object using values passed through
  * *******************************************************************************************************************/  
  
  public Bicycle(BikeType bikeType, UserType userType, FrameMat frameMat, Condition condition)
  { //Begin bicycle constructor
    this.bikeType = bikeType;
    this.userType = userType;
    this.frameMat = frameMat;
    this.condition = condition;
  } //End bicycle constructor

/***********************************************************************************************************************
  * setGear method
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Sets number of gears of bicycle
  * *******************************************************************************************************************/  
  
  public void setGear(int gear)
  { //Begin setGear
/*----------------------------------------------------------------------------------------------------------------------
* If statement that will set number of gears to whatever integer is passed as long as it is equal to or greater than 0. 
* If less than 0 then default number of gears will be set
* -------------------------------------------------------------------------------------------------------------------*/    
    if (numGear >= 0)
    { //Begin if
      this.numGear = gear;
    } //End if
    else 
      this.numGear = 5;
    
  } //End setGear

/***********************************************************************************************************************
  * setWheelSize method
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Sets size of wheel of bicycle
  * *******************************************************************************************************************/  
  
  public void setWheelSize(WheelSize wheelSize)
  { //Begin setWheelSize
    this.wheelSize = wheelSize;
  } //End setWheelSize

/***********************************************************************************************************************
  * setWeight method
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Sets weight of bicycle
  * *******************************************************************************************************************/  
  
  public void setWeight(float weight)
  { //Begin setWeight
    
/*----------------------------------------------------------------------------------------------------------------------
* If statement that will set bike weight to whatever float is passed as long as it is equal to or greater than 0. 
* If less than 0 then default weight will be set
* -------------------------------------------------------------------------------------------------------------------*/    
    if (weight >= 0)
    { //Begin if
      this.weight = weight;
    } //End if
    else 
      this.weight = 10; //Default weight for bike
  } //End setWeight

/***********************************************************************************************************************
  * setBrake method
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Sets type of brake bicycle will have
  * *******************************************************************************************************************/  
  
  public void setBrake(BrakeType brakeType)
  { //Begin setBrake
    this.brakeType = brakeType;
  } //End setBrake
  
/***********************************************************************************************************************
  * setBrand method
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Sets the brand of the bicycle
  * *******************************************************************************************************************/  
  
  public void setBrand(String brand)
  { //Begin setBrand
    this.brand = brand;
  } //End setBrand

/***********************************************************************************************************************
  * setColor method
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Sets the color of the bicycle
  * *******************************************************************************************************************/  
  
  public void setColor(String color)
  { //Begin setColor
    this.color = color;
  } //End setColor

/***********************************************************************************************************************
  * toString method
  * --------------------------------------------------------------------------------------------------------------------
  * Function:
  *   Returns a string with all the information of the bicycle that was conctructed
  * *******************************************************************************************************************/  
  
  public String toString()
  { //Begin toString
    String output;
    output = "Bicycle: \n" + "Bicycle {Type = " + bikeType + ", ";
    output = output + "User = " + userType + ", ";
    output = output + "Frame = " + frameMat + ",  \n";
    output = output + "Brakes = " + brakeType + ", ";
    output = output + "Condition = " + condition + ", ";
    output = output + "Wheelsize: " + wheelSize.getValue() + ", ";
    output = output + "Weight = " + weight + ", \n";
    output = output + "Number of gears = " + numGear + ", ";
    output = output + "Brand = " + brand + ", ";
    output = output + "Color = " + color + "}\n";
    output = output + "********************************************************************";
    
    return output;
    
  } //End toString
} //End class
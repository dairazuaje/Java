import java.util.*;
  /*********************************************************************************
  *     BicycleTest Program
  * -------------------------------------------------------------------------------
  *   Test Harness for Assignment 6 - Bike Shop
  * Used to test Customer and Bicycle Classes
  * *******************************************************************************/
public class BicycleTest {
  /*********************************************************************************
  *     Main Method
  * -------------------------------------------------------------------------------
  *   Test Assignment 6 - Bike Shop
  * 
  * *******************************************************************************/
  public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner in = new Scanner(System.in);
  
   Bicycle TestBike = new Bicycle();
   System.out.println("Test Bike");
   System.out.println(TestBike.toString());

  /* -------------------------------------------------------------------------------
  *   Create Bicycle array
  *   Test Bicyle Class
  *    Bicycle() - both override constructors
  *    setBrake()
  *    setWheelSize()
  *    setcolor()
  *    setGear()
  *    setWeight()
  *    setBrand()
  *    toString()
  * ------------------------------------------------------------------------------*/  
   Bicycle[] Bikes = new Bicycle[5];
   Bicycle invBike = new Bicycle();
   Bikes[0] = new Bicycle(BikeType.Mountain, UserType.Boys, FrameMat.Carbon, Condition.New);
   invBike = Bikes[0];
   invBike.setBrake(BrakeType.Cantilever);
   invBike.setWheelSize(WheelSize.TEN);
   invBike.setColor("Blue");
   invBike.setGear(12);
   invBike.setWeight(8.0f);
   invBike.setBrand("REI");
   
   Bikes[1] = new Bicycle(BikeType.Cruiser, UserType.Women, FrameMat.Steel, Condition.Used);
   invBike = Bikes[1];
   invBike.setBrake(BrakeType.Caliper);
   invBike.setWheelSize(WheelSize.SIXTEEN);
   invBike.setColor("Red");
   invBike.setGear(15);
   invBike.setWeight(10.0f);
   invBike.setBrand("Red Robin");
   
   Bikes[2] = new Bicycle(BikeType.Road, UserType.Boys, FrameMat.Carbon, Condition.New);
   invBike = Bikes[2];
   invBike.setBrake(BrakeType.LinearPull);
   invBike.setWheelSize(WheelSize.EIGHTEEN);
   invBike.setColor("Yellow");
   invBike.setGear(1);
   invBike.setWeight(14.0f);
   invBike.setBrand("Schwinn");
   
   Bikes[3] = new Bicycle(BikeType.Hybrid, UserType.Girls, FrameMat.Aluminum, Condition.New);
   invBike = Bikes[3];
   invBike.setBrake(BrakeType.Disc);
   invBike.setWheelSize(WheelSize.TWENTY4);
   invBike.setColor("Green");
   invBike.setGear(24);
   invBike.setWeight(6.3f);
   invBike.setBrand("Green Speeder");
   
   Bikes[4] = new Bicycle(BikeType.Road, UserType.Men, FrameMat.Steel, Condition.Used);
   invBike = Bikes[4];
   invBike.setBrake(BrakeType.Caliper);
   invBike.setWheelSize(WheelSize.FOURTEEN);
   invBike.setColor("Purple");
   invBike.setGear(3);
   invBike.setWeight(24.0f);
   invBike.setBrand("Roadster");
  /* -------------------------------------------------------------------------------
  *   Print out Bicycle inventory
  * ------------------------------------------------------------------------------*/ 
   String output = "";
   System.out.println("Bike Shop Inventory");
   for(Bicycle cycle:Bikes){
     output = cycle.toString();
     System.out.println(output);}
  /* -------------------------------------------------------------------------------
  *   Create Customer array
  *   Test Customer Class
  *     Customer()
  *     seteMail()
  *     setCustBike()
  *     toString()
  * ------------------------------------------------------------------------------*/   
   Customer custTest = new Customer();
   System.out.println("Test Customer");
   System.out.println(custTest.toString());
   
   Customer[] cust = new Customer[5];
   cust[0] = new Customer("(804) 515-5555", "Martin", "King");
   cust[0].seteMail("MartinKing@google.com");
   cust[1] = new Customer("(804) 666-6666", "Grace", "Hopper" );
   cust[1].seteMail("ghopper@usn.mil");
   cust[2] = new Customer("(804) 777-7777", "Lucky", "O'Irish");
   cust[2].seteMail("LIrish@google.com");
   cust[3] = new Customer("(804) 888-8888", "Grady", "Booch");
   cust[3].seteMail("gbooch@IBM.com");
   cust[4] = new Customer("(804) 999-9999", "Albert", "Finny");
   cust[4].seteMail("AFinny@google.com");
  /* -------------------------------------------------------------------------------
  *   Assign Bicycles in inventory to customers
  * ------------------------------------------------------------------------------*/ 
   int i = 0;
   for(Customer eachCust:cust){
     eachCust.setCustBike(Bikes[i]);
     i++;
     }
 /* -------------------------------------------------------------------------------
  *   Print out customer array with customer informantion and customer's bicycle
  *   information
  * ------------------------------------------------------------------------------*/ 
   System.out.println("Customer List:"); 
   for(Customer eachCust:cust){
     output = eachCust.toString();
     System.out.println(output);}
 }

}

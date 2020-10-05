package cse360assignment02;
//HEY GITHUB

/*AddingMachine
* This class will create an adding machine that allows to find a running total from arithmetic operations
* Includes setter methods, add and subtract that modify our total instance variable
* Includes getter methods, that return the total value and also return the equation in String format
* Includes a driver function to test out our object's functionality. 
*/
public class AddingMachine 
{
    //Main Driver
    public static void main(String[] args)
    {
        AddingMachine myCalculator = new AddingMachine();
    
        myCalculator.add (4); 
        myCalculator.subtract (2); 
        myCalculator.add(5);

        System.out.println(myCalculator.getTotal());
        System.out.println(myCalculator);
    }

    private int total;
    private String totalString;
    
    //Constructor
    public AddingMachine () 
    {
      total = 0;  // not needed - included for clarity
      totalString = total + " ";
    }
    
    //Accessor Method
    public int getTotal () 
    {
      return total;
    }
    
    //Adds the paramter to the current total
    public void add (int value) 
    {
        total = total + value;
        totalString = totalString + "+ " + value + " ";
    }
    
    //Subtracts the parameter from the running total. 
    public void subtract (int value) 
    {
        total = total - value; 
        totalString = totalString + "- " + value + " ";
    }
    
    //Returs our current equation
    public String toString () 
    {
      return totalString;
    }
  
    //Resets our String to the default String
    public void clear() 
    {
        totalString = "0 ";
    }
  }
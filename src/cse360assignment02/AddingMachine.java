package cse360assignment02;
// Collin Wood
// 1216601711
// cjwood8@asu.edu
// CSE 360, section Tuesdays @9:00

/* AddingMachine
* This class will create an adding machine that allows to find a running total from arithmetic operations
* Includes setter methods, add and subtract that modify our total instance variable
* Includes getter methods, that return the total value and also return the equation in String format
* Includes a driver function to test out our object's functionality. 
*/
public class AddingMachine 
{
    //Main Driver
    

    private int total;
    private String totalString;
    
    //Constructor
    public AddingMachine () 
    {
      total = 0;  // not needed - included for clarity
     
    }
    
    //Accessor Method
    public int getTotal () 
    {
      return 0;
    }
    
    //Adds the paramter to the current total
    public void add (int value) 
    {
        
    }
    
    //Subtracts the parameter from the running total. 
    public void subtract (int value) 
    {
        
    }
    
    //Returs our current equation
    public String toString () 
    {
      return "";
    }
  
    //Resets our String to the default String
    public void clear() 
    {
       
    }
  }
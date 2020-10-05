package cse360assignment02;

public class AddingMachine 
{
    private int total;
    private String totalString;
    
    public AddingMachine () 
    {
      total = 0;  // not needed - included for clarity
      totalString = total + " ";
    }
    
    public int getTotal () 
    {
      return total;
    }
    
    public void add (int value) 
    {
        total = total + value;
        totalString = totalString + "+ " + value + " ";
    }
  
    public void subtract (int value) 
    {
        total = total - value; 
        totalString = totalString + "- " + value + " ";
    }
  
    public String toString () 
    {
      return totalString;
    }
  
    public void clear() 
    {
        totalString = "0 ";
    }
  }
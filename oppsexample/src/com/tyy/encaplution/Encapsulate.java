package com.tyy.encaplution;

public class Encapsulate  {
	
	private String geekName;
    private int geekRoll;
    private int geekAge;
 
   
    public int getAge() { return geekAge; }
 
  
    public String getName() { return geekName; }
 
    
    public int getRoll() { return geekRoll; }
 
    
    public void setAge(int newAge) { geekAge = newAge; }
 
   
    public void setName(String newName)
    {
        geekName = newName;
    }
 
    // set method for roll to access
    // private variable geekRoll
    public void setRoll(int newRoll) { geekRoll = newRoll; }

 

}



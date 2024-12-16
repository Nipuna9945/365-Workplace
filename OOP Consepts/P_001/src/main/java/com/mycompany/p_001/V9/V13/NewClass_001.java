
package com.mycompany.p_001.V9.V13;

public class NewClass_001 
{
    int year;
    String model;
    
    public NewClass_001(int manifactureDate, String carModel)
    {
        year = manifactureDate;
        model = carModel;
    }
    
    public static void main(String[] args) 
    {
        NewClass_001 myObj = new NewClass_001(1986, "Mustang");
        
        System.out.println(myObj.year + " " + myObj.model);
    }
}

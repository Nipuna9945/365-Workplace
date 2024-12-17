
package com.mycompany.p_001.V9.V15;

public class NewClass_001 
{
    private String fName = "Nipuna";
    private String lName = "Randeer";
    private int age = 25;
    private String homeTown = "gampaha";
    
    
    public static void main(String[] args) 
    {
       NewClass_001 myObj = new NewClass_001();
       
       System.out.println("I`m " + myObj.fName + " " + myObj.lName + ". I`m " + myObj.age + ". Im from " + myObj.homeTown);
    }
}


package com.mycompany.p_001.V9.V20.Test_001;

public class NewClass_002 
{
    public static void main(String[] args) 
    {
        Student myObj = new Student();
        System.out.println("My full name is " + myObj.fname + " " + myObj.lname);
        System.out.println("My age is " + myObj.age);
        System.out.println("My graduation year is " + myObj.graduationYear);
        
        myObj.Study();
    }
}

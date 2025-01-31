
package com.mycompany.p_001.V9.V40;

public class NewClass_002
{
    public static void main(String[] args)
    {
        try
        {
            int[] myint  = {10, 27, 98};
            System.out.println(myint[32]);
        } 
        
        catch (Exception e)
        {
            System.out.println("Number is not there");
        } 
        
        finally
        {
            System.out.println("Try catch is over");
        }
    }
}

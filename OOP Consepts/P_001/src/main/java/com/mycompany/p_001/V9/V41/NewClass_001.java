
package com.mycompany.p_001.V9.V41;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewClass_001
{
    public static void main(String[] args)
    {
        Pattern myPattern = Pattern.compile("boiz", Pattern.CASE_INSENSITIVE);
        Matcher myMatcher = myPattern.matcher("Hello boiz whats up");
        
        boolean matchFound = myMatcher.find();
        
        if(matchFound) 
        {
            System.out.println("Match found");
        } 
        
        else 
        {
            System.out.println("Match not found");
        }
    }
}

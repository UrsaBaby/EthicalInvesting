/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ethicalinvesting.Utilites;

/**
 *
 * @author Peter
 */
public class AppUtilities {
    

    public static String normalizeText(String textToNormalize){
        String returnString;
        returnString = textToNormalize.trim();
        return returnString.toLowerCase();
    }
    
}

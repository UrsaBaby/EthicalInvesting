/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ethicalinvesting.ImportData;


import ethicalinvesting.structures.ClimatePositiveExposure;

import java.util.ArrayList;

/**
 *
 * @author Peter
 */
public class ImportDataReader {

    public ArrayList<String> getClimatePositiveExposureForETF() {
        ArrayList<String> returnList = new ArrayList<String>();
        returnList.add("Hållbara transporter");
        returnList.add("Förnyelsebar energi");
        returnList.add("Minska koldioxidutsläpp");
        return returnList;
    }

    public ArrayList<String> getClimateQuestionableIndustriesNames() {
        ArrayList<String> returnList = new ArrayList<String>();
        returnList.add("Djurförsök");
        returnList.add("Termiskt kol");
        returnList.add("Alkohol");
        returnList.add("Arkiskt olja och gasproduktion");
        returnList.add("Bekämpningsmedel");
        returnList.add("Genmodifierade organismer");
        returnList.add("Handeldvapen");
        returnList.add("Kontroversiella vapen");
        returnList.add("Kärnkraft");
        returnList.add("Militärindustri");
        returnList.add("Palmolja");
        returnList.add("Pornografi");
        returnList.add("Päls och läderindustri");
        returnList.add("Spel och kasino");
        returnList.add("Tobak");
        returnList.add("Utvinning av oljesand");
        return returnList;
    }
    
    public float getQuestionableIndustryExposureForExposureWithThisNameForETFWithThisName(String exposureName, String ETFName){
        return 1.2f;
    }
    
    public float getClimatePositiveExposureForExposureWithThisNameForETFWithThisName(String exposureName, String ETFName ){
        return 1.0f;
        
    }

}

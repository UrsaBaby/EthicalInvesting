/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ethicalinvesting.structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Peter
 */
public class Person {

    private String name;
    private String mail;
    private ArrayList<QuestionableIndustryExposurePreference> thisQuestionableIndustryPreferences;
    private ArrayList<ClimatePositiveExposurePreference> thisClimatePositivePreferences;
    private HashMap<ETF, Float> myETFScores;

    public Person() {
        thisQuestionableIndustryPreferences = new ArrayList<QuestionableIndustryExposurePreference>();
        myETFScores = new HashMap<ETF, Float>();
        thisClimatePositivePreferences = new ArrayList<ClimatePositiveExposurePreference>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return this.name;
    }

    public String getMail() {
        return this.mail;
    }

    public ArrayList<QuestionableIndustryExposurePreference> getQuestionableIndustryExposurePreferences() {
        return thisQuestionableIndustryPreferences;
    }

    public String getStringRepForIndustryPreferences() {
        String returnString = "";
        if (!thisQuestionableIndustryPreferences.isEmpty()) {
            for (QuestionableIndustryExposurePreference checker : thisQuestionableIndustryPreferences) {
                returnString += "\n" + checker.toString();
            }
        }
        else{
            returnString += "\n"+ "Inga tvivelaktiga industripreferenser satta";
        }
        return returnString;
    }
    
    public String getStringRepForClimatePositivePreferences(){
        String returnString = "";
        if(!thisClimatePositivePreferences.isEmpty()){
            for(ClimatePositiveExposurePreference checker : thisClimatePositivePreferences){
                returnString += "\n" + checker.toString();
            }
        }
        else{
            returnString += "\n" + "Inga klimatpositiva preferenser satta";
        }
        return  returnString;
    }

    public void addQuestionableIndustryPreferenceIfItIsntAlreadyAdded(QuestionableIndustryExposurePreference addThisPreference) {
        if(!this.isContainingAQIEPrefWithThisName(addThisPreference.getIndustryName())){
              thisQuestionableIndustryPreferences.add(addThisPreference);
        }
    } //TODO Not tested

    public String toString() {
        String returnString = "Namn: "+ this.getName() + "\n" + "Mail: " + this.getMail();
         returnString += "\n" + "\n" + "Tvivelaktiga industripreferenser:";   
         returnString += getStringRepForIndustryPreferences();
         returnString += "\n" + "\n" + "KlimatPositiva prefersener";
         returnString += this.getStringRepForClimatePositivePreferences();

        return returnString;
    }
    
    public void setMyETFScores(HashMap<ETF, Float> theseScore){
        myETFScores = theseScore;
    }
    
    public QuestionableIndustryExposurePreference getQuestionableIndustryPreferenceWithThisName(String nameOfIndutryExposure){
          for(QuestionableIndustryExposurePreference checker : this.getQuestionableIndustryExposurePreferences()){
            if(checker.getIndustryName().equals(nameOfIndutryExposure)){
                return checker;
            }
        }
          System.out.println("Error in Person getQuestionableIndutryPreferenceWithThisName");
          return new QuestionableIndustryExposurePreference();
    }
    
    public ClimatePositiveExposurePreference getClimatePositivePreferenceWithThisName(String nameOfClimatePositivePreference){
        for(ClimatePositiveExposurePreference checker : thisClimatePositivePreferences){
            if(checker.getClimatePositiveExposurePreferenceName().equals(nameOfClimatePositivePreference)){
                return checker;
            }
        }
        System.out.println("Error in Person getClimatePositivePreferenceWithThisName");
        return new ClimatePositiveExposurePreference();
    }
    
    public ArrayList<ClimatePositiveExposurePreference> getClimatePositivePreferences(){
        return thisClimatePositivePreferences;
    }
    

    
    public boolean isContatiningACPEPreferenceWithThisName(String name){ 
        for(ClimatePositiveExposurePreference checker : this.getClimatePositivePreferences()){
            if(checker.getClimatePositiveExposurePreferenceName().equals(name)){
                return true;
            }           
        }
        return false;
    }
    
    public void addClimatePositiveExposurePreferenceIfNotAlreadyAdded(ClimatePositiveExposurePreference addThis){
        if(!this.isContatiningACPEPreferenceWithThisName(name)){
             this.getClimatePositivePreferences().add(addThis);
        }      
    }
    

    
    public boolean isContainingAQIEPrefWithThisName(String name){
        for(QuestionableIndustryExposurePreference checker : this.getQuestionableIndustryExposurePreferences()){
            if(checker.getIndustryName().equals(name)){
                return true;
            }
        }
        return false; //TODO not tested
    }

}

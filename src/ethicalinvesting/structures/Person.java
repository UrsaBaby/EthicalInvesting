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
    private ArrayList<QuestionableIndustryPreference> thisQuestionableIndustryPreferences;
    private ArrayList<ClimatePositiveExposurePreference> thisClimatePositivePreferences;
    private HashMap<ETF, Float> myETFScores;

    public Person() {
        thisQuestionableIndustryPreferences = new ArrayList<QuestionableIndustryPreference>();
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

    public ArrayList<QuestionableIndustryPreference> getQuestionableIndustryPreferences() {
        return thisQuestionableIndustryPreferences;
    }

    public String getStringRepForIndustryPreferences() {
        String returnString = "";
        if (!thisQuestionableIndustryPreferences.isEmpty()) {
            for (QuestionableIndustryPreference checker : thisQuestionableIndustryPreferences) {
                returnString += "\n" + checker.toString();
            }
        }
        else{
            returnString += "\n"+ "Inga preferense satta";
        }
        return returnString;
    }

    public void addQuestionableIndustryPreference(QuestionableIndustryPreference addThisPreference) {
        thisQuestionableIndustryPreferences.add(addThisPreference);
    }

    public String toString() {
        String returnString = "Namn: "+ this.getName() + "\n" + "Mail: " + this.getMail();
         returnString += "\n" + "Tvivelaktiga industripreferenser:";   
         returnString += getStringRepForIndustryPreferences();               
        return returnString;
    }
    
    public void setMyETFScores(HashMap<ETF, Float> theseScore){
        myETFScores = theseScore;
    }
    
    public QuestionableIndustryPreference getQuestionableIndustryPreferenceWithThisName(String nameOfIndutryExposure){
          for(QuestionableIndustryPreference checker : this.getQuestionableIndustryPreferences()){
            if(checker.getIndustryName().equals(nameOfIndutryExposure)){
                return checker;
            }
        }
          System.out.println("Error in Person getQuestionableIndutryPreferenceWithThisName");
          return new QuestionableIndustryPreference();
    }
    
    public ClimatePositiveExposurePreference getClimatePositivePreferenceWithThisName(String nameOfClimatePositivePreference){
        for(ClimatePositiveExposurePreference checker : thisClimatePositivePreferences){
            if(checker.getClmatePositiveExposureName().equals(nameOfClimatePositivePreference)){
                return checker;
            }
        }
        System.out.println("Error in Person getClimatePositivePreferenceWithThisName");
        return new ClimatePositiveExposurePreference();
    }
    
    public ArrayList<ClimatePositiveExposurePreference> getClimatePositivePreferences(){
        return thisClimatePositivePreferences;
    }
    
    public boolean isContainingACPEWithThisName(String name){
        for(ClimatePositiveExposurePreference checker : getClimatePositivePreferences()){
            if(checker.getClmatePositiveExposureName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    public boolean isContatiningACPEPreferenceWithThisName(String name){
        for(ClimatePositiveExposurePreference checker : this.getClimatePositivePreferences()){
            if(checker.getClmatePositiveExposureName().equals(name)){
                return true;
            }           
        }
        return false;
    }

}

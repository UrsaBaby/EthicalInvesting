/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ethicalinvesting.structures;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Peter
 */
public class Person {

    private String name;
    private String mail;
    private ArrayList<QuestionableIndustryPreference> personsQuestionableIndustryPreferences;

    public Person() {
        personsQuestionableIndustryPreferences = new ArrayList<QuestionableIndustryPreference>();
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

    public List<QuestionableIndustryPreference> getQuestionableIndustryPreferences() {
        return personsQuestionableIndustryPreferences;
    }

    public String getStringRepForIndustryPreferences() {
        String returnString = "";
        if (!personsQuestionableIndustryPreferences.isEmpty()) {
            for (QuestionableIndustryPreference checker : personsQuestionableIndustryPreferences) {
                returnString += "\n" + checker.toString();
            }
        }
        else{
            returnString += "\n"+ "No preferences added";
        }
        return returnString;
    }

    public void addQuestionableIndustryPreference(QuestionableIndustryPreference addThisPreference) {
        personsQuestionableIndustryPreferences.add(addThisPreference);
    }

    public String toString() {
        String returnString = "Name: "+ this.getName() + ", Mail: " + this.getMail();
         returnString += "\n" + "Industry preferences:";   
         returnString += getStringRepForIndustryPreferences();               
        return returnString;
    }
}

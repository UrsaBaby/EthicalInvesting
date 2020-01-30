/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ethicalinvesting.logic;

import ethicalinvesting.structures.ClimatePositiveExposure;
import ethicalinvesting.structures.ClimatePositiveExposurePreference;
import ethicalinvesting.structures.ETF;
import ethicalinvesting.structures.Person;
import ethicalinvesting.structures.QuestionableIndustryExposure;
import ethicalinvesting.structures.QuestionableIndustryPreference;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Peter
 */
public class Calculations {

    private float ETFssustainablityScore = 0;
    private ArrayList<QuestionableIndustryExposure> ETFsQIE;
    private ArrayList<QuestionableIndustryPreference> personsQIEPreferences;
    private ArrayList<QuestionableIndustryExposure> eTFsQIECorrespondingToPersonsPreferences;

    public Calculations() {

    }

    public float getScore(ETF thisETF, Person thisPerson) {
        float score = 0;
        float eTFsSustainabilityScore = thisETF.getSustainabilityScore();
        personsQIEPreferences = getPersonsQIEPreferencesWithAValueOverZero(thisPerson.getQuestionableIndustryPreferences());
        eTFsQIECorrespondingToPersonsPreferences = getETFsQIEForPersonsQIEPreferences(thisETF, personsQIEPreferences);

        return score;
    }

    private ArrayList<QuestionableIndustryPreference> getPersonsQIEPreferencesWithAValueOverZero(ArrayList<QuestionableIndustryPreference> personsQIEPreferences) {
        ArrayList<QuestionableIndustryPreference> returnList = new ArrayList<QuestionableIndustryPreference>();
        for (QuestionableIndustryPreference checker : personsQIEPreferences) {
            if (checker.getPreferenceValue() > 0) {
                returnList.add(checker);
            }
        }
        return returnList;
    }
    
    private ArrayList<QuestionableIndustryExposure> getETFsQIEForPersonsQIEPreferences(ETF thisETF, ArrayList<QuestionableIndustryPreference> thisPersonsQIEPreferences){
      ArrayList<QuestionableIndustryExposure> returnList = new ArrayList<QuestionableIndustryExposure>();
      for(QuestionableIndustryPreference checker : thisPersonsQIEPreferences){
          returnList.add(thisETF.getQuestionableIndustryExposureForThisETFWithThisName(checker.getIndustryName()));
      }
      return returnList;
    }
    
    private ArrayList<ClimatePositiveExposurePreference> getPersonsCPEPreferencesWithValuoOverZero (Person thisPersons){
        ArrayList<ClimatePositiveExposurePreference> returnList = new ArrayList<ClimatePositiveExposurePreference>();
        for(ClimatePositiveExposurePreference checker : thisPersons.getClimatePositivePreferences()){
          if(checker.getClimatePositiveExposureValue() > 0){
              returnList.add(checker);
          } 
        }
        return returnList;
    }
    
    private ArrayList<ClimatePositiveExposure> getETFsCPEByAListOfPersonsCPEPreferences(ETF thisETF, ArrayList<ClimatePositiveExposurePreference> thisPreferences){
        ArrayList<ClimatePositiveExposure> returnList = new ArrayList<ClimatePositiveExposure>();
        for(ClimatePositiveExposurePreference checker : thisPreferences){
            thisETF.ge
        }
    }
           
}


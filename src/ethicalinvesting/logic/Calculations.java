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
import ethicalinvesting.structures.QuestionableIndustryExposurePreference;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Peter
 */
public class Calculations {

  
   
    public Calculations() {

    }

    public float getScore(ETF thisETF, Person thisPerson) {
        float returnScore = 0;

        //  eTFsQIECorrespondingToPersonsPreferences = getETFsQIEForPersonsQIEPreferences(thisETF, personsQIEPreferences);
        // personsQIEPreferences = getPersonsQIEPreferencesWithAValueOverZero(thisPerson.getQuestionableIndustryPreferences());
        float eTFsSustainabilityScore = thisETF.getSustainabilityScore();
      //  System.out.println(eTFsSustainabilityScore);
        float QIEScore = getQIEScoreForThisPersonForThisETF(thisPerson, thisETF);
       // System.out.println(QIEScore);
        float CPEScore = getCPEScoreForThisPersonForThisETF(thisPerson, thisETF);
        //System.out.println(CPEScore);
        returnScore = eTFsSustainabilityScore * QIEScore * CPEScore;

        return returnScore;
    }

    private float getCPEScoreForThisPersonForThisETF(Person thisPerson, ETF thisETF) { //TODO might have to be adjusted.
        float returnfloat = 0;
        for (ClimatePositiveExposure checker : thisETF.getCPEList()) {

            if (thisPerson.isContatiningACPEPreferenceWithThisName(checker.getName())) {
                float addFloat = checker.getExposure() * thisPerson.getClimatePositivePreferenceWithThisName(checker.getName()).getClimatePositiveExposureValue();
                returnfloat += addFloat;
            }
        }
        return returnfloat;
    }

    private float getQIEScoreForThisPersonForThisETF(Person thisPerson, ETF thisETF) { //not tested
        float retunFloat = 0;
        float addFloat = 100;
        for (QuestionableIndustryExposurePreference checker : thisPerson.getQuestionableIndustryExposurePreferences()) {
            
            if (thisETF.isContainingQIEWithThisName(checker.getIndustryName())) {
                addFloat -= thisETF.getQuestionableIndustryExposureWithThisName(checker.getIndustryName()).getExposureValue() * checker.getPreferenceValue();
            }
            retunFloat += addFloat;
        }
        return retunFloat / 100;
    }

}

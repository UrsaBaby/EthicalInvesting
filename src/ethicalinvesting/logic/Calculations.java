/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ethicalinvesting.logic;

import ethicalinvesting.structures.ETF;
import ethicalinvesting.structures.Person;
import ethicalinvesting.structures.QuestionableIndustryExposure;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Peter
 */
public class Calculations {

    private HashMap<ETF, Float> ETFScores;

    public Calculations() {
        ETFScores = new HashMap<ETF, Float>();
    }

    public HashMap<ETF, Float> calculateScoresForTheseETFsForThisPerson(ArrayList<ETF> thisETFs, Person thisPerson) {
        HashMap<ETF, Float> returnMap = new HashMap<ETF, Float>();
        
        
        return returnMap;
    }
    
    public float getPersonsScoreForThisQuestionableIndustry(Person thisPerson, String thisIndustry){
        return thisPerson.getQuestionableIndustryPreferenceWithThisName(thisIndustry).getPreferenceValue();
    }
    
    public float getETFsExposureForThisQuestionableIndustry(ETF thisETF, String thisIndustry){
        return thisETF.getQuestionableIndustryExposureForThisETFWithThisName(thisIndustry).getExposureValue();
    }

    public float getPersonsScoreForThisETFsQuestionableIndutryExposure(Person thisPerson,ETF thisETF, String nameOfExposure) {    
        float eTFIndustryExposure = thisETF.getQuestionableIndustryExposureForThisETFWithThisName(nameOfExposure).getExposureValue();
        float personIndustryExposurePreference = thisPerson.getQuestionableIndustryPreferenceWithThisName(nameOfExposure).getPreferenceValue();
        return eTFIndustryExposure*personIndustryExposurePreference;
    }

    public float getScoreForThisETFForThisPerson(ETF thisETF, Person thisPerson) {

        return 0.0f;
    }

    public HashMap<ETF, Float> getETFSScores() {
        return ETFScores;
    }
}

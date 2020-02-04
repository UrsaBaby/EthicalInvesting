/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import ethicalinvesting.database.ETFs.ListOfETFs;
import ethicalinvesting.logic.Calculations;
import ethicalinvesting.structures.ClimatePositiveExposure;
import ethicalinvesting.structures.ClimatePositiveExposurePreference;
import ethicalinvesting.structures.ETF;
import ethicalinvesting.structures.Person;
import ethicalinvesting.structures.QuestionableIndustryExposure;
import ethicalinvesting.structures.QuestionableIndustryExposurePreference;

/**
 *
 * @author Peter
 */
public class logicInterface {
    ListOfETFs ETFList = new ListOfETFs();
    Person testPerson;
    String personName = "Ajax";
    String ETFName = "Fond";
    String QIEName = "Kolindustri";
    String CPEName = "Hållbara transporter";
    float QIEValue = 10;
    float QIEPrefValue = 1.0f;
    float CPEValue = 20;
    float CPEPrefValue = 0.1f;
    float sustainabilityScore = 10;
    Calculations calculator = new Calculations();
    
    public void TestRun(){ //WORKS!
        testPerson = this.createPerson(personName);
        ETFList.addETF(this.createETF(ETFName));
        ETFList.getETFByName(ETFName).addQuestionableIndustryExposure(this.createQuestionableIndustryExposure(QIEName));
        ETFList.getETFByName(ETFName).getQuestionableIndustryExposureWithThisName(QIEName).setExposure(QIEValue);
        ETFList.getETFByName(ETFName).addClimatePositiveExposure(this.createClimatePositiveExposure(CPEName));
        ETFList.getETFByName(ETFName).getClimatePositiveExposureWithThisName(CPEName).setExposure(CPEValue);
        ETFList.getETFByName(ETFName).setSustainabilityScore(sustainabilityScore);
        
        
        testPerson.addQuestionableIndustryPreferenceIfItIsntAlreadyAdded(this.createQuestionableIndutryExposurePreference(QIEName));
        testPerson.getQuestionableIndustryPreferenceWithThisName(QIEName).setPreferenceValue(QIEPrefValue);
        testPerson.addClimatePositiveExposurePreferenceIfNotAlreadyAdded(this.createClimatePositiveExposurePreference(CPEName));
        testPerson.getClimatePositivePreferenceWithThisName(CPEName).setClimatePositiveExposurePreferenceValue(CPEPrefValue);
        System.out.println(testPerson);
        System.out.println("---");
        System.out.println(ETFList.getETFByName(ETFName));
        System.out.println("---");
        System.out.println(calculator.getScore(ETFList.getETFByName(ETFName), testPerson));
              
    }
    
    public Person createPerson(String name){
        Person newPerson = new Person();
        newPerson.setName(name);
        return newPerson;
    }
    
    public ETF createETF(String name){
        ETF newETF = new ETF();
        newETF.setName(name);
        return newETF;
    }
    
    public QuestionableIndustryExposure createQuestionableIndustryExposure(String name){
        QuestionableIndustryExposure newQIE = new QuestionableIndustryExposure();
        newQIE.setIndustryName(name);
        return newQIE;
    }
    
    public QuestionableIndustryExposurePreference createQuestionableIndutryExposurePreference(String namme){
        QuestionableIndustryExposurePreference newQIEPref = new QuestionableIndustryExposurePreference();
        newQIEPref.setIndustry(namme);
        return newQIEPref;
        
    }
    
    public ClimatePositiveExposure createClimatePositiveExposure(String name){
        ClimatePositiveExposure newCPE = new ClimatePositiveExposure();
        newCPE.setExposureName(name);
        return newCPE;
    }
    
    public ClimatePositiveExposurePreference createClimatePositiveExposurePreference(String name){
        ClimatePositiveExposurePreference newCPEPref = new ClimatePositiveExposurePreference();
        newCPEPref.setClimatePositiveExposurePreferenceName(CPEName);
        return newCPEPref;
    }
    
    
}

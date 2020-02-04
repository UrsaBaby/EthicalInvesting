/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ethicalinvesting;

import ethicalinvesting.Utilites.AppUtilities;
import ethicalinvesting.database.ETFs.ListOfETFs;
import ethicalinvesting.logic.Calculations;
import ethicalinvesting.structures.ClimatePositiveExposure;
import ethicalinvesting.structures.ClimatePositiveExposurePreference;
import ethicalinvesting.structures.ETF;
import ethicalinvesting.structures.Person;
import ethicalinvesting.structures.QuestionableIndustryExposure;
import ethicalinvesting.structures.QuestionableIndustryExposurePreference;
import interfaces.logicInterface;

/**
 *
 * @author Peter
 */
public class EthicalInvesting {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        logicInterface logicInterface = new logicInterface();
        logicInterface.TestRun();
        /*ETF newETF = new ETF();
        newETF.setName("Peters SuperFond");
        newETF.setIndustry("Aktiefond");
        newETF.setSustainabilityScore(2.2f);
        ///
        ///
        ///
        System.out.println(newETF);
        System.out.println("---");
        ///
        ///
        ///
        ClimatePositiveExposure newCPE = new ClimatePositiveExposure();
        newCPE.setExposureName("PositivExponeringTest");
        newCPE.setExposure(3.7f);
        ///
        ///
        ///
        QuestionableIndustryExposure newQIE = new QuestionableIndustryExposure();
        newQIE.setIndustryName("IfrågasattIndustriTesT");
        newQIE.setExposure(7.6f);
        ///
        ///
        ///
        Person testPerson = new Person();
        testPerson.setName("Ajax");
        testPerson.setMail("asD@ad.com");
        ///
        ///
        ///
        QuestionableIndustryExposurePreference thisPreference = new QuestionableIndustryExposurePreference();
        thisPreference.setIndustry("IfrågasattIndustriTesT");
        thisPreference.setPreferenceValue(0.5f);
        testPerson.addQuestionableIndustryPreferenceIfItIsntAlreadyAdded(thisPreference);

        System.out.println(testPerson.toString());
        System.out.println("---");
        ///
        ///
        ///
        testPerson.addQuestionableIndustryPreferenceIfItIsntAlreadyAdded(thisPreference);
        System.out.println(testPerson.getQuestionableIndustryPreferenceWithThisName(thisPreference.getIndustryName()));
        Calculations calculator = new Calculations();
        ///
        ///
        ///
        System.out.println("---");
        newETF.addClimatePositiveExposure(newCPE);
        System.out.println(newETF.getClimatePositiveExposureWithThisName("PositivExponeringTest"));
        ///
        ///
        ///
        ClimatePositiveExposurePreference newCPEPref = new ClimatePositiveExposurePreference();
        newCPEPref.setClimatePositiveExposurePreferenceName("PositivExponeringTest");
        testPerson.addClimatePositiveExposurePreference(newCPEPref);
        System.out.println(testPerson.isContatiningACPEPreferenceWithThisName(newCPEPref.getClimatePositiveExposurePreferenceName()));
        ///
        newETF.addQuestionableIndustryExposure(newQIE);
        System.out.println(newETF.isContainingQIEWithThisName(newQIE.getIndustryExposureName()));
        System.out.println(newETF.isContainingCPEWithTHisName(newCPE.getName()));
        ///
        ///
        ///
        System.out.println(calculator.getScore(newETF, testPerson));
        ///
        ///
        ///
        System.out.println(testPerson);*/
    }

}

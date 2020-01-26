/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ethicalinvesting;

import ethicalinvesting.Utilites.AppUtilities;
import ethicalinvesting.logic.Calculations;
import ethicalinvesting.structures.ClimatePositiveExposure;
import ethicalinvesting.structures.ETF;
import ethicalinvesting.structures.Person;
import ethicalinvesting.structures.QuestionableIndustryExposure;
import ethicalinvesting.structures.QuestionableIndustryPreference;

/**
 *
 * @author Peter
 */
public class EthicalInvesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ETF newETF = new ETF();
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
        QuestionableIndustryPreference thisPreference = new QuestionableIndustryPreference();
        thisPreference.setIndustry("IndustriPreferens");
        thisPreference.setPreferenceValue(0.5f);
        testPerson.addQuestionableIndustryPreference(thisPreference);

        System.out.println(testPerson.toString());
        System.out.println("---");
        ///
        ///
        ///
        testPerson.addQuestionableIndustryPreference(thisPreference);
        System.out.println(testPerson.getQuestionableIndustryPreferenceWithThisName(thisPreference.getIndustryName()));
        Calculations calculator = new Calculations();
        ///
        ///
        ///
        System.out.println("---");
        newETF.addClimatePositiveExposure(newCPE);
        System.out.println(newETF.getClimatePositiveExposureWithThisName("PositivExponeringTest"));
    }

}

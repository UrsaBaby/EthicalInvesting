/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ethicalinvesting;

import ethicalinvesting.Utilites.AppUtilities;
import ethicalinvesting.structures.ClimatePositiveExposure;
import ethicalinvesting.structures.ETF;
import ethicalinvesting.structures.Person;
import ethicalinvesting.structures.QuestionableIndustryExposure;

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
        System.out.println(newETF);
        System.out.println("---");
        ClimatePositiveExposure newCPE = new ClimatePositiveExposure();
        newCPE.setExposureName("PositivExponeringTest");
        newCPE.setExposure(3.7f);
        QuestionableIndustryExposure newQIE = new QuestionableIndustryExposure();
        newQIE.setIndustryName("IfrågasattIndustriTesT");
        newQIE.setExposure(7.6f);
        Person testPerson = new Person();
        testPerson.setName("Ajax");
        testPerson.setMail("asD@ad.com");
        System.out.println(testPerson.toString());

       
    }
    
}

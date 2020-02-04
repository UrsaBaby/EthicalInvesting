/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ethicalinvesting.structures;

import ethicalinvesting.ImportData.ImportDataReader;
import ethicalinvesting.database.companies.ListOfCompanies;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Peter
 */
public class ETF {

    private String name;
    private ArrayList<ListOfCompanies> listOfCompanies;
    private ArrayList<QuestionableIndustryExposure> thisQuestionableIndustriesExposures;
    private ArrayList<ClimatePositiveExposure> thisClimatePositiveExposures;
    private float sustainabilityScore;
    private String industry;
    private String type;

    public ETF() {
        
        thisQuestionableIndustriesExposures = new ArrayList<QuestionableIndustryExposure>();
        thisClimatePositiveExposures = new ArrayList<ClimatePositiveExposure>();
    }

    public void setSustainabilityScore(float score) {
        this.sustainabilityScore = score;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public float getSustainabilityScore() {
        return this.sustainabilityScore;
    }

    public String getIndustry() {
        return this.industry;
    }

    public String getStringRepForClimatePositiveExposures() {
        String returnString = "";
        for (ClimatePositiveExposure checker : thisClimatePositiveExposures) {
            returnString += "\n" + checker.getName() + " " + checker.getExposure() + "%";
        }
        return returnString;
    }

    public String getStringRepForQuestionableIndustryExposures() {
        String returnString = "";
        for (QuestionableIndustryExposure checker : thisQuestionableIndustriesExposures) {
            returnString += "\n" + checker.getIndustryExposureName() + " " + checker.getExposureValue() + "%";
        }
        return returnString;
    }

    public String toString() {
        String returnString = "Fondnamn: " + this.getName() + "\n" + "Fondinfo: " + this.getIndustry() + "\n" + "Hållbarhetspoäng: " + this.getSustainabilityScore();
        returnString += "\n" + "\n" + "Klimatpositiv exponering:";
        returnString += this.getStringRepForClimatePositiveExposures();
        returnString += "\n" + "\n" + "Exponering mot ifrågasatta branscher:";
        returnString += this.getStringRepForQuestionableIndustryExposures();
        return returnString;
    }

    public QuestionableIndustryExposure getQuestionableIndustryExposureWithThisName(String IndustryExposureName) {

        for (QuestionableIndustryExposure checker : thisQuestionableIndustriesExposures) {
            if (checker.getIndustryExposureName().equals(IndustryExposureName)) {
                return checker;
            }
        }
        System.out.println("Error in ETF getQuestionableIndustryExposureForThisETFWithThisName");
        return new QuestionableIndustryExposure();

    }

    public void addQuestionableIndustryExposure(QuestionableIndustryExposure thisQuestionableIndustry) {
        if (!this.isContainingQIEWithThisName(thisQuestionableIndustry.getIndustryExposureName())) {
            thisQuestionableIndustriesExposures.add(thisQuestionableIndustry);
        }

    }

    public void addClimatePositiveExposure(ClimatePositiveExposure thisClimatePositiveExposure) {
        if (!this.isContainingCPEWithTHisName(thisClimatePositiveExposure.getName())) {
            thisClimatePositiveExposures.add(thisClimatePositiveExposure);
        }
    }

    public ClimatePositiveExposure getClimatePositiveExposureWithThisName(String climatePositiveExposureName) {
        for (ClimatePositiveExposure checker : thisClimatePositiveExposures) {
            if (checker.getName().equals(climatePositiveExposureName)) {
                return checker;
            }
        }
        System.out.println("Error in ETF getClimatePositiveExposureWithThisName, climate positive exposure not found");
        return new ClimatePositiveExposure();
    }

    public boolean isContainingCPEWithTHisName(String name) {
        for (ClimatePositiveExposure checker : this.getCPEList()) {
            if (checker.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<ClimatePositiveExposure> getCPEList() {
        return this.thisClimatePositiveExposures;
    }

    public ArrayList<QuestionableIndustryExposure> getQIEList() {
        return this.thisQuestionableIndustriesExposures;
    }

    public boolean isContainingQIEWithThisName(String name) {
        for (QuestionableIndustryExposure checker : this.getQIEList()) {
            if (checker.getIndustryExposureName().equals(name)) {
                return true;
            }
        }
        return false;
    }

}

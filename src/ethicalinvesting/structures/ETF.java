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
    private ImportDataReader importDataReader;

    public ETF() {
        importDataReader = new ImportDataReader();
        thisQuestionableIndustriesExposures = new ArrayList<QuestionableIndustryExposure>();
        thisClimatePositiveExposures = new ArrayList<ClimatePositiveExposure>();
      //  addClimatePostiveExposuresToThisListWithTheseNames(thisClimatePositiveExposures, importDataReader.getClimatePositiveExposureForETF());
    //    addQuestionableIndustryExposureToThisListWithTheseNames(thisQuestionableIndustriesExposures, importDataReader.getClimateQuestionableIndustriesNames()); Should not be here
       // setClimatePositiveExposureOnThisList(thisClimatePositiveExposures);
    //    setQuestionableIndustryExposureOnThisList(thisQuestionableIndustriesExposures); Should not be here
    }

    public void setSustainabilityScore(float score) {
        this.sustainabilityScore = score;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    private void addClimatePostiveExposuresToThisListWithTheseNames(ArrayList<ClimatePositiveExposure> listOfClimatePositiveExposures, ArrayList<String> listOfClimatePositiveExposuresNames) {
        for (String checker : listOfClimatePositiveExposuresNames) {
            ClimatePositiveExposure addClimate = new ClimatePositiveExposure();
            addClimate.setExposureName(checker);
            listOfClimatePositiveExposures.add(addClimate);
        }
    }

    private void addQuestionableIndustryExposureToThisListWithTheseNames(ArrayList<QuestionableIndustryExposure> listOfIndustryQuestionableIndustryExposures, ArrayList<String> listOfQuestionableIndustriesNames) {
        for (String checker : listOfQuestionableIndustriesNames) {
            QuestionableIndustryExposure addIndustry = new QuestionableIndustryExposure();
            addIndustry.setIndustryName(checker);
            listOfIndustryQuestionableIndustryExposures.add(addIndustry);
        }
    }

    private void setClimatePositiveExposureOnThisList(ArrayList<ClimatePositiveExposure> thisList) {
        for (ClimatePositiveExposure checker : thisList) {
            checker.setExposure(importDataReader.getClimatePositiveExposureForExposureWithThisNameForETFWithThisName(checker.getName(), this.getName()));
        }
    }

    private void setQuestionableIndustryExposureOnThisList(ArrayList<QuestionableIndustryExposure> thisList) {
        for (QuestionableIndustryExposure checker : thisList) {
            checker.setExposure(importDataReader.getQuestionableIndustryExposureForExposureWithThisNameForETFWithThisName(checker.getIndustryExposureName(), this.getName()));
        }
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

    public QuestionableIndustryExposure getQuestionableIndustryExposureForThisETFWithThisName(String IndustryExposureName) {
      
            for (QuestionableIndustryExposure checker : thisQuestionableIndustriesExposures) {
                if (checker.getIndustryExposureName().equals(IndustryExposureName)) {
                    return checker;
                }
            }
        System.out.println("Error in ETF getQuestionableIndustryExposureForThisETFWithThisName");
    return new QuestionableIndustryExposure();

    }
    
    public void addQuestionableIndustryExposure(QuestionableIndustryExposure thisQuestionableIndustry){
        thisQuestionableIndustriesExposures.add(thisQuestionableIndustry);
    }
    
    public void setQuestionableIndustryWithThisNameToThisExposureValue(String questionableIndustryExposureName, float value){
        for(QuestionableIndustryExposure checker : thisQuestionableIndustriesExposures){
            if(checker.getIndustryExposureName().equals(questionableIndustryExposureName)){
                checker.setExposure(value);
            }
        }
    }
    
    public void addClimatePositiveExposure(ClimatePositiveExposure thisClimatePositiveExposure){
        thisClimatePositiveExposures.add(thisClimatePositiveExposure);
    }
    
    public ClimatePositiveExposure getClimatePositiveExposureWithThisName(String climatePositiveExposureName){
        for(ClimatePositiveExposure checker : thisClimatePositiveExposures){
            if(checker.getName().equals(climatePositiveExposureName)){
                return checker;
            }
        }
        System.out.println("Error in ETF getClimatePositiveExposureWithThisName, climate positive exposure not found");
        return new ClimatePositiveExposure();
    }
    
    //TODO boolean isContainingCPEWithTHisName(String name)

}

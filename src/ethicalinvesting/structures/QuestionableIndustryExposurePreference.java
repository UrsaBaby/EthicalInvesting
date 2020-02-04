/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ethicalinvesting.structures;

/**
 *
 * @author Peter
 */
public class QuestionableIndustryExposurePreference {
    private float preferenceValue;
    private String industry;
    
    public void setIndustry(String industry){
        this.industry = industry;
    }
    
    public void setPreferenceValue(float preferenceValue){
        this.preferenceValue = preferenceValue;
    }
    
    public String getIndustryName(){
        return this.industry;
    }
    
    public float getPreferenceValue(){
        return this.preferenceValue;
    }
    
    public String toString(){
        return this.getIndustryName() + " " + this.getPreferenceValue() + "%";
    }
}

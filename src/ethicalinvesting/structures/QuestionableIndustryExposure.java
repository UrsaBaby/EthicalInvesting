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
public class QuestionableIndustryExposure {
    private String name;
    private float exposure;

    
    public QuestionableIndustryExposure(){

    }
    
    public void setIndustryName(String name){
        this.name = name;
    }
    
    public void setExposure(float exposure){
        this.exposure = exposure;
    }
    
    public String getIndustryExposureName(){
        return this.name;
    }
    
    public float getExposureValue(){
        return exposure;
    }
    
    public String toString(){
        return "Industry: " + this.getIndustryExposureName() + ", Exposure: " + this.getExposureValue() + "%";
    }
    
    
}

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
public class ClimatePositiveExposurePreference {
    private String climatePositiveExpoureName;
    private float climatePositiveExposureValue;
    
    public void setClimatePositiveExposureName(String exposureName){
        this.climatePositiveExpoureName = exposureName;
    }
    
    public void setClimatePositiveExposureValue(float exposureValue){
        this.climatePositiveExposureValue = exposureValue;
    }
    
    public String getClmatePositiveExposureName(){
        return this.climatePositiveExpoureName;
    }
    
    public float getClimatePositiveExposureValue(){
        return this.climatePositiveExposureValue;
    }
    
    public String toString(){
        return this.getClmatePositiveExposureName() + " " + this.getClimatePositiveExposureValue() + "%";
    }
    
    
}

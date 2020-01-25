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
public class ClimatePositiveExposure {
    private String name;
    private float value;
    
    public void setExposureName(String name){
        this.name = name;
    }
    
    public void setExposure(float value){
        this.value = value;
    }
    
    public String getName(){
        return  this.name;
    }
    
    public float getExposure(){
        return this.value;
    }
    
    public String toString(){
        return this.getName() + ": " + this.getExposure() + "%";
    }
    
}

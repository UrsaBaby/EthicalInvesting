/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ethicalinvesting.database.ETFs;

import ethicalinvesting.Utilites.AppUtilities;
import ethicalinvesting.structures.ETF;
import java.util.ArrayList;

/** 
 *
 * @author Peter
 */
public class ListOfETFs {
    private ArrayList<ETF> listOfETFs;
  
    
    
    public ListOfETFs(){
        listOfETFs = new ArrayList<ETF>();
    }
    
    public void addETF(ETF addETF){
        listOfETFs.add(addETF);
    }
    
    public ETF getETFByName(String name){
        for(ETF checker : listOfETFs){
            if(AppUtilities.normalizeText(checker.getName()).equals(AppUtilities.normalizeText(name))){
                return checker;
            }
        }
      return null; 
    }
    
    public boolean isETFInListByName(String name){
      for(ETF checker : this.listOfETFs){
          if(checker.getName().equals(name)){
              return true;
          }
      }
      return false;
    }
}

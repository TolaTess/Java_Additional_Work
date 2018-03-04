/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection;

/**
 *
 * @author tolaotesanya
 */
public class MySelection {
    
    private int cdNum;
    private int discount;
    
    public MySelection(){
        //empty contruction = default values
    }
    public void setCdNum(int cdNum){
        this.cdNum = cdNum;
    }
    
    public int getDiscount(){
        return discount;
    }
    
    public void calculateDiscount(){
        
        if(cdNum >= 10 && cdNum <=19){
            discount = 20;
        }
        else if(cdNum >=20 && cdNum <=39){
            discount = 30;
        }
        else if(cdNum >=40){
            discount = 50;
        }
        else {
            discount = 0;
        }
        
    }
}

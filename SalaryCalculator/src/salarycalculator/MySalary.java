/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculator;

import java.util.ArrayList;

/**
 *
 * @author tolaotesanya
 */
public class MySalary implements SalaryInterface {
               
        ArrayList<Double> list;
    public MySalary(){
        list = new ArrayList< Double >();
    }             
    public void add(Object obj){
        list.add(0,(double) obj);
    }
    public Double remove(){
        if(!(list.isEmpty())){
            return list.remove(0);
    }
        else 
            return null;
    }
    public Double removeAll(){
        list.clear();
            return null;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculator;

/**
 *
 * @author tolaotesanya
 */
public class SalaryCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                               
                SalaryInterface sal = new MySalary();
                MySalaryGUI mySal = new MySalaryGUI();
                mySal.setVisible(true);
 
                               
 
}
 
}
 

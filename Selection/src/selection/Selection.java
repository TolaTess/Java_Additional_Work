/*
    Write an application that allows a user to enter the number of CDs they wish to 
    purchase and displays the discount associated with that quantity.
    >10 = 20%
    >20 = 30%
    >40 = 50%
    @author Tola Otesanya
    Selection example - Extra work 
 */
package selection;

/**
 *
 * @author tolaotesanya
 */
import java.util.Scanner;
public class Selection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        MySelection myS = new MySelection();
        
        int cd, discount;
        System.out.println("Welcome to MySelection CD discount Shop\n");
        System.out.println("Please enter how many CD's you wish to buy\n");
        cd = in.nextInt();
        myS.setCdNum(cd);
        myS.calculateDiscount();
        discount = myS.getDiscount();
        System.out.println("You will get a " + discount + "% discount\n");
        
        System.exit(0);
         
    }
    
}

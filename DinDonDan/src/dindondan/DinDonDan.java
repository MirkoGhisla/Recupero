/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondan;

/**
 *
 * @author Mirko Ghislanzoni
 */
public class DinDonDan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatiCondivisi d = new DatiCondivisi(0);
        
        ThreadCampane din = new ThreadCampane("Din", d);
        ThreadCampane don = new ThreadCampane("Don", d);
        ThreadCampane dan = new ThreadCampane("Dan", d);
        
        din.start();
        don.start();
        dan.start();
        
        try{
            din.join();
            don.join();
            dan.join();
        }catch(InterruptedException ex){
        }
    }
    
}

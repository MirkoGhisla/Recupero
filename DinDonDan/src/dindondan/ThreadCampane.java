/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondan;

/**
 *
 * @author ghislanzoni_mirko
 */
public class ThreadCampane extends Thread {
    private String suono;
    private DatiCondivisi d;
    
    public ThreadCampane(String suono, DatiCondivisi d){
        this.suono=suono;
        this.d=d;
    }
    
    @Override
    public void run(){
        while(d.getCounter()>=0){
            System.out.println(suono);
            d.decrementa();
        }
    }
}

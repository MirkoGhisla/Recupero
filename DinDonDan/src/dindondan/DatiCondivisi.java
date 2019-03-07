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
public class DatiCondivisi {
    private int counter;
    
    public DatiCondivisi(int counter){
        this.counter=counter;
    }
    
    public void decrementa(){
        counter--;
    }

    public int getCounter() {
        return counter;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_system;

/**
 *
 * @author Joe
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        
        Register reg = new Register();
        
        reg.startSale(new FakeDatabase());
        
        reg.addItemToSale("234567", 2);
        reg.addItemToSale("135792", 1);
        
        reg.endSale();
        
    }
    
}

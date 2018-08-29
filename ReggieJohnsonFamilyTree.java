/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reggiejohnsonfamilytree;

/**
 *
 * @author rbowlen
 */
public class ReggieJohnsonFamilyTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReggieJohnson reggie = new ReggieJohnson("Reggie Johnson", "Male", 7);
        YeeDebraJohnson yeeDeb = new YeeDebraJohnson("YeeDebra Johnson", 
                "Female", 9);
        
        reggie.fight(yeeDeb);
        
        
        
        
    }
    
}

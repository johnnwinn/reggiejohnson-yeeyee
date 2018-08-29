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
public class FamilyMember implements Person {

    //Personal information
    String name = "";
    String age = "";
    String race = "";
    String height = "";
    String gender = "";
    int gains; //Gains measured from 0-9 - used for fighting.
    
    
    public FamilyMember(String name, String gender, int gains){
        this.name = name;
        this.gender = gender;
        this.gains = gains;
    }
    
    @Override
    public void sayYeeYee() {
        System.out.println("YEE YEE!");
    }

    @Override
    public void putAGoodBeefJerkyIn() {
        System.out.println("Puts a large pinch of beef jerky in mouth.");
    }

    @Override
    public void revTruck() {
        System.out.println("VROOM!");
    }

    @Override
    public void workOnWords() {
        System.out.println("Stares long and hard at words. Tries hard.");
    }
    
}

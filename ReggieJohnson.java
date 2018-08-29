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
public class ReggieJohnson extends FamilyMember {

    public ReggieJohnson(String name, String gender, int gains) {
        super(name, gender, gains);
        this.name = name;
        this.gender = gender;
        this.gains = gains;
    }
    
    public void fight(FamilyMember m){
        System.out.println(this.name + " begins to fight " + m.name);
    }
}

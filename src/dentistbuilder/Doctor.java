/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentistbuilder;

/**
 *
 * @author Rana
 */
public class Doctor {
    private DentBuilder dentbuilder ;

    public Doctor(DentBuilder dentbuilder) {
        this.dentbuilder = dentbuilder;
    }
    
   public Dent getDent() {
       return this.dentbuilder.getDent() ;
   }
   
   public void  DentistFinder() {
       this.dentbuilder.buildPersonal();
       this.dentbuilder.buildBiography();
       this.dentbuilder.buildEducation();
       this.dentbuilder.buildAddress();
       this.dentbuilder.buildAreaOfSpecialization();
   }
    
}

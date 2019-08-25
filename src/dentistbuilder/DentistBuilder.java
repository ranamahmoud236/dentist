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
public class DentistBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DentBuilder general = new General() ;
        Doctor DOC = new Doctor(general) ;
         DOC.DentistFinder();
         Dentist DENT = DOC.getDent() ;
         
         
         DentBuilder specialist = new Specialist() ;
        Doctor doc = new Doctor(specialist) ;
         doc.DentistFinder();
         Dentist dent = doc.getDent() ;
         
         
         
       
         
         
         
         
         
         
    }
    
}

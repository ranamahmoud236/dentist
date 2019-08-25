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
public interface DentBuilder {
    
    public void buildPersonal ();
    
    public void buildBiography ( );

    public void buildEducation ( ) ;
    
    public void buildAddress ( );
    
    public void buildAreaOfSpecialization() ;
    
    public Dent getDent () ;
    
}

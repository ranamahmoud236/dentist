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
public interface Dentist {
    public void setPersonal (Personal personal  );
    
    public void setBiography (Biography biography );

    public void setEducation (Education education ) ;
    
    public void setAddress (Address address  );
    
    public void setAreaOfSpecialization(AreaOfSpecialization areaOfSpecialization) ;
    
}

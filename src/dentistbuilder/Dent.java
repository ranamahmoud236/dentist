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
public class Dent implements Dentist {
    
    private Personal personal ;
    private Biography biography ;
    private Education education ;
    private Address address ;
    private AreaOfSpecialization areaOfSpecialization ;
    
    
    

    public void setPersonal(Personal personal) {
        this.personal = personal ;
    }
    
    
    
    public void setBiography(Biography biography) {
        this.biography = biography ;
    
    }

    public void setEducation(Education education) {
        this.education = education ;
   
    }

    
    public void setAddress(Address address) {
        this.address = address ;
    }

    
    public void setAreaOfSpecialization(AreaOfSpecialization areaOfSpecialization) { 
        this.areaOfSpecialization =  areaOfSpecialization ;
    }
    
}

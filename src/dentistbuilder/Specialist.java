/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentistbuilder;

import java.util.Scanner;

/**
 *
 * @author Rana
 */
public class Specialist implements DentBuilder  {
    
    
    private Dent dent ;
   Scanner in = new Scanner (System.in);

    
    public void buildPersonal() {
        
        Personal personal = new Personal() ;
                 personal.setfName(in.next()); 
                 personal.setlName(in.next());
                 personal.setEmail(in.next());
                 personal.setWebsite(in.next());
                 personal.setPhoneNO(in.next());
        
        dent.setPersonal(personal);
    }
 
   
    public void buildBiography() {
       
       Biography biography = new Biography();
                 biography.setLicenseCountryName(in.next());
                 biography.setLicenseNo(in.next());
                 biography.setGender(in.next());
                 biography.setYear(in.nextInt());
                 
        dent.setBiography(biography);
    }

    
    public void buildEducation() {
        Education education = new Education();
                  education.setMajor(in.next());
                  education.setSchool(in.next());
                  education.setEyear(in.nextInt());
                  
        dent.setEducation(education);  
    }

   
    public void buildAddress() {
        Address address = new Address ();
                address.setCountry(in.next());
                address.setState(in.next());
                address.setCity(in.next());
                address.setStreet(in.next());
                address.setPostalCode(in.nextInt()) ;
                
        dent.setAddress(address);
                
    }

    
    public void buildAreaOfSpecialization() {
        AreaOfSpecialization areaOfSpecialization = new AreaOfSpecialization();
                             areaOfSpecialization.setArea(in.next());
                             areaOfSpecialization.setSyear(in.nextInt());
                             
        dent.setAreaOfSpecialization(areaOfSpecialization);
    }

    
    public Dent getDent() {
        return this.dent ;

    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentistbuilder;

import java.util.ArrayList;

/**
 *
 * @author Rana
 */
public class Personal {
    
    
    //Personal
     private String fName ;
    private String lName ;
    private String email;
    private String website ;
    private String phoneNO ;
    
    
   
    
    // Object
    ArrayList<Address> add = new ArrayList<Address>();
    ArrayList<Education> edu = new ArrayList<Education>();
    ArrayList<AreaOfSpecialization> area = new ArrayList<AreaOfSpecialization>() ;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNO = phoneNO;
    }

    public ArrayList<Address> getAdd() {
        return add;
    }

    public void setAdd(ArrayList<Address> add) {
        this.add = add;
    }

    public ArrayList<Education> getEdu() {
        return edu;
    }

    public void setEdu(ArrayList<Education> edu) {
        this.edu = edu;
    }

    public ArrayList<AreaOfSpecialization> getArea() {
        return area;
    }

    public void setArea(ArrayList<AreaOfSpecialization> area) {
        this.area = area;
    }
    
    

  
    
}

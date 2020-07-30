
package sbssecurity.model;
import java.sql.Blob;
import java.sql.Date;

public class Employee {
    private int empid;
 private String Firstname;  
 private String Middlename;
 private String Lastname;  
 private Date DOB;        
 private String Address;     
 private String city;       
 private String state;       

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public void setMiddlename(String Middlename) {
        this.Middlename = Middlename;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setAadharno(String aadharno) {
        this.aadharno = aadharno;
    }

    public void setContactno(int contactno) {
        this.contactno = contactno;
    }

    public void setImage(Blob Image) {
        this.Image = Image;
    }

    public void setDOJ(Date DOJ) {
        this.DOJ = DOJ;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setStillworking(String stillworking) {
        this.stillworking = stillworking;
    }

    public void setC_id(int C_id) {
        this.C_id = C_id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getMiddlename() {
        return Middlename;
    }

    public String getLastname() {
        return Lastname;
    }

    public Date getDOB() {
        return DOB;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getAadharno() {
        return aadharno;
    }

    public int getContactno() {
        return contactno;
    }

    public Blob getImage() {
        return Image;
    }

    public Date getDOJ() {
        return DOJ;
    }

    public String getDescription() {
        return Description;
    }

    public String getStillworking() {
        return stillworking;
    }

    public int getC_id() {
        return C_id;
    }
 private String aadharno;   
 private int contactno; 
private Blob Image; 

    public Employee() {
    }
 

    public Employee(int empid, String Firstname, String Middlename, String Lastname, Date DOB, String Address, String city, String state, String aadharno, int contactno, Blob Image, Date DOJ, String Description, String stillworking, int C_id) {
        this.empid = empid;
        this.Firstname = Firstname;
        this.Middlename = Middlename;
        this.Lastname = Lastname;
        this.DOB = DOB;
        this.Address = Address;
        this.city = city;
        this.state = state;
        this.aadharno = aadharno;
        this.contactno = contactno;
        this.Image = Image;
        this.DOJ = DOJ;
        this.Description = Description;
        this.stillworking = stillworking;
        this.C_id = C_id;
    }
 private Date DOJ;
 private String Description;
 private String stillworking;
 private int C_id;      
}

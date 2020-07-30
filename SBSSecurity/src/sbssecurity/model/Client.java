
package sbssecurity.model;

import java.sql.Date;

public class Client {
  private int clientid;
   private String fullname;
   private String Address;
   private int contactno;
   private String emailid;
 private Date regdate;
    public Client() {
    }

    public Client(int clientid, String fullname, String Address, int contactno, String emailid, Date regdate) {
        this.clientid = clientid;
        this.fullname = fullname;
        this.Address = Address;
        this.contactno = contactno;
        this.emailid = emailid;
        this.regdate = regdate;
    }

    public int getClientid() {
        return clientid;
    }

    public String getFullname() {
        return fullname;
    }

    public String getAddress() {
        return Address;
    }

    public int getContactno() {
        return contactno;
    }

    public String getEmailid() {
        return emailid;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setContactno(int contactno) {
        this.contactno = contactno;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }
  
}

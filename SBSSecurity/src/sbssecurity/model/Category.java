
package sbssecurity.model;
public class Category {
    private int cid;
    private String cname;
    private int salary;
    private String Description;

    public Category(int cid, String cname, int salary, String Description) {
        this.cid = cid;
        this.cname = cname;
        this.salary = salary;
        this.Description = Description;
    }

    public Category() {
    }

    public int getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public int getSalary() {
        return salary;
    }

    public String getDescription() {
        return Description;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
}

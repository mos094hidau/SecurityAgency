
package sbssecurity.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import sbssecurity.model.Category;
import sbssecurity.service.GetConnection;

public class CategoryDao {
   public static boolean addCategory(Category category){
   boolean status = false;
   Connection con = null;
   try{

    con = GetConnection.getConnection();
    String sql = "insert into category(cname,salary,Description) values(?,?,?)";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, category.getCname());
    ps.setInt(2,category.getSalary());
    ps.setString(3, category.getDescription());
    if(ps.executeUpdate()!=0)
     status = true;
   }
   catch(Exception e){
     e.printStackTrace();
   }
   return status;
  } 
   public static boolean updateCategory(Category category){
   boolean status = false;
   Connection con = null;
   try{
    con = GetConnection.getConnection();
    String sql = "Update category set salary = ?,description=? where cname= ?";
    PreparedStatement ps = con.prepareStatement(sql);
     ps.setInt(1,category.getSalary());
     ps.setString(2, category.getDescription());
    ps.setString(3, category.getCname()); 
    if(ps.executeUpdate()!=0)
     status = true;
   }
   catch(Exception e){
     e.printStackTrace();
   }
   return status;
  } 

   public static boolean deleteCategory(Category category){
   boolean status = false;
   Connection con = null;
   try{
      con = GetConnection.getConnection();
      String sql = "delete *from category where Cname = ?";
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setString(1,category.getCname());
      if(ps.executeUpdate()!=0)
       status = true;
   }
   catch(Exception e){
     e.printStackTrace();
   }
   finally{
      try{
       con.close();
      }
      catch(Exception e){
       e.printStackTrace();
      }
   }
   return status;
  }
   public static Category viewCategory(String categoryname){
       Connection con = null;
       String cname=categoryname;
       Category category = new Category();;
       try{
              con = GetConnection.getConnection();
    String sql = "select * from category where cname= ?";
    PreparedStatement ps = con.prepareStatement(sql);
     ps.setString(1,cname);
     ResultSet rs = ps.executeQuery();
     while(rs.next()){
     int id = rs.getInt(1);
           String categoryName = rs.getString(2);
           int salary=rs.getInt(3);
           String description=rs.getString(4);
          category.setCid(id);
          category.setCname(categoryName);
          category.setSalary(salary);
          category.setDescription(description);
     }
       }catch(Exception e){
           e.printStackTrace();
       }
        finally{
        try{
         con.close();
        }
        catch(Exception e){
          e.printStackTrace();
        }
     }
       return category;
   }
   public static ArrayList<Category> getCategoryList(){
     Connection con = null;
     ArrayList<Category>al = new ArrayList<>();
     try{
        con = GetConnection.getConnection();
        String sql = "select * from category";
        PreparedStatement ps =con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
           int id = rs.getInt(1);
           String categoryName = rs.getString(2);
           int salary=rs.getInt(3);
           String description=rs.getString(4);
           Category category = new Category(id, categoryName,salary,description);
           al.add(category);
        }
     }
     catch(Exception e){
        e.printStackTrace();
     }
     finally{
        try{
         con.close();
        }
        catch(Exception e){
          e.printStackTrace();
        }
     }
     return al;
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tatha
 */

    
   
    
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.xml.registry.infomodel.User;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yadavas9800
 */
public class Database {
    
    public static Connection getconnect(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://mis-sql.uhcl.edu/kurapativ5434", "kurapativ5434", "1447544");
        }
        catch(Exception e){
            e.printStackTrace();;
        }
        return con;
    }
    public static void createAccount(User u){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            con = getconnect();
            ps = con.prepareStatement("insert into datingtest01 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,u.getUfirstname());
            ps.setString(2,u.getUlastname());
            ps.setString(3,u.getUserid());
            ps.setString(4,u.getUemailid());
            ps.setString(5,u.getUpassword());
            ps.setString(6,u.getUgender());
            ps.setInt(7,u.getUage());
            ps.setString(8,u.getUcity());
            ps.setString(9,u.getUzipcode());
            ps.setString(10,u.getUdob());
            ps.setString(11,u.getUethnicity());
            ps.setString(12,u.getUreligion());
            ps.setString(13,u.getUlanguage());
            ps.setString(14,u.getUseeking());
            ps.setString(15,u.getUrelationshipstatus());
            ps.setString(16,u.getUeducation());
            ps.setString(17,u.getUoccupation());
            ps.setDouble(18,u.getUincome());
            ps.setString(19,u.getUtype());
            ps.setString(20,u.getUinterest01());
            ps.setString(21,u.getUinterest02());
            ps.setString(22,u.getUinterest03());
            ps.setString(23,u.getUsecurityq01());
            ps.setString(24,u.getUsecurityq02());
            ps.setString(25,u.getUanswer01());
            ps.setString(26,u.getUanswer02());
            ps.setInt(27,u.getMage());
            ps.setString(28,u.getMlanguage());
            ps.setDouble(29,u.getMincome());
            ps.setString(30,u.getMrelationshipstatus());
            ps.setString(31,u.getMreligion());
            ps.setString(32,u.getMethnicity());
            ps.setString(33,u.getMeducation());
            ps.setString(34,u.getMoccupation());
            ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static String checkUser(String username,String password){
          Connection con = null;
        try {
            con = Database.getconnect();
            PreparedStatement ps = con.prepareStatement("select * from datingtest01 where userid=?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString(1).equals(username)) {
                    if (rs.getString(2).equals(password)) {
                        return "successful";
                    }
                    return "not successful";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "not successful";
    }
    public static void matchByUser(String username){
          Connection con = null;
          Statement stat=null;
          ResultSet rs=null;
          
        ArrayList<String> matchusers = new ArrayList<String>();
        ArrayList<String> matched= new ArrayList<String>();
        try {
            con = Database.getconnect();
            stat =con.createStatement();
            String mlanguage="";
            String methnicity="";
            int mage=0;
            double mincome=0;
            String mrelationshipstatus="";
            String moccupation="";
            String meducation="";
            String mcity="";
            String searchrequest="";
            rs=stat.executeQuery("select *from datingtest01 where userid='"+username+"'");
            
            while(rs.next())
            {
                if(searchrequest.equalsIgnoreCase("mutual"))
                {
                mlanguage=rs.getString("mlanguage");
                methnicity= rs.getString("methnicity");
                mage=rs.getInt("mage");
                mincome=rs.getDouble("mincome");
                mrelationshipstatus=rs.getString("mrelationshipstatus");
                moccupation=rs.getString("moccupation");
                meducation=rs.getString("meducation");
                mcity=rs.getString("mcity");
                }
                else
                {
                 mlanguage=rs.getString("ulanguage");
                methnicity= rs.getString("uethnicity");
                mage=rs.getInt("uage");
                mincome=rs.getDouble("uincome");
                mrelationshipstatus=rs.getString("urelationshipstatus");
                moccupation=rs.getString("uoccupation");
                meducation=rs.getString("ueducation");
                mcity=rs.getString("ucity");   
                }
              
            }
            rs=null;
            rs=stat.executeQuery("select muserid from matched where userid='+"+username+"'");
            while(rs.next())
            {
                matched.add(rs.getString("muserid"));
            }
            rs=null;
           rs=stat.executeQuery("select userid from datingtest01 where mlanguage='"+mlanguage+"' or methniciyt='"+methnicity+"' or mage="+mage+" or mincome="+mincome+" or mrelationshipstatus='"+mrelationshipstatus+"' or moccupation='"+moccupation+"' or meducation='"+meducation+"' or mcity="+mcity+"'");
            while(rs.next())
            {
                if(!matched.contains(rs.getString("userid")))
                {
                     matchusers.add(rs.getString("userid"));
                }
               
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public static User getUserDetails(){
        //I have to write a function which renders all the details required for user when he login into the page..
        //user profile page
        //matches for him
        //likes or views for him
        //messages for him
        
        
    }
    







}

    
    
    


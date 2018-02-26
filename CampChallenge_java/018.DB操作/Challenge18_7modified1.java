
package DB_assignment;
import java.sql.*;


public class Challenge18_7modified1 {
    
    public static void main (String[] args){
        
        Connection db_con = null;
        PreparedStatement db_st = null;
        PreparedStatement db_ss = null;
        ResultSet db_data = null;
        
    try
    {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "masashi", "1192");
        
        db_st = db_con.prepareStatement("update profiles set name = ?, tel = ?, age = ?,"
                +" birthday = ? where profilesID = 1");
        db_st.setString(1, "佐藤望");
        db_st.setString(2, "090-6666-7777");
        db_st.setInt(3, 21);
        db_st.setString(4, "1989-09-09");
        
        int zikko = db_st.executeUpdate();
        
        db_ss = db_con.prepareStatement("select * from profiles");
        db_data = db_ss.executeQuery();
        
        while(db_data.next()){
            System.out.println(db_data.getString("profilesID"));
            System.out.println(db_data.getString("name"));
            System.out.println(db_data.getString("tel"));
            System.out.println(db_data.getString("age"));
            System.out.println(db_data.getString("birthday"));
            
        }
        
    
    }catch(SQLException e_sql){
        System.out.println("接続時にエラーが発生しました:"+e_sql.toString());
    }catch(Exception e){
        System.out.println(e);
    }finally{
     if(db_con != null){
       try{
       db_con.close();
       db_st.close();
       db_ss.close();
       db_data.close();
       System.out.println("close");
       }catch(Exception e){
        System.out.println("close error");  
       }
     }
}
}
    
}

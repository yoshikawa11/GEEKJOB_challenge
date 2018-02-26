package DB_assignment;
import java.sql.*;



public class Challenge18_1 {
    
    public static void main (String[] args){
        
        Connection db_con = null;
        PreparedStatement db_set = null;
        ResultSet db_data = null;
        
    try
    {
    
        Class.forName("com.sql.jdc.Driver").newInstance();
        db_con = DriverManager.getConnection("jdc:mysql://localhost:8889/Challenge_db", "masashi", "1192");
    
    }catch(SQLException e_sql){
        System.out.println("接続時にエラーが発生しました:"+e_sql.toString());
    }catch(Exception e){
    
    }
}
}

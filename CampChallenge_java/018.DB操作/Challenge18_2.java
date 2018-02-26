
package DB_assignment;
import java.sql.*;


public class Challenge18_2 {
    
    public static void main (String[] args){
        
        Connection db_con = null;
        PreparedStatement db_st = null;
        //System.out.print("aaaa");
        
    try
    {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "masashi", "1192");
        
        db_st = db_con.prepareStatement("insert into profiles values(?, ?, ?, ?, ?)");
        db_st.setInt(1, 6);
        db_st.setString(2, "佐藤大輔");
        db_st.setString(3, "0120-3333-2222");
        db_st.setInt(4, 30);
        db_st.setString(5, "1988-02-26");
        
        int zikko = db_st.executeUpdate();
        System.out.println("完了しました");
        
    
    }catch(SQLException e_sql){
        System.out.println("接続時にエラーが発生しました:"+e_sql.toString());
    }catch(Exception e){
        System.out.println(e);
    }finally{
     if(db_con != null){
       try{
       db_con.close();
       db_st.close();
       System.out.println("close");
       }catch(Exception e){
        System.out.println("close error");  
       }
     }
}
}
}
    


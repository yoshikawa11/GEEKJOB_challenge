package import_date;



import java.util.Date;
import java.text.SimpleDateFormat;



public class Challenge15_2 {
    
    public static void main(String[] args){
        
        Date now = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        String dateString = sdf.format(now);
        System.out.print(dateString);
        
    
    }
    
}

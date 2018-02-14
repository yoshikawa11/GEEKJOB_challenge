
package import_date;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;


public class challenge15_3 {
    
    public static void main(String[] args){
    
     Calendar c = Calendar.getInstance();
     Date d = new Date();
     
     c.set(2016,10,04,10,0,0);
     d = c.getTime();
     d.getTime();
     
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
     String dateString = sdf.format(d);
     System.out.print(dateString);
     
     
     
    }
    
}

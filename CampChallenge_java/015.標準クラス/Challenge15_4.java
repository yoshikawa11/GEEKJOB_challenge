
package import_date;

import java.util.Calendar;
import java.util.Date;

public class Challenge15_4 {
    
    public static void main(String[] args){
    
    Calendar c = Calendar.getInstance();
    Date d = new Date();
    
    c.set(2015,0,01,0,0,0);
    d = c.getTime();
    long date1 = d.getTime();
    
    c.set(2015,11,31,23,59,59);
    d = c.getTime();
    long date2 = d.getTime();
    System.out.print(date2-date1);
    
    
    }
}

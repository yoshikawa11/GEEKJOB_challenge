
package import_date;

import java.util.Date;


public class Challenge15_1 {
    
    public static void main(String[]args){
        
        Date someDay = new Date((long)47*365*24*60*60*1000);    //末尾にLでも可(47*365*24*60*60*1000L)
        System.out.print(someDay.getTime());
        
        //確認
//        long n = someDay.getTime();
//        Date aDay = new Date(n);
//        System.out.print(aDay);
        
    }
    
}

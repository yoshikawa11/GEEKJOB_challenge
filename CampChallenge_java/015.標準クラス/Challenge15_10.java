
package import_date;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Challenge15_10 {
    
    public static void main(String[] args)throws IOException{
    
    File newFile = new File("/Users/masashi/Documents/test/logfile.txt");
    
//    try{
//        if(newFile.createNewFile()){
//        System.out.print("success");
//    }else{   
//        System.out.print("fail");
//     }
//    }catch(IOException e){
//        System.out.println(e);
//    }
        

    Date start = new Date();
    Date finish = new Date();
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
    String start1 = sdf.format(start);
    String finish2 = sdf.format(finish);
    

    try{
    File fp = new File("/Users/masashi/Documents/test/logfile.txt");
    
    FileWriter fw = new FileWriter(fp);
    BufferedWriter bw = new BufferedWriter(new FileWriter(fp));
    bw.write("aの平方根とbと立方根を求めます");
    bw.newLine();
    bw.write("それでは処理を始めます");
    bw.newLine();
    bw.write("開始時刻は"+start1+"です");
    bw.newLine();
    
    double a = 5;
    double b = 33;
    
    System.out.println(a+"の平方根は"+Math.sqrt(a)+"です");
    System.out.println(b+"の立方根は"+Math.cbrt(b)+"です");
    
    bw.write("処理が終了しました");
    bw.newLine();
    bw.write("終了時刻は"+finish2+"です");
    bw.newLine();
            
    bw.close();
    
    }catch(IOException e){
        e.printStackTrace();
            }
    
    
    }
    
}


package import_date;
import java.io.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;


public class Challenge15_9 {

public static void main(String[] args)throws IOException{
    
    try{
    
    File fp = new File("/Users/masashi/Documents/test/java.txt");
    
    FileReader fr = new FileReader(fp);
    
    BufferedReader br = new BufferedReader(fr);
    
    String str = br.readLine();
    while(str != null){
        
    System.out.println(str);
    str = br.readLine();
    }
    
    br.close();   
}
 catch(IOException e){
        e.printStackTrace();
    }     
  }
}

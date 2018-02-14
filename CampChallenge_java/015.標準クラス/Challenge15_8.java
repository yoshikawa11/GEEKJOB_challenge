
package import_date;
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.*;



public class Challenge15_8 {
    
    public static void main(String[] args) throws IOException{
    //新規ファイルの作成
    File newFile = new File("/Users/masashi/Documents/test/java.txt"); 
    
    try{
        if(newFile.createNewFile()){
        System.out.print("success");
    }else{   
        System.out.print("fail");
     }
    }catch(IOException e){
        System.out.println(e);
    }
    try{
    //ファイルオープン
    File fp = new File("/Users/masashi/Documents/test/java.txt");
    
    //FileWriter作成
    FileWriter fw = new FileWriter(fp);
    BufferedWriter bw = new BufferedWriter(new FileWriter(fp));
    bw.write("はじめまして");
    bw.newLine();
    bw.write("私は鈴木鈴木です");
    bw.newLine();
    bw.write("プログラミングを始めて1ヶ月になります");
    bw.newLine();
    bw.write("よろしくお願いします");
    bw.newLine();
            
    bw.close();
    
    }catch(IOException e){
        e.printStackTrace();
    }
   }   
}


    


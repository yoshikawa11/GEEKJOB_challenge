/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.challenge;
import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author masashi
 */
public class ResultData implements Serializable{
    private Date d;
    private String luck;
    
    public ResultData(){}
    
    public Date getD(){
           return d;}
    
    public void setD(Date d){
            this.d = d;}
    
    public String getluck(){
            return luck;}
    
    public void setluck(String box){
            this.luck = box;}
    
    
}



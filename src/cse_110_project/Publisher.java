/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse_110_project;
import java.util.*;
/**
 *
 * @author NAHIYAN
 */
public class Publisher {
    
     
     private int publisherId;
     private String name;
     private String country;
     
     
     
     Publisher(){}
     
     Publisher(int publisherId,String name, String country){
         
         this.publisherId = publisherId;
         this.name = name;
         this.country = country;
       
        
     }
     
  

    
    
    public void setEmpId(String name){
       
        this.name = name;
    }
    
    public String getName(){
        
        return this.name;
    }
    
    public void setEmail(String email){
       
        this.email = email;
    }
    public String getEmail(){
        
        return this.email;
    }
    
   
 
    public String toString(){
        
        return  "Publisher ID: "+ this.publisherId+" Publisher Name: "+this.name + " Publisher Country:" + this.country ;
    }
    
}

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
public class Author {
    
    private int authorId;
    private String authorName;
    private String authorCountry;
    
    Author(){};
    Author(int authorId,String authorName, String authorCountry){
        
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorCountry = authorCountry;
    }
    
    public int getAuthorId(){
        
        return this.authorId;
    }
    
    
    public String getAuthorName(){
        
        return this.authorName;
    }
    
    public String getAuthorCountry(){
        
        return this.authorCountry;
    }
    
    
     public void setAuthorId(int id){
        
         this.authorId = id;
    }
    
    
    public  void setAuthorName(String name){
        
       this.authorName = name;
    }
    
    public  void setAuthorCountry(String country){
        
       this.authorCountry = country;
    }
    
    public String toString(){
        
        return "Author ID: " + this.authorId + " Author Name: " +this.authorName + " Author Country: "+ this.authorCountry;
    }
    
    
    
    
}

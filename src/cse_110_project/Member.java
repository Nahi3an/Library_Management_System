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
public class Member {
     private int memId;
     private String name;
     private String email;
     private String address;
     private String phone;
     private double memberShipFee;
     private ArrayList<Book> book = new ArrayList<>();
     Member(){}
     
     Member(int memId, String name, String email, String address, String phone, double memberShipFee){
         
         this.memId = memId;
         this.name = name;
         this.email = email;
         this.phone = phone;
         this.address = address;
         this.memberShipFee = memberShipFee;
        
     }
     
  
    public void setmemId(int memId){
       
        this.memId = memId;
    }
    public int getmemId(){
        
        return this.memId;
    }
    
    
    public void setName(String name){
       
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
    
    public void setPhone(String phone){
       
        this.phone = phone;
    }
    
    public String getPhone(){
        
        return this.phone;
    }
    
    public void setAddress(String address){
       
        this.address = address;
    }
     
    public String getAddress(){
        
        return this.address;
    }
    
    public String toString(){
        
        return this.memId + " " + this.name + " "+ this.email + " " + this.phone + " " + this.address;
    }
    
    public void addBook(Book book){
        
        this.book.add(book);
        
    }
    
     public void displayIssuedBook(){
         
            System.out.println("Display Issued Books: ");
        for(int i=0; i<book.size(); i++){
        
            System.out.println(book.get(i).toString());
            
        }
    }
    
}

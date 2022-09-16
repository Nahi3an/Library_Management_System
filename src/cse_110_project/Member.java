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
     private ArrayList<String> issueDate = new ArrayList<>();
     private ArrayList<String> withDrawDate = new ArrayList<>();
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
        
        return "Member ID: " + this.memId + " Memeber Name: " + this.name + " Memeber Email:  "+ this.email + " Member Phone: " + this.phone + " Memeber Phone: " + this.address;
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
     
     public void setIssueWithDrawDate(int flag, String date){
        
        if(flag==1){
            this.issueDate.add(date);
        }else{
            
            this.withDrawDate.add(date);
        }
    }
     
     public void displayIssueDates(){
        
        if(this.issueDate.size()<0){
            
            System.out.println("No Issue Data OR With Draw Date Found!");
            
        }else{
    
            for(int i=0; i<issueDate.size(); i++){
                System.out.println("Issue Date "+ (i+1)+": "+issueDate.get(i));
            }

        } 
        
    }
    
     public void displayWithdrawDates(){
        
        if(this.withDrawDate.size()<0){
            
            System.out.println("This user has not returned book!");
            
        }else{
    
            for(int i=0; i<withDrawDate.size(); i++){
                
                
                System.out.println("Withdraw Date "+ (i+1)+": "+withDrawDate.get(i));
                
            }

        } 
        
    }
    
}

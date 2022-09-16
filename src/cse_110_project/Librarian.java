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
public class Librarian {
     private int empId;
     private String name;
     private String email;
     private String address;
     private String phone;
     ArrayList<Member> member = new ArrayList<>();
     private int numberOfReaders= 0;
     ArrayList<Book> book = new ArrayList<>();
     private int numberOfBooks = 0;
     
     Librarian(){}
     
     Librarian(int empId, String name, String email, String address, String phone){
         
         this.empId = empId;
         this.name = name;
         this.email = email;
         this.phone = phone;
         this.address = address;
        
     }
     
     public void setNumberOfReader(int numberOfReaders){
       
        this.numberOfReaders = numberOfReaders;
    }
    public void setEmpId(int empId){
       
        this.empId = empId;
    }
    public int getEmpId(){
        
        return this.empId;
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
        
        return this.empId + " " + this.name + " "+ this.email + " " + this.phone + " " + this.address;
    }
    
    public void addBook(Book book){
        
        this.book.add(book);
        
    }
    
     public void addMember(Member member){
        
        this.member.add(member);
        
    }
     
    
    
    
}


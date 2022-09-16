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
public class Book_Withdraw {
    
    private String withDrawDate;
    private int isbn;
    private int  memberId;
 
    
    
    Book_Withdraw(){}
    Book_Withdraw(int isbn, int memberId){
        
        this.isbn = isbn;
        this.memberId = memberId;
    }
    
    public void setwithDrawDate(String withDrawDate){
        
        this.withDrawDate = withDrawDate;
       
        
    }
    
     public String getwithDrawDate(){
        
        return this.withDrawDate;
    }
     
    public int getMemberId(){
        
        return this.memberId;
    }
    
    public int getBookId(){
        
        return this.isbn;
    }

    

    
 
}

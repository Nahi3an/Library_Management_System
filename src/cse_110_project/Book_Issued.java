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
public class Book_Issued {
    
    private String issueDate;
    private int isbn;
    private int  memberId;
 
    
    
    Book_Issued(){}
    Book_Issued(int isbn, int memberId){
        
        this.isbn = isbn;
        this.memberId = memberId;
    }
    
    public void setIssueDate(String issueDate){
        
        this.issueDate = issueDate;
       
    }
    public String getIssueDate(){
        
        return this.issueDate;
    }
     
    public int getMemberId(){
        
        return this.memberId;
    }
    
    public int getBookId(){
        
        return this.isbn;
    }

    

    
 
}

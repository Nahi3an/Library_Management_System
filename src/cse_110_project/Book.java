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
public class Book {
    
    
    private int ISBN;
    private String bookTitle;
    private double bookPrice;
    private String category;
    private int numberOfAuthors = 0;
    private int issueNumber = 0;
    Date [] dates = new Date[2];
    
    Book(){}
    Book(int bookId,String bookTitle,double bookPrice, String category){
        
        this.ISBN = bookId;
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.category = category;
       

    }
    public int getNumberOfAuhtors(){
        
        return this.numberOfAuthors;
    }
    public int getBookId(){
        
        return this.ISBN;
    }
    
    
    public String getBookTitle(){
        
        return this.bookTitle;
    }
    
    public double getBookPrice(){
        
        return this.bookPrice;
    }
    
     public String getCategory(){
        
        return this.category;
    }
    
    public void setBookId(int id){
        
       this.ISBN = id;
    }
    
    
    public void setBookTitle(String title){
        
        this.bookTitle = title;
    }
    
    public void setBookPrice(double price){
        
      this.bookPrice = price;
    }
    
    public void setBookCategory(String category){
        
        this.category = category;
    }
    
   
    public String toString(){
        
        return this.ISBN + " " +this.bookTitle + " "+ this.bookPrice;
    }
    
}

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
    private ArrayList<Author> author = new ArrayList<>();
    private int numberOfAuthors = 0;
    private Publisher publisher = new Publisher();
    private ArrayList<Member> member = new ArrayList<>();
    private boolean issued = false;
    
    Book(){}
    
    Book(int bookId,String bookTitle,double bookPrice, String category){
        
        this.ISBN = bookId;
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.category = category;
       

    }
    
    public void setStatus(boolean issued){
        
        this.issued = issued;
    }
    
    public boolean getStatus(){
        
        return this.issued;
    }
    
    public void displayStatus(){
        
        if(this.issued){
            System.out.println("N/A");
        }else{

            System.out.println("Available");
        }
    }
  
    public void setNumberOfAuhtors(int num){
        
       this.numberOfAuthors = num;
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
    
    
    public void addAuthor(Author author){
        
        this.author.add(author);
        
    }
    
    public void addPublsiher(Publisher publisher){
        this.publisher = publisher;
    }
    
    public void displayAuthor(){
        
        for(int i=0; i<author.size(); i++){
            
            System.out.println("Author No. "+(i+1));
            System.out.println(author.get(i).toString());
            
        }
    }
    
    public void displayPublisher(){
        
         System.out.println(this.publisher.toString());
        
    }
    
    
    public void addMember(Member member){
        
       this.member.add(member);
    }
    
    public void dropMember(int memeberId){
        
       for(int i=0; i<member.size(); i++){
           
           if(member.get(i).getmemId()==memeberId){
                  //System.out.println(author.get(i).toString());
                   //System.out.println("Ok");
                   member.remove(i);
                   break;
           }
          
       }     
        
    }
   
    
}

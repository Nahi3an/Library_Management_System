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
    private Publisher publisher = new Publisher();
    private ArrayList<Member> member = new ArrayList<>();
    private boolean issued = false;
    private ArrayList<String> issueDate = new ArrayList<>();
    private ArrayList<String> withDrawDate = new ArrayList<>();
    
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
        
        return "ISBN: " + this.ISBN + " Book Title:  " +this.bookTitle + " Book Price: "+ this.bookPrice;
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
    
//    public void setIssueWithDrawDate(int flag, String date){
//        
//        if(flag==1){
//            this.issueDate.add(date);
//        }else{
//            
//            this.withDrawDate.add(date);
//        }
//    }
//    
//    public void displayIssueDates(){
//        
//        if(this.issueDate.size()<0){
//            
//            System.out.println("No Issue Data OR With Draw Date Found!");
//            
//        }else{
//    
//            for(int i=0; i<issueDate.size(); i++){
//                System.out.println("Issue Date "+ (i+1)+": "+issueDate.get(i));
//            }
//
//        } 
//        
//    }
//    
//     public void displayWithdrawDates(){
//        
//        if(this.withDrawDate.size()<0){
//            
//            System.out.println("No With Draw Date Found!");
//            
//        }else{
//    
//            for(int i=0; i<withDrawDate.size(); i++){
//                
//                System.out.println("Withdraw Date "+ (i+1)+": "+withDrawDate.get(i));
//                
//            }
//
//        } 
//        
//    }
//     
    public void addMember(Member member){
        
       this.member.add(member);
    }
    
    
    public void displayMember(int memId){
        
        for(int i=0; i<member.size(); i++){
            
            if(memId==member.get(i).getmemId()){
                
                System.out.println(member.get(i).toString());
            }
        }
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

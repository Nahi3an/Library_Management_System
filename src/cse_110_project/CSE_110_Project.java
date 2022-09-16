/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse_110_project;
import java.util.*;
/**
 *
 * @author NAHIYAN
 */
public class CSE_110_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Librarian librarian = new Librarian();
        ArrayList<Author> author = new ArrayList<>();
        ArrayList<Book> book = new ArrayList<>();
        ArrayList<Publisher> publisher = new ArrayList<>();
        ArrayList<Member> member = new ArrayList<>();
        Scanner inp = new Scanner(System.in);
           
        Member m = new Member();
        Author a = new Author();
        Book b = new Book();
        Publisher p = new Publisher();
        
      
        while(true){
                System.out.println("");
                System.out.println("*******Library Management System*******");
                System.out.println("1.For Librarian\n 2.For Member / Reader \n3.Exit...");
                System.out.print("Enter Your Choice :");
                int op = inp.nextInt();
                
                
                if(op==1){
                    
                    System.out.println("1) Insert a Book Into Libraray.. ");
                    System.out.println("2) Display All Book Information.. ");
                    System.out.println("3) Register A Member.. ");
                    System.out.println("4) Issue A Book To A Member.. ");
                    System.out.println("5) Display All Member Information.. ");
                    System.out.println("6) Withdraw A Book.. ");
                    System.out.print("Enter Your Choice :");
                    int subOp= inp.nextInt();
                    
                    if(subOp==1){
                        
                        System.out.print("Number of Books to Store:");
                        int bookNum = inp.nextInt();
                        
                        for(int i=0; i<bookNum ; i++){
                            System.out.println("Info of Book: "+(i+1));
                            System.out.print("Enter ISBN: ");
                            int isbn = inp.nextInt();
                            inp.nextLine();
                            System.out.print("Enter title: ");
                            String title = inp.nextLine();
                            System.out.print("Enter Category Name: ");
                            String category = inp.nextLine();
                            System.out.print("Enter Price: ");
                            double price = inp.nextDouble();
                            
                            b = new Book(isbn,title,price,category);
                            book.add(b);
                            librarian.addBook(b);
                            System.out.print("Number of Authors: ");
                            int numberOfAuthors = inp.nextInt();
                           
                            
                             for(int j=0; j<numberOfAuthors; j++){
                                System.out.println("Author Info: "+ (j+1));
                                System.out.print("Enter Author ID: ");
                                int authorId = inp.nextInt();
                                inp.nextLine();
                                System.out.print("Enter Author Name: ");
                                String authorName = inp.nextLine();
                                System.out.print("Enter Author Country: ");
                                String authorCountry = inp.nextLine();

                                a = new Author(authorId,authorName,authorCountry);

                                author.add(a);
                                b.addAuthor(a);
                            }
                             
                            System.out.print("Enter Pushlisher ID: ");
                            int publisherId = inp.nextInt();
                            System.out.print("Enter Pushlisher Company Name: ");
                            inp.nextLine();
                            String publisherName = inp.nextLine();
                            System.out.print("Enter Pushlisher Company Origin: ");
                            String publisherCountry = inp.nextLine();


                            p = new Publisher(publisherId,publisherName,publisherCountry);

                            publisher.add(p);
                            b.addPublsiher(p);
                           
                        }
                        
                        
                    }else if(subOp==2){
                            System.out.println(" ");
                            System.out.println("All Book Information: ");
                            for (int i = 0; i < book.size(); i++){
                                    System.out.println("Book No. "+(i+1));
                                    System.out.println(book.get(i).toString());  
                                    System.out.println("Author Info: ");
                                    book.get(i).displayAuthor();
                                    System.out.println("Publisher Info: ");
                                    book.get(i).displayPublisher();
                                    System.out.print("Book Status: ");
                                    book.get(i).displayStatus();
                            }
                            
                           
                          
                    }else if(subOp==3){
                        
                        
                        System.out.print("Number of Members: ");
                        int numberOfMember = inp.nextInt();
                        
                        for(int i=0; i<numberOfMember; i++){
                            
                            System.out.println("Member info: "+ (i+1));
                            System.out.print("Enter ID: ");
                            int memId = inp.nextInt();
                            System.out.print("Enter Name:");
                            inp.nextLine();
                            String memName = inp.nextLine();
                            System.out.print("Enter Email:");
                            String memEmail = inp.nextLine();
                            System.out.print("Enter Phone:");
                            String memPhone = inp.nextLine();
                            System.out.print("Enter Address:");
                            String memAddr = inp.nextLine();
                            System.out.print("Enter Fee:");
                            double memFee = inp.nextDouble();
                            
                            m = new Member(memId,memName,memEmail,memAddr,memPhone,memFee);
                            
                            member.add(m);
                            librarian.addMember(m);
     
                        }
                    }else if(subOp==4){
                        
                        
                        System.out.println("All Member Information: ");
                        for (int i = 0; i < member.size(); i++){
                                System.out.println("Member No. "+(i+1));
                                System.out.println(member.get(i).toString());  
                        }
                        
                            
                        System.out.print("Select Member ID:");
                        int memId = inp.nextInt();
                        for (int i = 0; i < member.size(); i++){
                             
                            if(memId==member.get(i).getmemId()){
                                
                                m = member.get(i);
                                break;
                            }
                        }
                        
                        
                        
                        System.out.println("All Book Information: ");
                            for (int i = 0; i < book.size(); i++){
                                    System.out.println("Book No. "+(i+1));
                                    System.out.println(book.get(i).toString());  
                                    System.out.println("Author Info: ");
                                    book.get(i).displayAuthor();
                                    System.out.println("Publisher Info: ");
                                    book.get(i).displayPublisher();
                                    System.out.print("Book Status: ");
                                    book.get(i).displayStatus();
                        }
                            
                        System.out.print("Enter ISBN Number:");
                        int isbn = inp.nextInt();
                        for (int i = 0; i < book.size(); i++){
                             
                            if(isbn==book.get(i).getBookId()){
                                
                                if(book.get(i).getStatus()==false){
                                    b = book.get(i);
                                    m.addBook(b);
                                    b.addMember(m);
                                    b.setStatus(true);
                                   
                                    
                                }else{
                                    
                                    System.out.println("This book is not available! ");
                                }
                               
                                break;
                            }
                        }
                        
                       
                        
                        
                       
                    }
                    
                    
                }else{
                    
                    
                }
            
        }
       
    }
    
    
    
}

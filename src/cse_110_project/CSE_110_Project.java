/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse_110_project;

import java.util.*;

import java.text.*;

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
        ArrayList<Book_Issued> book_issued = new ArrayList<>();
        ArrayList<Book_Withdraw> book_withdraw = new ArrayList<>();

        Scanner inp = new Scanner(System.in);

        Member m = new Member();
        Author a = new Author();
        Book b = new Book();
        Publisher p = new Publisher();
        Book_Issued bi = new Book_Issued();
        Book_Withdraw bw = new Book_Withdraw();

        while (true) {
            System.out.println("");
            System.out.println("*******Library Management System*******");

            System.out.println("1) Insert a Book Into Library.. ");
            System.out.println("2) Display All Book Information.. ");
            System.out.println("3) Register A Member.. ");
            System.out.println("4) Issue A Book To A Member.. ");
            System.out.println("5) Withdraw A Book From A Member.. ");
            System.out.println("6) Book Issu / Withdraw Info....");
            System.out.println("7) Member Information....");
            System.out.print("Enter Your Choice :");
            int subOp = inp.nextInt();

            if (subOp == 1) {

                System.out.print("Number of Books to Store:");
                int bookNum = inp.nextInt();

                for (int i = 0; i < bookNum; i++) {
                    System.out.println("Info of Book: " + (i + 1));
                    System.out.print("Enter ISBN: ");
                    int isbn = inp.nextInt();
                    inp.nextLine();
                    System.out.print("Enter title: ");
                    String title = inp.nextLine();
                    System.out.print("Enter Category Name: ");
                    String category = inp.nextLine();
                    System.out.print("Enter Price: ");
                    double price = inp.nextDouble();

                    b = new Book(isbn, title, price, category);
                    book.add(b);
                    librarian.addBook(b);
                    System.out.print("Number of Authors: ");
                    int numberOfAuthors = inp.nextInt();

                    for (int j = 0; j < numberOfAuthors; j++) {
                        System.out.println("Author Info: " + (j + 1));
                        System.out.print("Enter Author ID: ");
                        int authorId = inp.nextInt();
                        inp.nextLine();
                        System.out.print("Enter Author Name: ");
                        String authorName = inp.nextLine();
                        System.out.print("Enter Author Country: ");
                        String authorCountry = inp.nextLine();

                        a = new Author(authorId, authorName, authorCountry);

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

                    p = new Publisher(publisherId, publisherName, publisherCountry);

                    publisher.add(p);
                    b.addPublsiher(p);

                }

            } else if (subOp == 2) {
                System.out.println(" ");
                System.out.println("Book Information: ");
                for (int i = 0; i < book.size(); i++) {
                    System.out.println("Book No. " + (i + 1));
                    System.out.println(book.get(i).toString());
                    System.out.println(" ");
                    System.out.println("Author Info: ");
                    book.get(i).displayAuthor();
                    System.out.println(" ");
                    System.out.println("Publisher Info: ");
                    book.get(i).displayPublisher();
                    System.out.print("Book Status: ");
                    book.get(i).displayStatus();

                }

            } else if (subOp == 3) {

                System.out.print("Number of Members: ");
                int numberOfMember = inp.nextInt();

                for (int i = 0; i < numberOfMember; i++) {

                    System.out.println("Member info: " + (i + 1));
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

                    m = new Member(memId, memName, memEmail, memAddr, memPhone, memFee);

                    member.add(m);
                    librarian.addMember(m);

                }
            } else if (subOp == 4) {

                System.out.println(" ");
                System.out.println("********* Issue Boook ************");
                System.out.println("All Member Information: ");
                for (int i = 0; i < member.size(); i++) {
                    System.out.println("Member No. " + (i + 1));
                    System.out.println(member.get(i).toString());
                }

                System.out.print("Select Member ID:");
                int memId = inp.nextInt();
                for (int i = 0; i < member.size(); i++) {

                    if (memId == member.get(i).getmemId()) {

                        m = member.get(i);

                    }
                }

                System.out.println(" ");
                System.out.println("All Book Information: ");
                for (int i = 0; i < book.size(); i++) {
                    System.out.println("Book No. " + (i + 1));
                    System.out.println(book.get(i).toString());
                    System.out.println(" ");
                    System.out.println("Author Info: ");
                    book.get(i).displayAuthor();
                    System.out.println(" ");
                    System.out.println("Publisher Info: ");
                    book.get(i).displayPublisher();
                    System.out.print("Book Status: ");
                    book.get(i).displayStatus();

                }

                System.out.print("Enter ISBN Number:");
                int isbn = inp.nextInt();
                Date date = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy");

                String strDate = formatter.format(date);
                System.out.println("Date: " + strDate);

                for (int i = 0; i < book.size(); i++) {

                    if (isbn == book.get(i).getBookId()) {

                        if (book.get(i).getStatus() == false) {
                            b = book.get(i);
                            m.addBook(b);
                            b.addMember(m);
                            b.setStatus(true);
                            bi = new Book_Issued(isbn, memId);
                            bi.setIssueDate(strDate);
                            book_issued.add(bi);

                        } else {

                            System.out.println("This book is not available! ");
                        }

                        break;
                    }
                }
            } else if (subOp == 5) {

                System.out.println(" ");
                System.out.println(" ");
                System.out.println("********* With Draw Boook ************");
                System.out.println("All Member Information: ");
                for (int i = 0; i < member.size(); i++) {
                    System.out.println("Member No. " + (i + 1));
                    System.out.println(member.get(i).toString());
                }

                System.out.print("Select Member ID:");
                int memId = inp.nextInt();
                for (int i = 0; i < member.size(); i++) {

                    if (memId == member.get(i).getmemId()) {

                        m = member.get(i);

                    }
                }

                System.out.println(" ");

                System.out.println("All Book Information: ");
                for (int i = 0; i < book.size(); i++) {
                    System.out.println("Book No. " + (i + 1));
                    System.out.println(book.get(i).toString());
                    System.out.println(" ");
                    System.out.println("Author Info: ");
                    book.get(i).displayAuthor();
                    System.out.println(" ");
                    System.out.println("Publisher Info: ");
                    book.get(i).displayPublisher();
                    System.out.print("Book Status: ");
                    book.get(i).displayStatus();
                    System.out.println(" ");
                }

                System.out.print("Enter ISBN Number:");
                int isbn = inp.nextInt();
                Date date = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy");
                String strDate = formatter.format(date);
                System.out.println("Date: " + strDate);
                for (int i = 0; i < book.size(); i++) {

                    if (isbn == book.get(i).getBookId()) {

                        if (book.get(i).getStatus()) {
                            b = book.get(i);
                            m.addBook(b);
                            b.addMember(m);
                            b.setStatus(false);
                            bw = new Book_Withdraw(isbn, memId);
                            bw.setwithDrawDate(strDate);
                            book_withdraw.add(bw);

                        } else {

                            System.out.println("This book is not issued! ");
                        }

                        break;
                    }
                }
            } else if (subOp == 6) {

                System.out.println("Press 1 for Issue Report & Press 2 for Withdraw Report...");

                int op = inp.nextInt();
                if (op == 1) {
                    System.out.println("Issue Information: ");

                    for (int j = 0; j < book.size(); j++) {

                        int isbn = book.get(j).getBookId();

                        for (int k = 0; k < book_issued.size(); k++) {
                            int isbn2 = book_issued.get(k).getBookId();
                            if (isbn == isbn2) {
                                System.out.println("Date: " + book_issued.get(k).getIssueDate());

                                int memberId = book_issued.get(k).getMemberId();
                                for (int f = 0; f < member.size(); f++) {

                                    if (memberId == member.get(f).getmemId()) {

                                        System.out.println(member.get(f).toString());
                                    }

                                }
                                for (int f = 0; f < book.size(); f++) {

                                    if (isbn2 == book.get(f).getBookId()) {

                                        System.out.println(book.get(f).toString());
                                    }

                                }

                            }
                        }
                    }

                } else {
                    System.out.println("Withdraw Information: ");
                    for (int j = 0; j < book.size(); j++) {

                        int isbn = book.get(j).getBookId();

                        for (int k = 0; k < book_withdraw.size(); k++) {
                            int isbn2 = book_withdraw.get(k).getBookId();
                            if (isbn == isbn2) {
                                System.out.println("Date: " + book_withdraw.get(k).getwithDrawDate());

                                int memberId = book_withdraw.get(k).getMemberId();
                                for (int f = 0; f < member.size(); f++) {

                                    if (memberId == member.get(f).getmemId()) {

                                        System.out.println(member.get(f).toString());
                                    }

                                }
                                for (int f = 0; f < book.size(); f++) {

                                    if (isbn2 == book.get(f).getBookId()) {

                                        System.out.println(book.get(f).toString());
                                    }

                                }

                            }
                        }
                    }
                }

                System.out.println(" ");

            }else if(subOp==7){
                
                
                System.out.println(" ");
                System.out.println("All Member Information: ");
                for(int i=0; i<member.size(); i++){
                    
                    
                    System.out.println(member.get(i).toString());
                    
                }
                
            }else {

                break;
            }
        }

    }

}

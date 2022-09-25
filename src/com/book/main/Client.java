package com.book.main;

import java.util.List;
import java.util.Scanner;

import com.book.bean.Book;
import com.book.exception.AuthorNotFoundException;
import com.book.exception.CategoryNotFoundException;
import com.book.service.BookImpl;


public class Client {
	public static void menu() {
		System.out.println("Welcome to XYZ Library");
		System.out.println("Choose your option  ");
		System.out.println("1- Add a book");
		System.out.println("2- All book details");
		System.out.println("3- Filter books by Author");
		System.out.println("4- Filter books by Catagory");
		
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		BookImpl book=new BookImpl();
		
		
		while(true) {
			menu();
		int option=scn.nextInt();
		scn.nextLine();
		BookImpl bookDetails=new BookImpl();
		switch(option) {
		
		case 1:
			String title,author,category;
			int bookId,price;
			System.out.println("Enter book details like Titel,Author,Catagory,Book ID and Price");
			title=scn.nextLine();
			author=scn.nextLine();
			category=scn.nextLine();
			bookId=scn.nextInt();
			price=scn.nextInt();
			
			Book book1=new Book(title, author, category, bookId, price);
			
			break;
		case 2:
			
			bookDetails.getAllBooks();
			
			System.out.println("All Books");
			break;
		case 3:
			System.out.println("Enter the Author name");
			String authorName=scn.nextLine();
			try {
				bookDetails.getBookbyAuthor(authorName);
			} catch (AuthorNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		case 4:
			System.out.println("Enter your catagory");
			String catagory=scn.nextLine();
			try {
				book.getBookbyCategory(catagory);
			} catch (CategoryNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			default:
				System.out.println("Invalid Option.");
			
		}
		
		}
		}
		
	}



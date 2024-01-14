package com.jiaxun.library.data;

public class UserData {
	private String username = "Inquiry";//Username
	private String password = "zengjiaxun";//password
	public String getUser() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
}
//Enter the following code in BookData.java
package com.jiaxun.library.data;


public class BookData {
	//Book stack
	public BookData() {
		{
			String noreaders= "No";
			for (int i = 0; i <borrowreaders.length; i++) {
				borrowreaders[i]=noreaders;
			}
			for (int i = 0; i <5; i++) {
				switch (i) {
				case 0:
					booknames[i]="God-level powerhouse in the city";
					authors[i]="Day When Noon";
					pubdates[i]="2016-03-31";
					sumpaginations[i]="1320";
					break;
				case 1:
					booknames[i]="City Cultivator Master";
					authors[i]="Snow without tears";
					pubdates[i]="2017-07-25";
					sumpaginations[i]="656";
					break;
				case 2:
					booknames[i]="Human Flower Guard";
					authors[i]="Chicken Feidan";
					pubdates[i]="2016-01-31";
					sumpaginations[i]="1120";
					break;
				case 3:
					booknames[i]="7.Realms Immortal Venerable";
					authors[i]="Unscrupulous scholar";
					pubdates[i]="2017-04-04";
					sumpaginations[i]="1310";
					break;
				case 4:
					booknames[i]="Love the naughty princess";
					authors[i]="Remnant Luo Xiaoxiao";
					pubdates[i]="2012-08-20";
					sumpaginations[i]="954";
					break;
				}
			}
													
		}
	}

	public String[] booknames = new String[10];//book name
	public String[] authors = new String[10];//Author
	public String[] pubdates = new String[10];//Publication date
	public String[] sumpaginations = new String[10];//Total number of pages
	public String[] borrowreaders = new String[10];//borrower

}
//Enter the following code in Bo.java
package com.jiaxun.library.bo;

import java.util.Scanner;

import com.jiaxun.library.data.BookData;
import com.jiaxun.library.data.UserData;

public class Bo {
	public static BookData book = new BookData();
	UserData user = new UserData();
	//Administrator login verification
	public int login(String username, String password) {
		if (username.equals(user.getUser())) {
			if (password.equals(user.getPassword())) {
				return 1;//Account and password verification passed
			} else {
				return 0;//The password is wrong
			}
		} else {
			return -1;//The account does not exist
		}
	}
	/*
	 * Menu function display list
	 * 
	 * Book information display function
	 */
	public void showBook() {
		System.out.println("This library has total" + (book.booknames.length-remainSpace()) + "book");
		int a = bookinfo();
		if (a == 0) {
			//Show all book information
			showAll();
		} else if (a> 0 && a <= book.booknames.length) {
			//Display related book information
			showPart(a);
		} else {
			System.out.println("The number entered is illegal!");
			showBook();
		}
	}
	//Show all book information
	public void showAll() {
		for (int i = 0; i <book.booknames.length; i++) {
			if (book.booknames[i] != null) {
				System.out.println("---------------------------------------Number" + ( i + 1)
						+ "------------------------------------------------ --------------");
				System.out.println("The book number is" + (i + 1) + "The detailed information is:");
				System.out.print("Book name:" + book.booknames[i] + "");
				System.out.print ( "Author:" + book.authors [i] + "");
				System.out.print("Publication Date:" + book.pubdates[i] + "");
				System.out.print("Total pages:" + book.sumpaginations[i] + "");
				System.out.println("borrower:" + book.borrowreaders[i]);
			}
		}
		System.out.println(
				"------------------------------------------------- -------------------------------------------------- ------");
	}
	//Display related book information
	public void showPart(int a) {
		int i = a;
		System.out.println(
				"---------------Boundary Line-------------------------------- -------------------------------------------------- -----------------");
		System.out.println("Book Number" + (i) + "The detailed information is:");
		System.out.print("Book name:" + book.booknames[i-1] + "");
		System.out.println ( "OF:" + book.authors [i - 1] + "");
		System.out.print("Publication Date:" + book.pubdates[i-1] + "");
		System.out.print("Total pages:" + book.sumpaginations[i-1] + "");
		System.out.println("borrower:" + book.borrowreaders[i-1]);
		System.out.println(
				"------------------------------------------------- --------------Boundary Line ---------------------------------- -----------------");
	}
	//According to the number, judge whether to display globally or partially
	public int bookinfo() {
		for (int i = 0; i <book.booknames.length; i++) {
			if (book.booknames[i] != null) {
				System.out.println("Book name number" + (i + 1) + ":" + book.booknames[i] + "");
			}
		}
		System.out.print("Enter the corresponding number to view the detailed information of the corresponding book (input 0 to view all information):");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		return i;
	}
	//Enter new book judgment
	public int addBook(String bookname, String author, String pubdate, String sumpagination) {
		int flag = 0;//1 means success, 0 means the new book already exists in the library, -1 means the warehouse is full
		if (book.booknames[book.booknames.length-1] != null) {
			flag = -1;//full
		}
		if (book.booknames[book.booknames.length-1] == null) {

			for (int i = 0; i <book.booknames.length; i++) {

				if (bookname.equals(book.booknames[i])) {
					flag = 0;//book.booknames[i] already exists
					break;
				}
				if (!(bookname.equals(book.booknames[i]))) {
					//add books
					add(bookname, author, pubdate, sumpagination);
					flag = 1;//success
					break;
				}
			}
		}
		return flag;
	}
	//Enter new book
	public void add(String bookname, String author, String pubdate, String sumpagination) {
		for (int i = 0; i <book.booknames.length; i++) {
			if (book.booknames[i] == null) {
				book.booknames[i] = bookname;
				book.authors[i] = author;
				book.pubdates[i] = pubdate;
				book.sumpaginations[i] = sumpagination;
				break;
			}
		}
	}
	//Store the remaining capacity of the book
	public int remainSpace() {
		int count = 0;
		try {
			for (int i = 0; i <book.booknames.length; i++) {
				if (book.booknames[i] == null) {
					++count;
				}
			}
		} catch (Exception e) {
			//TODO: handle exception
		}
		return count;
	}
	//Find related book information according to the book title when modifying
	public int selectBook(String bookname) {
		int flag = 0;
		for (int i = 0; i <book.booknames.length; i++) {
			if (bookname.equals("")) {
				flag = -1;//-1 means the book title is not entered
				break;
			}
			//In other cases, it matches the books in the library
			if (bookname.equals(book.booknames[i])) {
				flag = 1;//1Find the related book title
				showPart(i + 1);
				break;
			}
			if (!bookname.equals(book.booknames[i])) {
				if (i == book.booknames.length-1) {
					flag = 0;//0 means not found
				}
			}
		}
		return flag;
	}
	//Find the index based on the title of the book, return to its index if there is this book, if not return -1
	public int selectIndex(String bookname) {
		int flag = -1;
		for (int i = 0; i <book.booknames.length; i++) {
			if (bookname.equals(book.booknames[i])) {
				flag = i;
			}
		}
		return flag;//Can't find this book
	}
	//Modify book information 1 title 2 author 3 publication date 4 total pages 5 borrowers
	public void modinfo(int a, String value, int index) {

		switch (a) {
		case 1:
			book.booknames[index] = value;
			break;

		case 2:
			book.authors[index] = value;
			break;
		case 3:
			book.pubdates[index] = value;
			break;
		case 4:
			book.sumpaginations[index] = value;
			break;
		case 5:
			book.borrowreaders[index] = value;
			break;
		}

	}
	//Delete book function
	public void deleteBook(String bookname) {
		int a = selectIndex(bookname);
		book.booknames[a] = null;
		book.authors[a] = null;
		book.pubdates[a] = null;
		book.sumpaginations[a] = null;
		book.booknames[a] = null;

	}
	//Check if the book is in the library and if it has been lent
	public int testReader(String bookname) {

		//There is this book in the library, find the index of this book, there is this book a>=0, no return -1
		int a = selectIndex(bookname);
		//This book is in the library
		if (a >= 0) {
			if ((book.borrowreaders[a].equals("无") || book.borrowreaders[a].equals("")))//No one takes this book, "" is the direct return value of the scanner
				return 0;//Not borrowed
			else
				return 1;//borrowed
		} else {
			return -1;//There is no such book in the library
		}

	}
	//Set the borrower to none or empty
	public void setBorrowReader(String bookname){
		int a = selectIndex(bookname);
		book.borrowreaders[a]="None";
	}
	//Query the borrower of the specified book
	public String getBorrowReader(String bookname){
		int a = selectIndex(bookname);
		return book.borrowreaders[a];
	}

	//Book borrowing function
	public void borrow(String bookname,String readername){
		int a = selectBook(bookname);
		book.borrowreaders[a]=readername;
	}
}
//Enter the following code in LibraryUI.java
package com.jiaxun.library.ui;

import java.util.Scanner;

import com.jiaxun.library.bo.Bo;

public class LibraryUI {

	Bo bo = new Bo();

	public static void main(String[] args) {
		LibraryUI ui = new LibraryUI();
		ui.welcome();//Welcome interface

	}

	//Welcome Screen
	public void welcome() {
		System.out.println("*********************************");
		System.out.println("********小☆inquiry library management system********");
		System.out.println("*********************************");
		loginBoundary();//Login interface
	}

	//Administrator login interface
	public void loginBoundary() {
		System.out.print("Administrator account:");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		System.out.print("Login password:");
		Scanner scanner1 = new Scanner(System.in);
		String password = scanner1.nextLine();
		int flag = bo.login(username, password);//login verification
		switch (flag) {
		case 0://password error
			System.out.println("Wrong password, please re-enter.");
			loginBoundary();
			break;

		case 1://verified
			System.out.println("Login successfully!");
			showMenu();//After successful login, jump to the menu function management
			break;
		case -1://account does not exist
			System.out.println("The administrator account you entered does not exist, please confirm and enter again.");
			loginBoundary();
			break;
		}
	}

	//Menu function display list
	public void showMenu() {
		System.out.println("Please enter the function number to enter the corresponding function:");
		System.out.println("All book information-number: 1");
		System.out.println("Enter a new book-number: 2");
		System.out.println("Modify the basic information of the book-number: 3");
		System.out.println("Delete book function-number: 4");
		System.out.println("Book Return Function-Number: 5");
		System.out.println("Book Borrowing Function-Number: 6");
		System.out.println("Exit the system-number: 7");
		System.out.print("Please enter the function number:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();//
		switch (a) {
		case 1://book information
			showBook();
			returnMethod();//Return to the main menu
			break;
		case 2://Enter new book
			addBook();
			break;
		case 3://modify the basic information of the book
			modBookInfo();
			break;
		case 4://delete book
			delete();
			break;
		case 5://return book
			returnBook();
			break;
		case 6://Borrow
			borrowBook();
			break;
		case 7://logout
			welcome();
			scanner.close();
			break;
		}
	}

	//Return to the main menu function
	public void returnMethod() {
		System.out.print("Press ENTER to return to the function main menu:");
		Scanner scanner = new Scanner(System.in);
		String i = scanner.nextLine();
		showMenu();
	}

	//Book information display function
	public void showBook() {
		bo.showBook();
	}

	//Input new book function
	public void addBook() {
		System.out.print("Please enter the name of the book to be added:");//Book title
		Scanner scanner = new Scanner(System.in);
		String bookname = scanner.nextLine();
		System.out.print ( "Please enter" + bookname + "author:");//Author
		Scanner scanner1 = new Scanner(System.in);
		String author = scanner1.nextLine();
		System.out.print("Please enter "+ bookname +" the publication date of "(format such as 2000-01-01):");//publication date
		Scanner scanner2 = new Scanner(System.in);
		String pubdate = scanner2.nextLine();
		System.out.print("Please enter" + bookname + "total number of pages (pages):");//total number of pages
		Scanner scanner3 = new Scanner(System.in);
		String sumpagination = scanner3.nextLine();
		int flag = bo.addBook(bookname, author, pubdate, sumpagination);
		//1 means success, 0 means the new book already exists in the library, -1 means the warehouse is full
		switch (flag) {
		case 1:
			System.out.println("new book" + bookname + "added successfully, the library currently has" + bo.remainSpace() + "locations for storing new books.");
			returnMethod();//The return function in the book add interface, you can choose to continue adding or return to the main menu
			break;
		case 0:
			System.out.println("Failed to add book," + bookname + "Already exist in this library!");
			returnMethod();//The return function in the book add interface, you can choose to continue adding or return to the main menu
			break;
		case -1:
			System.out.println("Adding failed, the library is full, please delete some books before adding them.");
			showMenu();
			break;
		}
	}

	//Modify book information
	public void modBookInfo() {
		System.out.print("Please enter the title of the book you want to operate:");
		Scanner scanner = new Scanner(System.in);
		String bookname = scanner.nextLine();
		//Find related book information based on the title
		int flag = bo.selectBook(bookname);
		switch (flag) {
		case 0:
			System.out.print("Related books are not found, enter 0 and press Enter to enter the function of this layer, and enter 1 and press Enter to return to the function main menu.");
			int a = scanner.nextInt();
			if (a == 0) {
				modBookInfo();
			} else if (a == 1) {

				showMenu();
			}
			break;

		case -1:
			System.out.println("The title of the book is empty, enter 0 and press Enter to enter the function of this layer, and enter 1 and press Enter to return to the function main menu.");
			int a1 = scanner.nextInt();
			if (a1 == 0) {
				modBookInfo();
			} else {
				showMenu();
			}
			break;

		case 1:
			System.out.print("The above information is the result of searching related book titles, where (the number "1" represents the title of the book, the number "2" represents the author, the number "3" represents the publication date, and the number "4" represents the total number of pages , The number "5" represents the borrower) Enter the relevant number to modify the relevant information: ");
			int a2 = scanner.nextInt();//1 title 2 author 3 publication date 4 total pages 5 borrower
			if (a2> 0 && a2 <6) {
				System.out.print("Please enter what you want to modify" + sortName(a2) + ":");
				Scanner scanner2 = new Scanner(System.in);
				String value = scanner2.nextLine();
				int index = bo.selectIndex(bookname);
				bo.modinfo(a2, value, index);
				System.out.println(bookname + "The related information of this book has been modified successfully!");
				returnMethod();
			} else {
				System.out.println("The number you entered is invalid. Please try again!");
				modBookInfo();
			}

			break;

		}
	}

	//Modified category name
	public String sortName(int flag) {
		if (flag == 1)
			return "Book Title";
		if (flag == 2)
			return "Author";
		if (flag == 3)
			return "Publication Date";
		if (flag == 4)
			return "Total Pages";
		else
			return "borrower";
	}

	//Delete book function
	public void delete() {
		System.out.print("Please enter the title of the book to be deleted:");
		Scanner scanner = new Scanner(System.in);
		String bookname = scanner.nextLine();
		int flag = bo.testReader(bookname);
		//This book exists and no one borrows it
		if (flag == 0) {
			bo.deleteBook(bookname);
			System.out.println(bookname + "Successfully removed from the library! Enter 0 to return to the main menu, enter 1 to continue deleting");
			delReturn();
		} else if (flag == 1) {//Someone borrowed
			System.out.println("This book has been lent, please wait for it to be returned before deleting. Enter 0 to return to the main menu, enter 1 to continue to delete");
			delReturn();
		} else {//This book does not exist
			System.out.println("This book does not exist in this library, please compare it carefully. Enter 0 to return to the main menu, enter 1 to continue to delete");
			delReturn();
		}

	}

	//Deleted return operation
	public void delReturn() {

		Scanner scanner1 = new Scanner(System.in);
		int i = scanner1.nextInt();
		if (i == 0) {
			showMenu();
		} else if (i == 1) {
			delete();
		}
	}

	//Book return function
	public void returnBook() {
		System.out.print("Please enter the name of the book to be returned:");
		Scanner scanner = new Scanner(System.in);
		String bookname = scanner.nextLine();
		int flag = bo.testReader(bookname);
		if (flag == 0) {
			System.out.println(bookname + "Not yet loaned out.");
			System.out.print("Enter 0 and press Enter to return to the main menu, enter other keys to continue returning the book");
			String a = scanner.nextLine();
			if(a.equals("0")){
				showMenu();
			}else {
				returnBook();
			}
		} else if (flag == -1) {
			System.out.println(bookname + "Does not exist in this library.");
			System.out.print("Enter 0 and press Enter to return to the main menu, enter other keys to continue returning the book");
			String a = scanner.nextLine();
			if(a.equals("0")){
				showMenu();
			}else {
				returnBook();
			}
		} else if (flag == 1) {

			System.out.println(bo.getBorrowReader(bookname) + "The book has been returned successfully!");
			bo.setBorrowReader(bookname);
			System.out.print("Enter 0 and press Enter to return to the main menu, enter other keys to continue returning the book");
			String a = scanner.nextLine();
			if(a.equals("0")){
				showMenu();
			}else {
				returnBook();
			}
		}
	}

	//Book borrowing function
	public void borrowBook() {
		System.out.print("Please enter the name of the book to be borrowed:");
		Scanner scanner = new Scanner(System.in);
		String bookname = scanner.nextLine();
		int flag = bo.testReader(bookname);
		switch (flag) {
		case 0://There is a situation where no one borrows this book

			System.out.println("Please enter the name of the borrower:");
			String readername = scanner.nextLine();
			bo.borrow(bookname,readername);
			System.out.println(readername+" borrowed a book named "+bookname+" from this library.");
			System.out.print("Enter 0 and press Enter to return to the main menu, and enter 1 and press Enter to continue borrowing the book:");
			int a0 = scanner.nextInt();
				if(a0==0)
					showMenu();
				if(a0==1)
					borrowBook();
			break;

		case 1://There is a situation where this book is borrowed
			System.out.println("Book borrowing failed," + bookname + "Already borrowed!");
			System.out.print("Enter 0 and press Enter to return to the main menu, and enter 1 and press Enter to continue borrowing the book:");
			int a = scanner.nextInt();
			switch (a) {
			case 0:
				showMenu();
				break;

			case 1:
				borrowBook();
				break;
				
				}
		case -1://does not exist in this book
			System.out.println("Book borrowing failed," + bookname + "does not exist in the library.");
			System.out.print("Enter 0 and press Enter to return to the main menu, and enter 1 and press Enter to continue borrowing the book:");
			int a1 = scanner.nextInt();
			switch (a1) {
			case 0:
				showMenu();
				break;

			case 1:
				borrowBook();
				break;

			}
		}
	}
}
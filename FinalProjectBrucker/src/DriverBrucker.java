/***************************************************************
* Name : SkateShop Rewards Program
* Author: Cyrus Brucker
* Created : 12/10/2021
* Course: CIS 152 - Data Structure
* Version: 1.0
* OS: MAC IOS
* IDE: eclipse IDE,)
* Copyright : This is my own original work 
* based on specifications issued by our instructor
* Description : Takes customer information and inputs it inside a rewards program to give certain customers deals with datastructes and sorting algorithms
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or
* unmodified. I have not given other fellow student(s) access
* to my program.
***************************************************************/
import java.util.Scanner;
public class DriverBrucker{
	public static void main(String[] args) throws StackEmptyException, StackFullException {
		Scanner scObj = new Scanner(System.in);
		stackBrucker stack = new stackBrucker(); 
		LinkedList list = new LinkedList(); 
		//Variable for do while loop
		char choice = 'y';
		//Variables for each thing the user enters into the program
		String name= " "; 
		int age = 0; 
		int numOfYears = 0; 
		int driverDigit = 0; 
		do {
			System.out.println("Hello! Welcome the Cyrus' skateshop rewards program!");
			System.out.println("-------------------------------------------------------------");
			//Asking the user for there name
			System.out.println("Please enter the Name");
			//While loop for input validation for age
			while(!scObj.hasNext("[A-Za-z]*")) {
				System.out.println("Please enter a Alphabetical character"); 
				scObj.next();
			}
			name = scObj.next(); 
			//Asking the user for there age, and if statement determing if there age is over 55 then they get 10% off there purchase today
			System.out.println("Please enter the age");
			//While loop for input validation for age
			while(!scObj.hasNextInt()) {
				System.out.println("Please enter a positive whole number.");
				scObj.next(); 
			}
			age = scObj.nextInt(); 
			if (age >= 55) {
				System.out.println("-------------------------------------------------------------");
				System.out.println("Congrats! You are a skate dad and qualify for a 10% off of todays purchase!");
				System.out.println("-------------------------------------------------------------");
			}
			//Asking user for number of years skated, and if statement determining if they have been skating for more then 10 years they get a free t-shirt
			System.out.println("Please enter the number of years skated");
			//While loop for input validation for age
			while(!scObj.hasNextInt()) {
				System.out.println("Please enter a positive whole number.");
				scObj.next(); 
			}
			numOfYears = scObj.nextInt();
			if(numOfYears >= 10) {
				System.out.println("-------------------------------------------------------------");
				System.out.println("Congrats! You are a skateboarding veteran, here is a free shop t-shirt!");
				System.out.println("-------------------------------------------------------------");
			}
			//Asking user for last 4 digits of drivers liscense
			System.out.println("Please enter the last 2 digits of your drivers license");
			//While loop for input validation for age
			while(!scObj.hasNextInt()) {
				System.out.println("Please enter a 2 Digit positive whole number.");
				scObj.next(); 
			}
			list.push(driverDigit);
			driverDigit = scObj.nextInt(); 	
			//Putting each user input into a string inorder to through it to the stack class
			String user =  "Name is: " + name + " || " + " Age is: " + age +  " || " + " Number of years skated: " + numOfYears + " || " + " Last 4 of drivers liscense: " + driverDigit; 
			//stack object is calling the push object, and adding it into the linked list 
			stack.push(user); 
			System.out.println();
			System.out.print("Would you like to enter another user into the rewards program? (y/n)");
			choice = scObj.next().charAt(0); 		
		}while(choice == 'Y' || choice == 'y');		
		//DO YOU WANT OT REMOVE
		System.out.println("-------------------------------------------------------------");
		System.out.println("Would you like to remove the most recent rewards Guest? (Y/N)");
		choice = scObj.next().charAt(0); 
		if(choice == 'Y' || choice == 'y') {
			stack.pop();
		}
		//Outputing to the user the final informaiton
		System.out.println("-------------------------------------------------------------");
		System.out.println("This size of the list is: " + stack.size());
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println("The most recently added guest is: " + stack.peek());
		System.out.println("-------------------------------------------------------------");
		System.out.println("The sorted list is: ");
		list.insertionSort(list.head);
		list.printlist(list.head);
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println("Thanks for adding guests to the rewards program!"); 
	}
}

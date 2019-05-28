package BankingApp;

import java.util.Scanner;

public class BankProccessing 
{
	int Balance;
	int PreviousTransaction;
	String Customer_Name;
	String Customer_Id;
	
	BankProccessing(String C_Name, String C_Id)
	{
	Customer_Name = C_Name;
	Customer_Id= C_Id;
	}
	
	void deposit(int account)
	{
		if(account != 0)
		{
			Balance = Balance+account;
			PreviousTransaction = account;
		}
	}
	
	void withdraw(int account)
	{
		if(account != 0)
		{
			Balance = Balance-account;
			PreviousTransaction = -account;
		}
	}
	
	void getPreviousTransaction()
	{
		if(PreviousTransaction > 0)
		{
			System.out.println("Deposited: "+PreviousTransaction );
		}
		else if(PreviousTransaction < 0)
		{
			System.out.println("withdraw: "+Math.abs(PreviousTransaction));
		}
		else
		{
			System.out.println("No Transaction Occured");
		}
	}
	
	void ShowMenu() 
	{
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome "+Customer_Name);
		System.out.println("Your ID id: "+Customer_Id);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do
		{
			System.out.println("=========================================================================");
			System.out.println("Enter an Option");
			System.out.println("==========================================================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("-----------------------------------------");
				System.out.println("Balance = "+Balance);
				System.out.println("------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("------------------------------------------");
				System.out.println("Enter an Account  to Deposit");
				System.out.println("--------------------------------------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("---------------------------------------------");
				System.out.println("Enter an Account to Withdraw");
				System.out.println("----------------------------------------------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("------------------------------------------------");
				getPreviousTransaction();
				System.out.println("---------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("**************************************************");
				break;
				
			default:
			System.out.println("Invalid Option !!. Please enter again");
			break;
			}
		}
		while(option != 'E');
		System.out.println("Thank you for using our services");
	}
}

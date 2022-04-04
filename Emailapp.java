package Emailapp;

import java.util.Scanner;

public class Emailapp {
	 private String firstName;
	 private String lastName;
	 private String password;
	private String department;
	private String email;
	private int mailboxCapacity;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix="aeycompany.com";
	// Constructor to get the first and last name
	public Emailapp(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email Created: "+this.firstName + " " + this.lastName);
		this.department=setDepartment();
		System.out.println("Department: " +this.department);
		int passwordLength;
		this.password =randomPassword(defaultpasswordLength); 
		email = firstName.toLowerCase()+ "," + lastName.toLowerCase() + "@" +department + companySuffix;
		System.out.println("Your password is: "+ email);
	}
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Devlopment\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in= new Scanner(System.in);
		int depChoice=in.nextInt();
		if (depChoice == 1)
		{
			return "Sales";
		}
		else if (depChoice== 2)
		{
			return "dev";
		}
		else if(depChoice== 3)
		{
			return "acct";
		}
		else
		{
			return "";
		}
	}
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[]password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()* passwordSet.length());
		}
		return new String(password);
		}
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
		public void setAlternateEmail(String alterEmail) {
			String altEmail=null;
			this.alternateEmail=altEmail;
		}
		public void changepassword(String password)
		{
			this.password=password;
		}
		public int getMailboxCapacity()
		{
			return mailboxCapacity;
		}
		public String getAlternateEmail()
		{
			return alternateEmail;
		}
		public String getPassword()
		{
			return password;
		}
		public String showInfo() {
			return "DISPLAY NAME:" +firstName+ " " + lastName+ "COMPANY EMAIL:" + email + "MAILBOX CAPACITY: " + mailCapacity + "mb";
		}
}


	//Ask for department
	//generate the random password
	//Set the mailbox capacity
	//set the alternate mail
	//change the password
	



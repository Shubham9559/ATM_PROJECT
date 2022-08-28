package ATM_Project2;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

class ATM{
	private double balance = 0;
	private double withdraw = 0;
	private double deposite = 0;

	// Setters
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	
	public void setDiposit(double deposite) {
		this.deposite = deposite;
	}
	
	// getters
	
	public double getBalance() {
		return balance;
	}
	
	public double getWithdraw() {
		return withdraw;
	}
	
	public double getDeposit() {
		return deposite;
	}
	
	// Methods for Operation
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient Amount ");
		}else if(amount < 0) {
			System.out.println("Entered Amount Should be Possitive ");
		}else if(amount%500 == 0) {
			this.balance -= amount;
			System.out.println("Amount Withdrawn succesfully Collect Your Cash");
		}else {
			System.out.println("Amount should be Multiple of 500");
		}
	}
	
	public void deposite(double amount) {
		if(amount < 0) {
  		  System.out.println("Entered Amount Should be possitive ");
  	    }
		
		this.balance += amount;
		
	}
	
	
	
}



public class Main { 
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM obj = new ATM();
		
		Map <Double, String> map = new HashMap();
		
		int id = 1234;
		int pin = 123;
		System.out.println("Enter id ");
		int ATM_ID = sc.nextInt();
		System.out.println("Enter Pin ");
		int PIN = sc.nextInt();
		
		if(ATM_ID==id && PIN == pin) {
			while(true){
	          System.out.println("1.Check Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
	          System.out.println("Enter Choice : ");
              int ch=sc.nextInt();
              if(ch==1) {
            	  System.out.println("Your Balance is " + obj.getBalance());
              }else if(ch == 2) {
            	  System.out.println("Enter Withdraw Amount ");
            	  double amount = sc.nextInt();
            	  map.put(amount,"Amount Withdrawn ");
            	  obj.withdraw(amount);
            	  
              }else if(ch==3) {
            	  System.out.println("Enter Deposite Amount");
            	  double amount = sc.nextInt();
            	  map.put(amount, "Amount Deposited ");
            	  obj.deposite(amount);
              }else if(ch==4) {
            	  System.out.println(map);
              }else if (ch==5) {
            	  System.out.println("Thanks for Using ATM");
            	  System.exit(0);
              }
               
			}
			
		}else {
			System.out.print("Invalid ATM_ID or PIN ");
			System.exit(0);
		}

	}

}

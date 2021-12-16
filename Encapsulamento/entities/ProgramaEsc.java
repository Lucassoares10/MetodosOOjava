package entities;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaEsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		Account account;
       
		 System.out.print("Enter account number: ");
		 int number= sc.nextInt();
        
		 System.out.println("Enter account holder:");
        sc.nextLine();
        String holder= sc.nextLine();
        System.out.println("Is there an initial deposit s/n?");
        char response = sc.next().charAt(0);
		
        if(response == 's') {
        	System.out.print("Enter initial deposit value");
        	double initialDeposit = sc.nextDouble();
        	account = new Account(number,holder,initialDeposit);
        	
        }else {
        	account= new Account (number,holder);
        }
        
        System.out.println();
        System.out.println("Acount data:");
        System.out.println(account);
        
        System.out.println();
        System.out.println("Enter a deposit value:");
        
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Update account data");
        System.out.print(account);
        
        System.out.println();
        System.out.print("Enter a withdraw value:");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Update account data:");
        System.out.println(account);
        
        
        
        sc.close();
	}

}

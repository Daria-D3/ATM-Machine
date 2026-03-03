package package1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Map.Entry;

public class OptionMenu extends Account{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	//validate login info, customer no and pin no
	
	public void getLogin() throws IOException{
		int x=1;
		
		do {
			try {
				data.put(9876543, 9876);
				data.put(8989898, 1890);
				
				System.out.println("Welcome to the ATM Project!");
				
				System.out.println("Enter your customer number: ");
				setCustomerNumber(menuInput.nextInt());
			
				System.out.print("Enter your pin number: ");
				setPinNumber(menuInput.nextInt());
				
			} catch(Exception e) {
				System.out.println("\n" + "Invalid character(s). Only numbers!"+ "\n");
				x=2;
			}
			
			for(Entry<Integer, Integer> entry : data.entrySet()) {
				if(entry.getKey() == getCustomerNumber() && entry.getValue() ==getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n" + "Wrong customer no or Pin number." + "\n");
		} while(x==1);
	}
	
	//display acc type menu with selection
	
	public void getAccountType() {
		System.out.println("Select the account you want to access: ");
		System.out.println("Type 1 - Checking account");
		System.out.println("Type 2 - Saving account");
		System.out.println("Type 3 - Exit");
		System.out.println("Choice: ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank you for using this ATM, bye!");
			break;
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getAccountType();
		}
	}
	
	//display checking account menu with selection
	
	public void getChecking() {
		System.out.println("Checking account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice - ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using this ATM, bye!");
			break;
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getChecking();
		}
	}
	
	//display saving account menu with selection
	
	public void getSaving() {
		System.out.println("Saving account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice - ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using this ATM, bye!");
			break;
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getSaving();
		}
	}
	
	int selection;
	
}

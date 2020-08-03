import java.util.ArrayList;

public class Bank {
// Variables to be used in this class
	public String name;
	public String savingsInterestRate;
// create the array to store the new accounts created
	public static ArrayList<Account> listOfAccounts = new ArrayList<Account>();
// checkes is the account is a real account and then deposits the money
	public boolean deposit(String accountID, double amount) {
		for (final Account account : listOfAccounts) {
// the is statment to check the account
			if (account.accountID.equals(accountID)) {
				account.balance = account.balance + amount;
				return true;
			}

		}
		return false;
	}
// checks if the account in in the array list before excuting the funtion 
	public boolean withdraw(String accountID, double amount) {

		for (final Account account : listOfAccounts) {

			if (account.accountID.equals(accountID)) {
				account.balance = account.balance - amount;
				return true;
			}

		}
		return false;

	}
// takes to accounts as stings // makes use of both withdraw and depost funtions // checks if both accounts are in the array list first 
	public Boolean transfer(String fromAccountID, String toAccountID, double amount) {
		Account acc1 = Bank.listOfAccounts.get(0);
		Account acc2 = Bank.listOfAccounts.get(0);

		for (int i = 0; i < Bank.listOfAccounts.size(); i++) {
			Account temp = Bank.listOfAccounts.get(i);
			if (temp.accountID == fromAccountID) {
				acc1 = temp;
			} else if (temp.accountID == toAccountID) {
				acc2 = temp;
			}
		}
		if(acc1 == acc2){
			return false;
		}

		if (acc1.withdraw(amount)) {
			acc2.deposit(amount);
			return true;
		} else {
			return false;
		}
	}
}



class SavingAccount extends Account {
// assigning the savings account to the super constructor acccount 
    public SavingAccount(Double balance, String accountID ){
        this.balance = balance;
        this.accountID = accountID;
        Bank.listOfAccounts.add(this);
    }
// withdraw funtion that allows for user to take money out with a charge of 3 with a minimum balace leftover of 10
    boolean withdraw(double amount) {
        while (this.balance - (amount + 3) >= 10) {
            this.balance = this.balance - (amount + 3);
            return true;
        }
        return false;

    }
// deposite funtion with min depo being 10 and exxtra credit id it 1000+
    void deposit(double amount) {

        if (amount < 10) {

            System.out.println("ammount is less then 10"); 
        }
        else{

            this.balance += amount;
        }

        if (amount > 1000) {

            this.balance += 10.00;
        }
        

    

    }
// takes and intreast rate fom user converts in to % computes intrest then reurns the intrest paid 
    double addIntress(double rate) {
        double paid;
        this.rate = rate;

        paid = this.balance * rate/100;

        this.balance += paid;

        return paid;

        } 



}
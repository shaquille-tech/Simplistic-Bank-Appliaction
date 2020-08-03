class CurrentAccount extends Account  {

// assigning the current account to the super constructor acccount 
    public CurrentAccount(Double balance, String accountID ){
        numberOfChecksUsed = 0;
        this.balance = balance;
        this.accountID = accountID;
        Bank.listOfAccounts.add(this);
        
    }
//    withdraw funtion that allows for user to take money out with a charge of 1 with a minimum balace leftover of 0
     boolean withdraw(double amount){
         while (this.balance - (amount + (+1)) >= 0) {
             this.balance = this.balance - (amount + 1);
             
             return true;
         }
         return false;

    }
// despositr funiton that charhers 1 and has a min of 1     
     void deposit(double amount){
         if (amount >= 1) {
            this.balance += amount - (+1); 
         }
         else{
            System.out.println("ammount is less then 1"); 
         }
         

     }
// rests checks to 0 when called 
     public void resetChecksUsed(){
        numberOfChecksUsed = 0;
    }
// withdraw funtion with a mini balance of -10 and a limit of check to 3 
    public boolean withdrawUsingCheck(double amount) {
        while (numberOfChecksUsed < 3) {
            if (balance - amount > -10) {
                balance -= amount;
                numberOfChecksUsed ++;
                return true;
                
            }
            
        }
        return false;
        
    }
    
}
    

        

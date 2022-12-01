/* This class keeps track of the information for a customer's store account.
 */
public class StoreAccount{
   
   /* Instance variable declarations. */
   private String acctName;
   private double currentBalance;
   private int numPurchases;
   private double totalAmtPurchased;

   
      /* Constructor. Initializes the instance variables. */
   public StoreAccount(String name, double startBalance) {
     /*TODO 1: Initialize the acctName and currentBalance to the arguments passed in,
               initialize the other instance variables to 0.
      */
      currentBalance = currentBalance;
      acctName = name;
      numPurchases = 0;
      totalAmtPurchased = 0;
   }
  
   /* This method increments the number of purchases, updates the total amount
      purchased as well as the current balance. Note: a negative balance is OK.
    */
   public void makePurchase(double itemCost){
     //TODO 2: implement this method.
      numPurchases = numPurchases + 1;
      totalAmtPurchased = totalAmtPurchased + itemCost;
      currentBalance = currentBalance - itemCost;
   }
   
   /* This method adds the argument to the current balance.
    */
   public void addToBalance(double depositAmt){
      //TODO 3: implement this method.
      currentBalance = currentBalance + depositAmt;
   }
   
   /* Returns the account name. */
   public String getAcctName(){
      //TODO 4: Implement this method.
      //acctName = myAcct.getAcctName();
      acctName = acctName;
      return acctName;
   }
   
   /* Returns the current balance. */
   public double getAcctBalance(){
      //TODO 5: Implement this method.
      currentBalance = currentBalance;
      return currentBalance;
   }
   
   /* Returns the number of purchases made. */
   public int getNumberOfPurchases(){
      //TODO 6: Implement this method.
      numPurchases = numPurchases;
      return numPurchases;
   }
   
   /* Returns the total amount purchased.  */
   public double getTotal(){
      totalAmtPurchased = totalAmtPurchased;
      return totalAmtPurchased;
   }
   
}
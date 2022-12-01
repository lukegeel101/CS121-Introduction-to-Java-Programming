import java.util.Scanner;
/* 
  This class manages the interaction between a user and their store account. 
*/
public class StoreAccountMain{
   
   public static void main(String[] args){

      Scanner scan = new Scanner(System.in); 
      System.out.println("Welcome to the Account Manager");
      System.out.println("Please enter your name:");
      String acctName = scan.nextLine();
      StoreAccount myAcct = new StoreAccount(acctName, 100.00);
      int userAnswer =0; 
      
      /* A while loop runs as long as 
       * the condition inside the parenthises is true. In this case, we want
       * the code to run as long as the user has not chosen 4, which is when
       * they want to quit */
      while(userAnswer != 4){
         // As a note, '\t' is the equivalent of pressing the "tab" key
         System.out.println("Would you like to:");
         System.out.println("\t1) Print account summary.");
         System.out.println("\t2) Make purchase.");
         System.out.println("\t3) Add to balance.");
         System.out.println("\t4) Quit");
         
         userAnswer = Integer.parseInt(scan.nextLine());
         
         // If the user wants to print a summary.
         if(userAnswer == 1){
            System.out.println("Account summary for: "+myAcct.getAcctName()); 
            System.out.println("Number of purchases: "+myAcct.getNumberOfPurchases());
            System.out.println("Total purchase amount: "+myAcct.getTotal());
            System.out.println("Balance: "+myAcct.getAcctBalance());  
            System.out.println(" ");      
         }
         // If the user wants to make a purchase.
         else if(userAnswer == 2){
             System.out.println("Enter item cost: ");
             double itemCost = Double.parseDouble(scan.nextLine());
             myAcct.makePurchase(itemCost);
         }
         // If the user wants to add to their balance.
         else if(userAnswer == 3){
            System.out.println("Enter amount to deposit: ");
            double deposit = Double.parseDouble(scan.nextLine());
            myAcct.addToBalance(deposit);

         }
         /* If the user is done and wants to exit we don't do anything, and when
          * we reach the end of the while loop it will check the condition (which 
          * will be false) and not run the loop again */
          
      } // End of while loop
      
      System.out.println("Goodbye!"); 
   }
}
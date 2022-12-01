import java.util.Scanner;
/* This class manages a console interface interaction between a user and 
 * an instance of a list of their personal contacts.
*/
public class ContactListMain {
       
    public static void main(String[] args){
       
         System.out.println("My Contact List");
         Scanner scan = new Scanner(System.in);
         ContactList contactList = new ContactList();
         
         boolean keepGoing = true;
         String userInputStr = "";
         String contactName = "";
         String contactPhone = "";
         String contactEmail = "";
         int position;
         
         while(keepGoing) {
              System.out.println("");
              System.out.println("Main Menu:");
              System.out.println("Enter A to add a new contact."); 
              System.out.println("Enter R to remove a contact."); 
              System.out.println("Enter P to print all contacts."); 
              System.out.println("Enter C to clear all contacts."); 
              System.out.println("Enter X to quit.");
              System.out.println("");
              userInputStr = scan.nextLine();
              
              if (userInputStr.equalsIgnoreCase("A")){
                 System.out.println("Enter the contact name: ");
                 contactName = scan.nextLine();
                 System.out.println("Enter the contact phone: ");
                 contactPhone = scan.nextLine();
                 System.out.println("Enter the contact email (optional). Click return if no email: ");
                 contactEmail = scan.nextLine();
                 if (contactEmail.length()==0)
                    contactList.addContact(new PersonalContact(contactName, contactPhone));
                 else
                    contactList.addContact(new PersonalContact(contactName, contactPhone, contactEmail));
              }
              else if (userInputStr.equalsIgnoreCase("R")){
                 System.out.println("Enter the name of the contact to be removed:");
                 contactName = scan.nextLine();

                 if(contactList.removeContact(contactName))
                     System.out.println("Contact info for "+contactName+" was removed.");
                 else
                     System.out.println("Contact info for "+contactName+" was not found in the contact list.");
              }
              else if (userInputStr.equalsIgnoreCase("P")){
                 System.out.println("Your contacts: ");
                 System.out.println(getContactListAsString(contactList.getContactList()));
              }
              else if (userInputStr.equalsIgnoreCase("C")){
                 contactList.clearContactList();
                 System.out.println("All contacts cleared.");
              }
              else if(userInputStr.equalsIgnoreCase("X"))
                 keepGoing = false;
              else
                 System.out.println("Unrecognized input.");               
         }
         System.out.println("Bye for now.");
         scan.close();
    }

   /* Returns a String representation of the current item list with the ordinal numbers.
    * If no contacts are on the list, the String returned is: "no contacts".
    */
    public static String getContactListAsString(PersonalContact[] contacts){
       StringBuilder sb = new StringBuilder();
       int numContacts = contacts.length;
       if(numContacts==0)
         sb.append("no contacts");
       else{
         for(int i=0;i<numContacts;i++)
           sb.append(i+1).append(" ").append(contacts[i]).append("\n");
       }
       return sb.toString();
    }     
}
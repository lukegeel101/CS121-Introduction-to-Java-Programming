
public class ContactList {
    private static int INITIAL_LENGTH = 3;
    private PersonalContact[] contacts;
    private int numContacts;

   /* Constructor:
    * The array is initialized in the constructor to an initial length that is the class final
    * static variable INITIAL_LENGTH. The initial array contains only NULL values. The variable that keeps track of
    * the number of contacts on the list, numContacts, is initialized to 0.
    */    
    public ContactList(){
    //TODO 3: implement this method.


    }
    
   /* 
    *  Returns true if the contact list contains no contacts, false otherwise.
    */
    public boolean isEmpty(){
    //TODO 4: implement this method.
      return true;
    }
   
   /* Adds the PersonalContact object to the next available location in the array.
    * Before adding, the list is checked to see if it is full by calling the isFull() method.
    * If the list is full, it must be expanded before the contact can be added. To do this,
    * the expandList method is called, then the contact is added. If the list is not full, the 
    * contact is added. The numContacts can serve as an index number of the next available cell.
    * After adding, numContacts is updated.
    * Note: the array may have fewer contacts (PersonalContact objects) than its length.
    */
    public void addContact(PersonalContact newContact){
    //TODO 7: implement this method.


    }
   
   /* Removes a contact from the list if it is in the list. The name of 
    * the contact is used to find the contact. If a match to the name is found, 
    * the value at that index is overwritten by null. Then the compressList
    * function is called to re-order the list so all objects are next to each other,
    * starting at index 0.
    * This method returns true if a contact was removed, false otherwise. 
    * After removing, numContacts is updated.
    */
    public boolean removeContact(String targetName){
    //TODO 9: implement this method.
 
 
      return false;  
    }
   
   /* 
    * Return a list that contains only the PersonalContact objects that have been added.
    * This list does not contain any NULL values.
    * If the list does not contain any contacts, this method returns a PersonalContact array 
    * with zero length.
    */
    public PersonalContact[] getContactList(){
    //TODO 10: implement this method.
    

      return null;
    }
   
   /* 
    * Removes all items from the list, resulting in an empty list.
    * The capacity of the new list will revert to the INITIAL_LENGTH.
    * numContacts is reset to 0.
    */
    public void clearContactList(){
    //TODO 11: implement this method.


    }
    
    /****** Private, "helper" method section ******/
   
   /* 
    * This method returns true if all cells in the array contain a PersonalContact
    * object, false otherwise. 
    */
    private boolean isFull(){
    //TODO 5: implement this method.
      return true;
    }
   
   /* Creates a new contacts array that is double the size of the current array.
    * It then copies the contacts from the current array to the new array. 
    * Note that the new array will contain the contacts from the current array followed 
    * by NULL values.
    */
    private void expandList(){
    //TODO 6: implement this method.


    }
    
   /* 
    * This method ensures that all PersonalContact objects in the contact list
    * are stored contiguously: next to each other (with no null value between any 
    * of them) starting at index 0. 
    * The method traverses the list and if it finds a null value it moves all objects 
    * to maintain contiguous storage. Design an algorithm to do this and implement it.
    * 
    */
    private void compressList(){
    //TODO 8: implement this method.


    }
   
}
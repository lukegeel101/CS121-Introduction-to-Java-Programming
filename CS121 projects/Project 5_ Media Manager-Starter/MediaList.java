import java.util.ArrayList;
import java.util.Collections;

/**This class encapsulates a list of media items in a user's collection.
*  The list is implemented as an ArrayList of type MediaItem.
*  Media items are either a book (electronic format), movie, video game, podcast, or song. 
*  Each type of media item is represented by an instance of the Book, Movie, VideoGame, Podcast, or Song class.
*  These classes are subclasses of MediaItem. The list stores media items as 
*  references of type MediaItem.   
**/
public class MediaList {

   /* TODO 6: Declare instance variables:
    * Class instance variable declarations section.
    * You are required to declare at least one instance variable called itemList.
    * That variable should be an ArrayList of type MediaItem. 
    * This variable is the primary data structure that stores all of the MediaItem objects 
    * in the library.
    * You may declare other instance variables if you wish. Points will be 
    * deducted if you declare local variables here. A variable is local if
    * it is used in only one method.
   */


   /* TODO 7: Constructor
   * You will use this Constructor to initialize your itemList and
   * any other instance variables that were declared above.
   */    
   public MediaList(){
      
   }
   
   /** TODO 8: implement this method.
   *  Add the newItem passed in to the the itemList.
   */
   public void addItem(MediaItem newItem){
      
   }
   
   /** TODO 9: implement this method.
   *  Returns true if the MediaItem with the title and author passed in
   *  is on the itemList, false otherwise. Assume the title/author pair
   *  uniquely identifies a MediaItem. 
   *  NOTE: All String comparisons are case-insensitive.
   */
   public boolean containsItem(String targetTitle, String targetAuthor){
      return false;  
   }
   
   /** TODO 10: implement this method.
   *  Remove the MediaItem with the title and author passed in.
   *  Return true if removed, false if not found or not removed.
   *  Assume the title/author pair uniquely identifies a MediaItem. 
   *  NOTE: All String comparisons are case-insensitive.
   */
   public boolean removeItem(String targetTitle, String targetAuthor){
      return false;
   }
   
   /** TODO 11: implement this method.
   *  This method returns an array of the String representation of all of 
   *  the MediaItem objects that are currently stored in the itemList.
   *  A String representation of a MediaItem is returned by calling its toString() method. 
   *  The array returned may not contain any NULL values. This method returns an array of 
   *  length 0 if the itemList is empty.
   **/
   public String[] getItemListAsStringArray(){
      return null;
   }

   /**TODO 12: implement this method.
   *  This method returns a new array that contains only the String representations 
   *  of all MediaItems whose genre matches the targetGenre passed in.
   *  A String representation of a MediaItem is returned by calling its toString() method.
   *  The array returned may not contain any NULL values.
   *  This method returns an array of length 0 if there are no matches.
   **/   
   public String[] getAllItemsByGenre(String targetGenre){
      
      return null;    
   }
   
   /**TODO 13: implement this method.
   *  This method returns a new array that contains only the String representations 
   *  of all MediaItems whose author matches the targetAuthor passed in.
   *  The array returned may not contain any NULL values.
   *  This method returns an array of length 0 if there are no matches.
   *  NOTE: All String comparisons are case-insensitive.
   **/   
   public String[] getAllItemsByAuthor(String targetAuthor){
      return null;    
   }
   
   /** TODO 14: implement this method.
   *  This method returns a sorted array of the names of all the authors for
   *  all the media items in the list. This list should not contain duplicates.
   *  Hint: use Arrays.sort for sorting an array, or Collections.sort for sorting
   *        an ArrayList.
   **/
   public String[] getSortedListOfAuthors(){
      return null;
   }
   
   /** TODO 15: implement this method.
    *  Returns the number of items currently stored in the itemList. 
   **/
   public int getNumItems(){
      return -1;
   }
    
   /** TODO 16: implement this method.
    * Returns true if the itemList contains no MediaItems, false otherwise.  
   **/
   public boolean isEmpty(){
      return false;
   }
  
   /****** Private, "helper" method section. You may define any private 
           methods you want below.  This is not a requirement of this project. 
           These methods perform tasks that make the code above simpler and easier to 
           develop, troubleshoot, and understand.
    ******/
 }
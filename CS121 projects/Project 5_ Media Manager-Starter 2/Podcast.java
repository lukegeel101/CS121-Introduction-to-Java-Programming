/**
 * This class encapsulates the data required to represent a podcast in a collection
 * of MediaItems. It derives from MediaItem.
 * In addition to its superclass attributes, the attributes of a podcast are: 
 *     String: its description, String: its website, String: its date, 
 *     true if it is a video podcast, false otherwise.
 **/
 public class Podcast extends MediaItem {
   /* TODO 5.1: instance variable declarations */

   
   /* TODO 5.2: Constructor*/ 
   public Podcast(String title, String author, String genre, String description,
                  String website, String date, boolean isVideo){



   }
   
   /* TODO 5.3: write three "getter" methods: getDescription, getWebsite, getDate*/



   /* TODO 5.4: write the isVideo method that returns true if 
    * this is a video podcast, false otherwise.
    */
   

   
  /* TODO 5.5: Override the superclass toString method. Use a call to the superclass toString method
   * to get the superclass attributes.
   * The return should have the format:
   *   Podcast: [title], [author], [genre], [description], [website], [date], [isVideo]
   * For example:
   *   "Podcast: Bit Flip, Simon Adler, science, Back in 2003, Belgium was holding a national election. One of their first where the votes would be cast and counted on computers. Thousands of hours of preparation went into making it unhackable. And when the day of the vote came, everything seemed to have gone well. That was, until a cosmic chain of events caused a single bit to flip and called the outcome into question., https://www.wnycstudios.org/podcasts/radiolab, May 8, 2019, false"
   */
  public String toString(){
     
  }
  
}
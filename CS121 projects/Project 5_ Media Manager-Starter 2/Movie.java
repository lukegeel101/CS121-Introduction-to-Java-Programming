/**
 * This class encapsulates the data required to represent a movie in a collection
 * of MediaItems. It derives from MediaItem.
 * In addition to its superclass attributes, the attributes of a movie are: 
 *       int: playing time (minutes), String: lead actor, and String: year of release.
 **/
 public class Movie extends MediaItem {
  /* TODO 4.1: instance variable declarations */

  
  /* TODO 4.2: Constructor*/ 
  public Movie(String title, String author, String genre, 
                   int playTime, String leadActor, String releaseYear){

  }
  
  //TODO 4.3: write these three get methods: getPlayTime, getLeadActor, getReleaseYear







  
  /* TODO 4.4: Implement this method:
   * Override the superclass toString method. Use a call to the superclass toString method
   * to get the superclass attributes.
   * The return should have the format:
   *   Movie: [title], [author], [genre], [playTime], [leadActor], [releaseYear]
   * For example:
   *   "Movie: Black Panther, Coogler, fantasy, 134, Chadwick Boseman, 2018"
   */
  public String toString(){
     return null;
  }
}
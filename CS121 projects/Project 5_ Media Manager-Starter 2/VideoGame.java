/**
 * This class encapsulates the data required to represent a video game in a collection
 * of MediaItems. It derives from MediaItem.
 * In addition to its superclass attributes, the attributes of a video game are: 
 *       platform and isMultiplayer.
 **/
 public class VideoGame extends MediaItem {

  private String platform;
  private boolean isMultiplayer;
 
  /* TODO 3.1: Constructor*/ 
  public VideoGame(String title, String author, String genre, 
                   String platform, boolean isMultiplayer){
      
  }
  
  /* TODO 3.2: Implement this method*/
  public String getPlatform(){
     return null
  }
  
  /* TODO 3.3: write the isMultiplayer method that returns true if 
    * this is a multiplayer game, false otherwise.
    */
  public boolean isMultiplayer(){
     return null
  }
  
  /* TODO 3.4: Implement this method:
   * Override the superclass toString method. Use a call to the superclass toString method
   * to get the superclass attributes.
   * The return should have the format:
   *   Video Game: [title], [author], [genre], [platform], [isMultiplayer]
   * For example:
   *   "Video Game: Super Mario Odyssey, Shigeru Miyamoto, Platformer, Nintendo Switch, true"
   */
  public String toString(){
     return null;
  }
}
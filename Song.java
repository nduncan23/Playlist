/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String name;
    private String author;
    private int duration;
    private boolean liked;
    public Song(String mystring, String myauthor, int myduration){
        name=myname;
        author=myauthor;
        duration=myduration;
        liked=false;
    }
    public String getName(){
        return name;
    }public String getAuthor(){
        return author;
    }public int getDuration(){
        return duration;
    }public boolean isLiked(){
        return liked;
    }public void like(){
        if(liked){
            liked=false;
        }else{
            liked=true;
        }
    }



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */





     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */


}

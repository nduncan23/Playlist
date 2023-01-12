import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<song> bops;
    



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist(){
        bops= new ArrayList<Song>();
    }public void addSong(Song hit){
        bops.add(hit);
    }public void likeSong(int pos){
        bops.get(pos).like();
    }public void removeSong(int pos){
        bops.remove(pos);
    }public String examine(){
        String too="";
        for(Song s : bops){
            too+="name= "+s.getName()+"; author= "+s.getAuthor()+"; duration=" +s.getDuration()+"liked=" + s.isLiked() +"\n";
        }
    }public String examineLiked(){
        String too="";
        for( int i=0; i<bops.size();i++){
            if(bops.get(i).isLiked()){
                Song s= bops.get(i);
                too+="name= "+s.getName()+"; author= "+s.getAuthor()+"; duration=" +s.getDuration()+"liked=" + s.isLiked() +"\n";
            }

        }
    }
}

      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
}

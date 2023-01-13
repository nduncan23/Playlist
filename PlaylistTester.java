/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist s=new Playlist();
        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        s.add(Song("name1", "author1",60));
        s.add(Song("name2", "author2",60));
        s.add(Song("name3", "author3",60));
        s.add(Song("name1", "author1",60));

        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        System.out.println(s.examine());

        System.out.println("\nLiking the songs in position 2 and 4\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        s.likeSong(2);
        s.likeSong(4);

        System.out.println("Printing the songs...\n");
        System.out.println(s.examine());


        System.out.println("\nRemoving the song in position 3, \n");
        s.removeSong(3);

        System.out.println("Printing the songs...\n");
        System.out.println(s.examine());


        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        System.out.println(s.examineLiked());


        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(""+s.totalDuration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        s.removeUnliked();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        System.out.println(s.examine());

    }
}

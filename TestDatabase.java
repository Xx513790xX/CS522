//Unit test for class Database

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 *
 * @Template author: Shivani
 * @Recreation author: Changhao wang
 */

public class DatabaseTest {
   private java.util.List songList;
   private Song testSong1,testSong2;
   private Database testDB;
   
    public DatabaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        songList =  new java.util.ArrayList();
        
        testSong1 = new Song("Tell Me", "Milet", 
               "Tell me Single", "https://www.youtube.com/watch?v=BOOOXNIHlUI", "Mp3", 219);
        testSong2 = new Song("Astronomia", Vicetone & Tony Igy", 
               "Astronomia Single", "https://www.youtube.com/watch?v=iLBBRuVDOo4", "Mp3", 218);
        
        songList.add(testSong1);
        songList.add(testSong2);
        
        testDB = new Database(songList);
    }
    
    @After
    public void tearDown() {
        songList = null;
        testDB = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testGetSong1() {
       assertEquals(testSong1,true,songList..GetSongList(0));
     } 
     @Test
     public void testSongList() {
       assertEquals("SongList if empty should have 0 elements",false,songList.isEmpty());
     }
}

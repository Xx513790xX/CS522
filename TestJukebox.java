//Unit test for Module Jukebox

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

public class JukeBoxTest {
    private JukeBox testJB;
    private Database db;
    private java.util.List songListJB;
    private Song song1,song2;
    private int ccn=1234123443214321;
};
    
    public JukeBoxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testSong1 = new Song("Tell Me", "Milet", 
               "Tell me Single", "https://www.youtube.com/watch?v=BOOOXNIHlUI", "Mp3", 219);
        testSong2 = new Song("Astronomia", Vicetone & Tony Igy", 
               "Astronomia Single", "https://www.youtube.com/watch?v=iLBBRuVDOo4", "Mp3", 218);
      
      songListJB = new java.util.ArrayList();
      
      songListJB.add(testSong1);
      songListJB.add(testSong2);
      
      db = new Database(songListJB);
        
      testJB = new JukeBox(db,ccn);
    }
    
    @After
    public void tearDown() {
        testJB = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testGetSong1() {
       assertEquals(testSong1,true,songListJB.getSong(0));
     }

     @Test
     public void testIsValidCreditCard() {
       assertEquals("Credit card is valid if value is greater than 0",true,testJB.isValidCreditCard());
     }
     @Test
     public void testIsValidCreditCardFalse() {
       ccn = 0;
       assertEquals("Credit card is valid if value is greater than 0",false,testJB.isValidCreditCard());
     }
}

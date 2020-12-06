//Unit test for class Song

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
public class SongTest {
    private Song testSong1, testSong2;
    public SongTest() {
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
    }
    
    @After
    public void tearDown() {
        testSong1 = null;
        testSong2 = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testGetName1() {
       assertEquals("Tell Me",true,testSong1.GetName());
     } 
     @Test
     public void testGetName1Negative() {
       assertEquals("42",false,testSong1.GetName());
     } 
     @Test
     public void testPredict1() {
       assertEquals("Song is long if length is more than 50",true,testSong1.Predict());
     }
     @Test
     public void testPredict1False() {
       assertEquals("Song is long if length is more than 50",false,testSong1.Predict());
     }
     @Test
     public voidtestPredict2() {
       assertEquals("Song is long if length is more than 50",true,testSong2.Predict());
     }
}

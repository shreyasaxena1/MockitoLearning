package assertionTest;

import assertions.Player;
import assertions.PlayerStatistics;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerStatisticsTest {
     //Test equals method in player.java
    /*assertEquals - test two objects are equal as per .equals method
    first argument - message - why assertion failed
     */


    Player playerMichel;
    PlayerStatistics michelUnderThirty;
    @BeforeEach
    //run before each test cases - reduce some code lines
    public void setup(){
        playerMichel = new Player("Micheal",23);
        michelUnderThirty = new PlayerStatistics(playerMichel,4,8);
    }

    @Test
    public void playerNameEquals(){


        Player player2 = new Player("Micheal",23);

        assertEquals(playerMichel,player2);
    }

    @Test
    public void playerNameNotEqual(){


        Player player2 = new Player("Kelvin",23);

        assertNotEquals(playerMichel,player2);
    }
    /*Rather than equating two objects with its equal method
     we can assert upon the actual memory location of the object
     (==)
     */

    @Test
    public void youngerPlayerSame(){


        Player player2 = new Player("Micheal",25);

        assertSame(playerMichel, PlayerStatistics.getYoungerPlayer(playerMichel,player2));
        //1st arg - expected value
        //2nd arg - get value from

        //If we use assertEqual it will only check name hence we will pass TC when expected is player2

    }

    //asserting true boolean

    @Test
    public void underThirtyTrue(){
        assertTrue(michelUnderThirty.underThirty());
    }

    @Test
    public void underThirtyFalse(){

        Player player1 = new Player("Micheal",33);
        PlayerStatistics ps = new PlayerStatistics(player1,3,3);

        assertFalse(ps.underThirty());
    }

    //assertEquals(false/true, -----)

    @Test
    public void csvReportNull(){


        PlayerStatistics ps= new PlayerStatistics(playerMichel,0,0);

        assertNull(ps.createCsvRecord());
    }

    @Test
    public void csvReportNotNull(){


        assertNotNull(michelUnderThirty.createCsvRecord());
    }

    @Test
    public void getCsvStatsRecord(){


        Double[] expectedArray ={2d,0.5};

        assertArrayEquals(expectedArray,michelUnderThirty.createCsvRecord());
    }
}

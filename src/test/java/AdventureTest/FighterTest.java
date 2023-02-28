package AdventureTest;

import PlayGround.Fighter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FighterTest {

    private Fighter bob = null;
    private Fighter noName = null;

    //before every test this function executes
    @Before
    public void initTestData(){
        bob = new Fighter ("bob");
        noName = new Fighter();
    }

    @Test
    public void testAlwaysTrue(){
        assertTrue(true);
    }

    //if i make a fighter with the name it gets set to the name property
    @Test
    public void testFighterNameGetterMatchesConstructor() {
        noName.setName("other bob"); //will not affect other test cases
        assertEquals("bob", bob.getName());
    }

    @Test
    public void testFighterNoName(){
        assertEquals("Unknown fighter",noName.getName());
    }

    //this kind of test is very important to testing
    @Test
    public void testNoNameHitsBob(){
        noName.hit(bob);
        assertEquals(90,bob.getHealth());
    }


    @Test(expected = IllegalArgumentException.class)
    public void testFighterNameTooShort(){
        //test will pass if it throws an exception when making
        // a fighter with a name that is too short
        Fighter foo = new Fighter("");
    }

    @Test
    public void testIfChangeIsCorrect() {
        double x = 0;
        x += .1;
        x += .1;
        x += .1;
        System.out.println(x);

        assertEquals(.3,x,.0000001);
    }
}

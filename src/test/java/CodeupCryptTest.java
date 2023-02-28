import org.junit.Test;

import static org.junit.Assert.*; //* means all

public class CodeupCryptTest {

    //focus in testing hashPassword
    //takes a string that is a password
    //returns a string that is the hashed password
    //replace vowels with numbers

    @Test
    public void testHashPasswordEmpty(){
        assertEquals("",CodeupCrypt.hashPassword(""));
    }

    @Test
    public void testHashPasswordA(){
        assertEquals("4bc",CodeupCrypt.hashPassword("abc"));
    }

    @Test
    public void testHashPasswordE(){
        assertEquals("3bc",CodeupCrypt.hashPassword("ebc"));
    }

    @Test
    public void testHashPasswordI(){
        assertEquals("1bc",CodeupCrypt.hashPassword("ibc"));
    }

    @Test
    public void testHashPasswordO(){
        assertEquals("0bc",CodeupCrypt.hashPassword("obc"));
    }

    @Test
    public void testHashPasswordU(){
        assertEquals("9bc",CodeupCrypt.hashPassword("ubc"));
    }

    @Test
    public void testHashPasswordNoVowels(){
        assertEquals("bcxyz",CodeupCrypt.hashPassword("bcxyz"));
    }

}

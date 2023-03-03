import org.example.StringUtilities;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Demo {


    @Test
    public void methodTesting(){
       // assertEquals(2,3);
        assertNotEquals(1,9);
    }
    @Test
  public void test1(){
        assertTrue(true);

    }
    @Test
    public void test2(){
        assertTrue(2==2);

    }
    @Test
    public void test3(){
        assertTrue("abc".length()==3);

    }
    @Test
    public void Test4(){
        assertFalse(false);
    }
    @Test
    public void Test5(){
        assertFalse(5==9);
    }
    @Test
    public void testIsCaptilized(){
        String s="Apple";
        String s1="a";
        String s2=null;

        StringUtilities stringUtilities =new StringUtilities();
        assertFalse(stringUtilities.isCapitalized(s1));
        assertTrue(stringUtilities.isCapitalized(s));
    }

}

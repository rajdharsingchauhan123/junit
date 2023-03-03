import org.example.StingUtilites;
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
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class practice01 {
    int x=2;
    int y=2;
    int z=4;
boolean a=(x==y);
boolean b=(x==z);
    @Test
    public void practice(){
//        assertTrue(x==y);
        assertTrue(a);
    }
    @Test
    public void practice1(){
//        assertFalse(x==z);
        assertFalse(b);
    }
    @Test
    public void practice2(){
assertNotEquals(a,b);
    }
}

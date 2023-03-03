import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class practice01 {
    int x=2;
    int y=2;
    int z=4;
boolean a=(x==y);
boolean b=(x==y);
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
}

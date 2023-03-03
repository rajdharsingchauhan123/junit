import org.example.ReactangelUtilities;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReactangleUtilities {
    @Test
    public void tesGetParameter(){
        int height=4;
        int weight=6;
        int expected=20;
        int actual= ReactangelUtilities.getPerimeter(height,weight);
        assertEquals(expected,actual);
    }
}

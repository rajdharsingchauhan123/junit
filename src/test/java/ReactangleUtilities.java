import org.example.ReactangelUtilities;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReactangleUtilities {

    @BeforeAll
    public static void setup(){
        System.out.println("first");
    }
    @AfterAll
    public static void tearDown(){
        System.out.println("last");
    }
    @Test
    public void tesGetParameter(){
        int height=4;
        int weight=6;
        int expected=20;
        int actual= ReactangelUtilities.getPerimeter(height,weight);
        assertEquals(expected,actual);
    }
}

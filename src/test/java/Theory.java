import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Theory {
    @Test
    public void Test(){
        int arr1[]={1,2,3};
        int arr2[]={1,2,3};
        int arr3[]={1,3,4};
        assertArrayEquals(arr1,arr2);
       // assertArrayEquals(arr1,arr3);

    }
}

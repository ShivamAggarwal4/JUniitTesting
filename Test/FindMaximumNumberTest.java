import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaximumNumberTest {

    @Test
    public void testFindMax(){
        assertEquals(4,FindMaximumNumber.findMax(new int[]{1,3,4,2}));
        assertEquals(-1,FindMaximumNumber.findMax(new int[]{-12,-1,-3,-4,-2}));
        assertEquals(0,FindMaximumNumber.findMax(new int[]{-12,-1,-3,-4,-2}));
    }
}
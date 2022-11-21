package JunitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class JunitTesting {
    
    JunitApp jUnitApp = new JunitApp();

    Copy copy = new Copy("lady", 235434, true);

    @Test
    public void testArrayList(){

        jUnitApp.addArray(0);
        jUnitApp.addArray(1);
        jUnitApp.addArray(2);


        assertEquals(2, jUnitApp.getArrList(2));
    }

    @Test 
    public void testSameReturn() {

        Copy copy2 = copy.getCopy();

        assertSame(copy, copy2);    
    }
}
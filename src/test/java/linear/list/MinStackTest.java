package linear.list;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by justin on 2/6/18.
 */
public class MinStackTest {

    @Test
    public void testGetMin() {
        MinStack s = new MinStack();
        try {
            s.push(4);
            s.push(3);
            s.pop();
            s.push(6);
            int min = s.getMin();
            assertEquals(min, 4);
        }
        catch(RuntimeException e ){
            e.printStackTrace();
        }

    }


}
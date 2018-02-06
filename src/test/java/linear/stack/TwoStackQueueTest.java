package linear.stack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by justin on 2/6/18.
 */
public class TwoStackQueueTest {
    @Test
    public void testQueue(){
        TwoStackQueue queue = new TwoStackQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        assertEquals(queue.poll(), 1);
        assertEquals(queue.poll(), 2);
        queue.add(4);
        queue.add(5);
        assertEquals(queue.poll(), 3);
        queue.add(6);
        assertEquals(queue.peek(), 4);
    }

}
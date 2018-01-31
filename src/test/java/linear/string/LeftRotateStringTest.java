package linear.string;

import org.junit.Test;

import static org.junit.Assert.*;
import static linear.string.LeftRotateString.leftRotate;

/**
 * Created by justin on 6/27/17.
 */
public class LeftRotateStringTest {

    @Test
    public void main() throws Exception {
        char[] s = "ABCDEFG".toCharArray();
        leftRotate(s, 17);
        assertEquals("DEFGABC", String.valueOf(s));
    }



}
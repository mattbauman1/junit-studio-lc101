package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    BalancedBrackets test_class;

    @Before
    public void makeObject() {
        test_class = new BalancedBrackets();
    }

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyReverseBracketsReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("]["));
    }

    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("[[[[[]]]]]"));
    }

    @Test
    public void reverseNestedBracketsReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("]]]]][[[[["));
    }

    @Test
    public void individualSetsBracketsReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("[][][][][][][][][][]"));
    }

    @Test
    public void reverseIndividualSetsBracketsReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("][][][][][][][][][]["));
    }

    @Test
    public void oddBracketsReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("[][]["));
    }

    @Test
    public void singleRightBracketsReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("["));
    }

    @Test
    public void singleLeftBracketsReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("]"));
    }

    @Test
    public void allLeftBracketsReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("]]]]]]]]]]]]]]]"));
    }

    @Test
    public void allRightBracketsReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("[[[[[[[[[[[[[[["));
    }

    @Test
    public void mixBracketsReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("[]]]][[[][[]][[]][[]]][[[]"));
    }

    @Test
    public void mixedBracketsReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("[[[]]][]]][]]][[[[]]]]][[[]]]["));
    }


}

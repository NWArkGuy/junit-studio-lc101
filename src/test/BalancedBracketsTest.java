package test;

import org.junit.Test;
import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    // 1 - [LaunchCode] : True
    @Test
    public void hasBalancedBrackets_beginAndEndBracket() {
        var string = "[LaunchCode]";
        var expected = hasBalancedBrackets(string);
        assertTrue(string, expected);
    }

    // 2 - Launch[Code]
    @Test
    public void hasBalancedBrackets_bracketAroundCode() {
        var string = "Launch[Code]";
        var expected = hasBalancedBrackets(string);
        assertTrue(string, expected);
    }

    // 3 - []LaunchCode
    @Test
    public void hasBalancedBrackets_bracketAtBegin() {
        var string = "[]LaunchCode";
        var expected = hasBalancedBrackets(string);
        assertTrue(string, expected);
    }

    // 4 -
    @Test
    public void hasBalancedBrackets_emptyString() {
        var string = "";
        var expected = hasBalancedBrackets(string);
        assertTrue(string, expected);
    }

    // 5 - []
    @Test
    public void hasBalancedBrackets_onlyBrackets() {
        var string = "[]";
        var expected = hasBalancedBrackets(string);
        assertTrue(expected);
    }

    // 6 - [[
    @Test
    public void hasBalancedBrackets_onlyOpenBrackets() {
        var string = "[[";
        var expected = hasBalancedBrackets(string);
        assertFalse(expected);
    }

    // 7 - ]]
    @Test
    public void hasBalancedBrackets_onlyCloseBrackets() {
        var string = "]]";
        var expected = hasBalancedBrackets(string);
        assertFalse(expected);
    }

    // 8 - ][
    @Test
    public void hasBalancedBrackets_oppositeBrackets() {
        var string = "][";
        var expected = hasBalancedBrackets(string);
        assertFalse(expected);
    }

    // 9 - [][]
    @Test
    public void hasBalancedBrackets_twoBracketsLoops() {
        var string = "[][]";
        var expected = hasBalancedBrackets(string);
        assertTrue(expected);
    }

    // 10 - [[]]
    @Test
    public void hasBalancedBrackets_nestedBrackets() {
        var string = "[[]]";
        var expected = hasBalancedBrackets(string);
        assertTrue(expected);
    }

    // 11 - ]LaunchCode
    @Test
    public void hasBalancedBrackets_onlyOpenBracketBeforeString() {
        var string = "]LaunchCode";
        var expected = hasBalancedBrackets(string);
        assertFalse(expected);
    }

    // 12 - Launch]Code[
    @Test
    public void hasBalancedBrackets_incorrectBracketLoopInString() {
        var string = "Launch]Code[";
        var expected = hasBalancedBrackets(string);
        assertFalse(expected);
    }

    // 13 - [
    @Test
    public void hasBalancedBrackets_onlyOpenBracket() {
        var string = "[";
        var expected = hasBalancedBrackets(string);
        assertFalse(expected);
    }

    // 14 - ]
    @Test
    public void hasBalancedBrackets_onlyCloseBracket() {
        var string = "]";
        var expected = hasBalancedBrackets(string);
        assertFalse(expected);
    }

    // 15 - pass in null : should be 0
    @Test
    public void hasBalancedBrackets_Null_ShouldReturnFalse() {
        var expected = hasBalancedBrackets(null);
        assertFalse(expected);
    }

}

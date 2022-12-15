package com.example;

import org.example.Solution;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    static Solution solution;

    int n;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void withOnlyOneStoneIWouldWin(){

        n = 1;

        assertTrue(solution.canWinNim(n));
    }

    @Test
    public void withTwoStonesIWouldWin(){

        n = 2;

        assertTrue(solution.canWinNim(n));
    }

    @Test
    public void withFourStonesIWouldLose(){

        n = 4;

        assertFalse(solution.canWinNim(n));
    }

    @Test
    public void withEightyFourStonesIWouldLose(){

        n = 84;

        assertFalse(solution.canWinNim(n));
    }

    @Test
    public void withNinetyNineStonesIWouldWin(){

        n = 99;

        assertTrue(solution.canWinNim(n));
    }
}

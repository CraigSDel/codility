package com.craigsdel.leader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DominatorTest {
    private Dominator dominator;

    @BeforeEach
    public void before() {
        dominator = new Dominator();
    }

    @Test
    public void Test1() {
        assertEquals(3, dominator.solution(new int[]{3, 0, 1, 1, 4, 1, 1, 10, 1, 12, 2, 10000}));
        assertEquals(3, dominator.solution(new int[]{3, 0, 1, 1, 4, 1, 1}));
        assertEquals(-1, dominator.solution(new int[]{1, 2, 3, 4, 5, 6, 7}));
        assertEquals(1, dominator.solution(new int[]{1, 1, 1}));
        assertEquals(1, dominator.solution(new int[]{1, 1}));
    }
}

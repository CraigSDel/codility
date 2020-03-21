package com.craigsdel.binarygap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryGapTest {

    @Test
    public void solution() {
        assertEquals(5, new BinaryGap().solution(1041));
        assertEquals(0, new BinaryGap().solution(15));
        assertEquals(0, new BinaryGap().solution(32));
    }
}

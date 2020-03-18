package com.craigsdel;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FishTest {
    Fish fish;

    @BeforeEach
    public void before() {
        fish = new Fish();
    }

    @Test
    public void whenGivenFiveFishAndTwoAreMovingRightAndTheRestAreSmaller() {
        List<Integer> fishSize = List.of(4, 8, 2, 6, 7);
        List<Integer> fishDirection = List.of(0, 1, 1, 0, 0);
        assertEquals(2, fish.howManyFishSurvive(fishSize, fishDirection));
    }

    @Test
    public void whenGivenFiveFishAndTheSecondIsMovingTowardsTheLargest() {
        List<Integer> fishSize = List.of(4, 3, 2, 1, 5);
        List<Integer> fishDirection = List.of(0, 1, 0, 0, 0);
        assertEquals(2, fish.howManyFishSurvive(fishSize, fishDirection));
    }

    @Test
    public void whenGivenFiveFishAllSmallerThanTheFirst() {
        List<Integer> fishSize = List.of(5, 4, 3, 3, 1);
        List<Integer> fishDirection = List.of(1, 0, 0, 0, 0);
        assertEquals(1, fish.howManyFishSurvive(fishSize, fishDirection));
    }

    @Test
    public void whenGivenFiveFishAllSmallerThanTheFirstButTwoSwimmingUpstream() {
        List<Integer> fishSize = List.of(5, 4, 3, 3, 1);
        List<Integer> fishDirection = List.of(1, 0, 0, 0, 1);
        assertEquals(2, fish.howManyFishSurvive(fishSize, fishDirection));
    }
}

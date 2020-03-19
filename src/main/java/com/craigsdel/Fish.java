package com.craigsdel;

import java.util.List;
import java.util.Stack;

public class Fish {

    public int howManyFishSurvive(List<Integer> fishSize, List<Integer> fishDirection) {
        // 1 - Upstream
        // 0 - Downstream
        int survivorsSwimmingDownStream = 0;
        Stack<Integer> fishSwimmingUpstream = new Stack();
        for (int i = 0; i < fishDirection.size(); i++) {
            if (fishDirection.get(i) == 1) {
                fishSwimmingUpstream.push(fishSize.get(i));
                continue;
            }
            if (fishSwimmingUpstream.isEmpty()) {
                survivorsSwimmingDownStream++;
            } else {
                while (!fishSwimmingUpstream.isEmpty() && fishSize.get(i) > fishSwimmingUpstream.peek()) {
                    fishSwimmingUpstream.pop(); // remove the fish from the stack
                }
                if (fishSwimmingUpstream.size() == 0) {
                    survivorsSwimmingDownStream++; // the fish survived
                }
            }
        }
        return survivorsSwimmingDownStream + fishSwimmingUpstream.size();
    }
}

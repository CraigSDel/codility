package com.craigsdel.leader;

public class Dominator {

    public int solution(int[] dominatorItems) {
        int index = -1;
        for (int i = 0; i < dominatorItems.length; i++) {
            if (i < dominatorItems.length - 1 && dominatorItems[i] == dominatorItems[++i]) {
                index = i;
            }
        }
        return index;
    }
}

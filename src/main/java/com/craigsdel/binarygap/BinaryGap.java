package com.craigsdel.binarygap;

public class BinaryGap {
    public int solution(int N) {
        String n = Integer.toBinaryString(N);

        int indexStart = 0;
        int indexEnd = 0;
        int currentLongestStart = 0;
        int currentLongestEnd = 0;

        final char[] chars = n.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                indexStart = i;
            }
            if (chars[i] == '0') {
                indexEnd = i;
            }
            if ((indexEnd - indexStart) > (currentLongestEnd - currentLongestStart)) {
                currentLongestStart = indexStart;
                currentLongestEnd = indexEnd;
            }
        }
        return (currentLongestEnd - currentLongestStart + 1) == n.length() ? 0 : currentLongestEnd - currentLongestStart;
    }
}

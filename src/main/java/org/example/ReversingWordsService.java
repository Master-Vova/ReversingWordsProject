package org.example;

import java.util.Arrays;

public class ReversingWordsService {
    public static String reverseWords(String sentence) {
        String[] splitSentence = sentence.split(" ");
        String reversedSentence = "";

        for (String word : splitSentence) {

            String reversedWord = reversingSingleWord(word);
            System.out.println(reversedWord + " is reversed word of " + word);
            reversedSentence =  reversedSentence.concat(reversedWord) + " ";
        }
        return reversedSentence.strip();
    }

    public static String reversingSingleWord(String word) {

        char[] orArray = word.toCharArray();
        char[] jArray = Arrays.copyOf(orArray, orArray.length);

        int stCounter = 0;
        int endCounter = 0;

        for (int i = 0; i < (orArray.length); i++) {

            if (!Character.isLetter(jArray[i])) {            // moving starting point
                ++stCounter;
                continue;
            } else if (!Character.isLetter(orArray[orArray.length -
                    i - 1 + stCounter - endCounter])) {   // moving ending point
                ++endCounter;
                --i;
                continue;
            }
            jArray[i] = orArray[orArray.length - i - 1 + stCounter - endCounter];
        }
        return new String(jArray);
    }
}

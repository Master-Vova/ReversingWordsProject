package org.example;

public final class ReversingWordsServiceUtil {
    public static String reverseSentence(String sentence) {


        sentence = cleaningSentence(sentence);

        String[] splitSentence = sentence.split(" ");
        String reversedSentence = "";

        for (String word : splitSentence) {

            String reversedWord = reverseWord(word);
            System.out.println(reversedWord + " is reversed word of " + word);
            reversedSentence =  reversedSentence.concat(reversedWord) + " ";
        }
        return reversedSentence.strip();
    }

    private static String reverseWord(String word) {

        char[] array = word.toCharArray();

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (!Character.isLetter(array[left])) {
                ++left;
                continue;
            } else if (!Character.isLetter(array[right])) {
                --right;
                continue;
            }
            char temporary = array[left];
            array[left] = array[right];
            array[right] = temporary;
            ++left;
            --right;
        }
        return new String(array);
    }

    private static String cleaningSentence(String sentence){
        sentence = sentence.replaceAll(",", " ");
        sentence = sentence.replaceAll("\\s+", " ");
        return sentence;
    }
}

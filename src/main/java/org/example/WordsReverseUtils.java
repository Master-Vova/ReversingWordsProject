package org.example;

public final class WordsReverseUtils {
    private WordsReverseUtils(){}
    public static String reverseSentence(String input) {
        if (input == null){
            throw new NullPointerException("null is not allowed");
        }

        input = cleaningInput(input);
        String[] splitWords = input.split(" ");
        String output = "";

        for (String word : splitWords) {
            String reversedWord = reverseWord(word);
            System.out.println(reversedWord + " is reversed word of " + word);
            output =  output.concat(reversedWord) + " ";
        }
        return output.strip();
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
    private static String cleaningInput(String string){
        string = string.replaceAll(",", " ");
        string = string.replaceAll("\\s+", " ");
        return string;
    }
}


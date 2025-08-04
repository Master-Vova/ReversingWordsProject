package org.example;

import java.util.Scanner;
public class Main {
        public static void main(String[] args) {

            Scanner write = new Scanner(System.in);

            System.out.println("Type a word and I will check if your word has anagram:");

            String sentence = write.nextLine();
            String reversedSentence = ReversingWordsService.reverseWords(sentence);

            System.out.println(reversedSentence);

        }
}

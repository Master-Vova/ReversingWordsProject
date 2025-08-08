package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner write = new Scanner(System.in);

        System.out.println("Type a word and we will reverse it:");

            String sentence = write.nextLine();
            String reversedSentence = WordsReverseUtils.reverseSentence(sentence);

        System.out.println(reversedSentence);
    }
}

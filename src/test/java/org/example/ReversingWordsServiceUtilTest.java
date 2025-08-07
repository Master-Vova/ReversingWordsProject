package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversingWordsServiceTest {

    @Test
    public void test_WordWithOddLettersWithoutSpecials(){
        ReversingWordsService RWS = new ReversingWordsService();
        String result = ReversingWordsService.reverseSentence("science");
        assertEquals("ecneics", result);
    }

    @Test
    public void test_WordWithEvenLettersWithoutSpecials(){
        ReversingWordsService RWS = new ReversingWordsService();
        String result = ReversingWordsService.reverseSentence("silent");
        assertEquals("tnelis", result);
    }

    @Test
    public void test_sequenceOfLettersAndSpecialCharsInARow(){
        ReversingWordsService RWS = new ReversingWordsService();
        String result = ReversingWordsService.reverseSentence("aaaaa11111zzzzz22222");
        assertEquals("zzzzz11111aaaaa22222", result);
    }

    @Test
    public void test_OneWordWithLettersAndSpecialSymbols(){
        ReversingWordsService RWS = new ReversingWordsService();
        String result = ReversingWordsService.reverseSentence("Ph1losoph4");
        assertEquals("hp1osolhP4", result);
    }

    @Test
    public void test_ManyWordsWithLettersAndSpecialSymbols(){
        ReversingWordsService RWS = new ReversingWordsService();
        String result = ReversingWordsService.reverseSentence("house d3ntis1 m@nag&ment");
        assertEquals("esuoh s3itnd1 t@nem&ganm", result);
    }

    @Test
    public void test_OnlyNonLetterCharacters(){
        ReversingWordsService RWS = new ReversingWordsService();
        String result = ReversingWordsService.reverseSentence("1234#$&8");
        assertEquals("1234#$&8", result);
    }
    @Test
    public void test_EmptyString(){
        ReversingWordsService RWS = new ReversingWordsService();
        String result = ReversingWordsService.reverseSentence("");
        assertEquals("", result);
    }

    @Test
    public void test_MultipleConsecutiveSpaces(){
        ReversingWordsService RWS = new ReversingWordsService();
        String result = ReversingWordsService.reverseSentence("           ");
        assertEquals("", result);
    }

    @Test
    public void test_MultipleConsecutivePunctuation(){
        ReversingWordsService RWS = new ReversingWordsService();
        String result = ReversingWordsService.reverseSentence(",,,,,,,,,");
        assertEquals("", result);
    }

    @Test
    public void test_TwoWordsAndBigSpaceBetween(){
        ReversingWordsService RWS = new ReversingWordsService();
        String result = ReversingWordsService.reverseSentence("dog             phase");
        assertEquals("god esahp", result);
    }
}
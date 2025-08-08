package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordsReverseUtilsTest {
        @Test
        public void test_WordWithOddLettersWithoutSpecials(){
            assertEquals("ecneics", WordsReverseUtils.reverseSentence("science"));
        }
        @Test
        public void test_WordWithEvenLettersWithoutSpecials(){
            assertEquals("tnelis", WordsReverseUtils.reverseSentence("silent"));
        }
        @Test
        public void test_sequenceOfLettersAndSpecialCharsInARow(){
            assertEquals("zzzzz11111aaaaa22222", WordsReverseUtils.reverseSentence("aaaaa11111zzzzz22222"));
        }
        @Test
        public void test_OneWordWithLettersAndSpecialSymbols(){
            assertEquals("hp1osolhP4", WordsReverseUtils.reverseSentence("Ph1losoph4"));
        }
        @Test
        public void test_ManyWordsWithLettersAndSpecialSymbols(){
            assertEquals("esuoh s3itnd1 t@nem&ganm", WordsReverseUtils.reverseSentence("house d3ntis1 m@nag&ment"));
        }
        @Test
        public void test_OnlyNonLetterCharacters(){
            assertEquals("1234#$&8", WordsReverseUtils.reverseSentence("1234#$&8"));
        }
        @Test
        public void test_EmptyString(){
            assertEquals("", WordsReverseUtils.reverseSentence(""));
        }
        @Test
        public void test_MultipleConsecutiveSpacesInsteadString(){
            assertEquals("", WordsReverseUtils.reverseSentence("           "));
        }
        @Test
        public void test_MultipleConsecutivePunctuationInsteadString(){
            assertEquals("", WordsReverseUtils.reverseSentence(",,,,,,,,,"));
        }
        @Test
        public void test_TwoWordsAndBigSpaceBetween(){
            assertEquals("god esahp", WordsReverseUtils.reverseSentence("dog             phase"));
        }
        @Test
        public void test_WordsSeperatedWithDifferentPunctuations(){
            assertEquals("taehrevo vreser3 gnidliub 3noitid",
                    WordsReverseUtils.reverseSentence("overheat,reserv3...building---3dition"));
        }
        @Test
        public void test_nullPassing(){
            NullPointerException exception = assertThrows(NullPointerException.class, () ->
            {WordsReverseUtils.reverseSentence(null);
            });
            assertEquals("null is not allowed", exception.getMessage());
        }
}
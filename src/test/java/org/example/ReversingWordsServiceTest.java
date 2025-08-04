package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversingWordsServiceTest {

    @Test
    public void firstTest(){
        ReversingWordsService RWS = new ReversingWordsService();
        String result = RWS.reverseWords("pha$e");
        assertEquals("eah$p", result);
    }

    @Test
    public void secondTest(){
        ReversingWordsService RWS = new ReversingWordsService();
        String result = RWS.reverseWords("pha$e si1ent");
        assertEquals("eah$p tn1eis", result);
    }

    @Test
    public void thirdTest(){
        ReversingWordsService RWS = new ReversingWordsService();
        String result = RWS.reverseWords("aaaaa111111zzzzz22222");
        assertEquals("zzzzz111111aaaaa22222", result);
    }

    @Test
    public void forthTest(){
        ReversingWordsService RWS = new ReversingWordsService();
        String result = RWS.reverseWords("Phi1osophy");
        assertEquals("yhp1osoihP", result);
    }

}
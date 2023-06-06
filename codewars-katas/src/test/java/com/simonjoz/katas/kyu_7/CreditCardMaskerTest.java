package com.simonjoz.katas.kyu_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardMaskerTest {

    @Test
    public void testSolution() {
        assertEquals("############5616", CreditCardMasker.mask("4556364607935616"));
        assertEquals("#######5616",      CreditCardMasker.mask(     "64607935616"));
        assertEquals("1",                CreditCardMasker.mask(               "1"));
        assertEquals("",                 CreditCardMasker.mask(                ""));

        // "What was the name of your first pet?"
        assertEquals("##ippy",                                    CreditCardMasker.mask("Skippy")                                  );
        assertEquals("####################################man!",  CreditCardMasker.mask("Nananananananananananananananana Batman!"));
    }

}

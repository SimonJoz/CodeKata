package com.simonjoz.katas.kyu_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CamelCaseBreakerTest {

    private static String camelCaseSol(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }

    private static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private static int randInt(int num) {
        return (int) (Math.random() * num);
    }

    @Test
    public void tests() {
        assertEquals("camel Casing", CamelCaseBreaker.breakCamelCase("camelCasing"));
        assertEquals("camel Casing Test", CamelCaseBreaker.breakCamelCase("camelCasingTest"));
        assertEquals("camelcasingtest", CamelCaseBreaker.breakCamelCase("camelcasingtest"));
    }

    private static final String[] words = new String[]{
            "nouns", "time", "person", "year", "way", "day", "thing", "man", "world", "life", "hand", "part",
            "child", "eye", "woman", "place", "work", "week", "case", "point", "government", "company", "number", "group",
            "problem", "fact", "verbs", "be", "have", "do", "say", "get", "make", "go", "know", "take", "see", "come",
            "think", "look", "want", "give", "use", "find", "tell", "ask", "work", "seem", "feel", "try", "leave", "call",
            "adjectives", "good", "new", "first", "last", "long", "great", "little", "own", "other", "old", "right", "big", "high",
            "different", "small", "large", "next", "early", "young", "important", "few", "public", "bad", "same", "able"
    };

    @Test
    public void randomTests() {

        for (int testIter = 0; testIter < 50; testIter++) {
            int wordLength = randInt(10);

            StringBuilder wordString = new StringBuilder();

            for (int i = 0; i < wordLength; i++) {
                String word = words[randInt(words.length)];
                wordString.append(i != 0 ? capitalize(word) : word);
            }

            assertEquals(camelCaseSol(wordString.toString()), CamelCaseBreaker.breakCamelCase(wordString.toString()));
        }
    }
}

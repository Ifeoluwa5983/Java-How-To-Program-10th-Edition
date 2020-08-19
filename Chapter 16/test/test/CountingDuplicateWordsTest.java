package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Exercise1613.CountingDuplicateWords;
import Exercise1613.DuplicateWordException;

class CountingDuplicateWordsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
    void testCode() {
        CountingDuplicateWords duplicate = new CountingDuplicateWords();
        try {
            Map<String, Integer> result = duplicate.countDuplicate("Hello how are you doing");
        } catch (DuplicateWordException e) {
            System.err.println(e.getMessage());
        }

        assertEquals(1, duplicate.countWord("Hello"));
        assertEquals(0, duplicate.countWord("WorlD"));
    }

}

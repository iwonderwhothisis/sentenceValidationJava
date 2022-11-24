package Validate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidSentenceTest {

	@BeforeEach
	void setUp() throws Exception{	
	}
	ValidSentence validator = new ValidSentence();
	
	
	@Test
	void testSentenceCheckValid() {
		String sentence = "The quick brown fox said “hello Mr lazy dog”.";
		boolean expected = true;
		boolean actual = validator.sentenceCheck(sentence);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSentenceCheckInvalid() {
		String sentence = "The quick brown fox said \"hello Mr. lazy dog\".";
		boolean expected = false;
		boolean actual = validator.sentenceCheck(sentence);
		assertEquals(expected, actual);
		
	}

	@Test
	void testCapitalLetterValid() {
		String sentence = "The quick brown fox said hello Mr lazy dog.";
		boolean expected = true;
		boolean actual = validator.capitalLetter(sentence);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCapitalLetterInvalid() {
		String sentence = "the quick brown fox said hello Mr lazy dog.";
		boolean expected = false;
		boolean actual = validator.capitalLetter(sentence);
		assertEquals(expected, actual);
	}
	
	

	@Test
	void testEndCharValid() {
		String sentence = "One lazy dog is too few, 13 is too many.";
		boolean expected = true;
		boolean actual = validator.endChar(sentence);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEndCharInvalid() {
		String sentence = "There is no punctuation in this sentence";
		boolean expected = false;
		boolean actual = validator.endChar(sentence);
		assertEquals(expected, actual);
	}

	@Test
	void testNoPeriodsValid() {
		String sentence = "How many lazy dogs are there?";
		boolean expected = true;
		boolean actual = validator.noPeriods(sentence);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNoPeriodsInvalid() {
		String sentence = "How many lazy. dogs are there?";
		boolean expected = false;
		boolean actual = validator.noPeriods(sentence);
		assertEquals(expected, actual);
	}

	@Test
	void testNumbersSpelledValid() {
		String sentence = "One lazy dog is too few, 13 is too many.";
		boolean expected = true;
		boolean actual = validator.numbersSpelled(sentence);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNumbersSpelledInvalid() {
		String sentence = "Are there 11, 12, or 13 lazy dogs?";
		boolean expected = false;
		boolean actual = validator.numbersSpelled(sentence);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenQuotesValid() {
		String sentence = "The quick brown fox said \"hello Mr. lazy dog\".";
		boolean expected = true;
		boolean actual = validator.evenQuotes(sentence);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenQuotesInalid() {
		String sentence = "The quick brown\" fox said \"hello Mr. lazy dog\".";
		boolean expected = false;
		boolean actual = validator.evenQuotes(sentence);
		assertEquals(expected, actual);
	}

}

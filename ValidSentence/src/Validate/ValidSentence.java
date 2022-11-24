package Validate;

public class ValidSentence {

	//if all validation returns true, sentence is valid, returns true
	//if any validation returns false, returns false
	
	/**
	 * Checks if all validation returns true, 
	 * if so the sentence is valid.
	 * 
	 * @param sentence
	 * @return true if sentence is valid, false if invalid
	 */
	public boolean sentenceCheck(String sentence) {
	
		if(capitalLetter(sentence) && evenQuotes(sentence) && endChar(sentence) 
				&& noPeriods(sentence) && numbersSpelled(sentence)) {
			return true;
		}else {
			return false;
		}
	}

	
	/**
	 * Checks if string starts with a capital letter
	 * 
	 * @param sentence
	 * @return true if sentence starts with a capital, false if not
	 */
	public boolean capitalLetter(String sentence) {
		
		char firstLetter = sentence.charAt(0);

		if (firstLetter >= 'A' && firstLetter <= 'Z') {
			return true;
		} else {
			return false;
		}
	}

	
	/**
	 * Checks if string contains an equal number of quotes
	 * 
	 * @param sentence
	 * @return true if sentence contains an equal number of quotes, false if not
	 */
	public boolean evenQuotes(String sentence) {
		
		int quoteCount = 0;
		//loops through sentence and counts number of "
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == '"') {
				quoteCount++;
			}
		}
		//if quoteCount is even returns true
		if (quoteCount % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	
	/**
	 * Checks if the string ends with a period character 
	 * 
	 * @param sentence
	 * @return true if sentence ends with period character, false if not
	 */
	public boolean endChar(String sentence) {
	
		//stores last character
		char endChar = sentence.charAt(sentence.length() -1);

		if (endChar == '.' || endChar == '?' || endChar == '!') {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Checks if string has no periods within it, other than at the end
	 * 
	 * @param sentence
	 * @return true if no periods found within the string, other than at the end, false if found
	 */
	public boolean noPeriods(String sentence) {
	
		//loops through each character apart from the final one
		for (int i = 0; i < sentence.length() - 1; i++) {
			char currentChar = sentence.charAt(i);
			if (currentChar == '.' || currentChar == '?' || currentChar == '!') {
				return false;
			}
		}
		return true; //returns true if none are found.
	}

	/**
	 * Checks to see if there are no numbers under 13 
	 * 
	 * @param sentence
	 * @return true if no numbers <13 are found, false if they are found
	 */
	public boolean numbersSpelled(String sentence) {	
		//splits string into words
		 String[] words = sentence.split(" ");
		 //loops through each word
		    for (String word : words) {
		    	//if word contains digits
		        if (word.matches(".*\\d.*")) {
		        	//converts string word to int number
		            int number = Integer.parseInt(word.replaceAll("[^0-9]", ""));
		            //returns false if number found is under 13
		            if (number < 13) {
		                return false;
		            }
		        }
		    }
		    return true;
	}


}

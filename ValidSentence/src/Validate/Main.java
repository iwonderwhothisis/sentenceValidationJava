package Validate;
import Validate.ValidSentence;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//collects user input 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a sentence to be validated:  ");
		String sentence = scanner.nextLine();
		
		//creates an instance of ValidSentence 
		ValidSentence validator = new ValidSentence();
		
		if(validator.sentenceCheck(sentence)) {
			System.out.println("Sentence is valid");
		}else {
			System.out.println("Sentence is invalid");
		}
	}

}

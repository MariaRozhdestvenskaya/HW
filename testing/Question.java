package testing;

import java.util.Scanner;

public class Question {
	private String question;
	private String[] variants;
	private int correctAnswer;
	
	
	public Question (String question, String[] variants, int correctAnswer) {
		this.question = question;
		this.variants = variants;
		this.correctAnswer = correctAnswer;
	}
	
	public boolean isAnswerTheQuestionCorrect (Scanner scan) {
		int studentAns = 0;
		System.out.println(question);
		for (int i = 0; i < variants.length; i++) {
			int count = i+1;
			System.out.print(count + ". ");
			System.out.println(variants[i]);
		}
			while (!scan.hasNextInt()) {
				System.out.println("Please enter the number of the correct answer.");
				scan.next();
			}
			do {
				 studentAns = scan.nextInt();
			} while (studentAns < 1 | studentAns > variants.length);
		

			if (studentAns == correctAnswer) {
				return true;} else { return false;
		}
	}

}

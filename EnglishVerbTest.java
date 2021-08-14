package HW;

import java.util.Scanner;

public class EnglishVerbTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		String[] question = new String[3];
		question[0] = "Everyone could see by the grimace on his face that he didn't ___ the meal in front of him.";
		question[1] = "Lawrence is trying to ___ on fatty foods.";
		question[2] = "Jeff felt as if he had been ___ when he lost his job.";
		String[][] variantAns = new String[][] { { "care on", "care for", "care of" }, 
											 { "cut down", "cut up", "cut about" },
											 { "let on", "let down", "let over" } };
		int[] correctAnswer  = {2, 1, 2};
		int[] studentAnswer = new int[question.length];
		
		System.out.println("Тест на знание фразовых глаголов английского языка.");
		System.out.println("В каждом вопросе выберите правильный вариант ответа и напишите его номер.");
		for (int a = 0; a < variantAns.length; a++) {
			do {
				System.out.println(question[a]);
			for (int b = 0; b < variantAns[a].length; b++) {
				int count = b + 1;
				System.out.print(count + ". ");
				System.out.println(variantAns[a][b]);				
			}
			studentAnswer[a] = scan.nextInt();
			} while (studentAnswer[a] < 1 | studentAnswer[a] > variantAns[a].length);
						
		}
		for (int i = 0; i < question.length; i++) {
			if (studentAnswer[i] == correctAnswer[i]) {
				result += 1;
			}
		}
		
		if (result == 1) {
			System.out.println("Вы дали " + result + " правильный ответ из 3.");
		} else {
			System.out.println("Вы дали " + result + " правильных ответа из 3.");
		}
		
		for (int i = 0; i < question.length; i++) {
				int count = studentAnswer[i] - 1;
				System.out.println(question[i]);
				if (studentAnswer[i] == correctAnswer[i]) {
					System.out.print("Ваш ответ - " + variantAns[i][count]);
					System.out.println(" - Верно.");
				} else {		
					System.out.print("Ваш ответ - " + variantAns[i][count]);
					System.out.println(" - Неверно.");
					System.out.println("Правильный ответ - " + variantAns[i][correctAnswer[i]]);
				}			
								
		}
		scan.close();
	}

}

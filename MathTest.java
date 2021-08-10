import java.util.Scanner;

public class MathTest {
	Scanner scan = new Scanner(System.in);
	private String welcomeMsg = "Тестовое задание по математике. "
			+ "\nПожалуйста введите номер правильного ответа.";
	
	private String[] questions = {  "3 + 5 =",
									"8 - 2 =",
									"12 / 3 =",
									"3 * 3 =" };
	private int[][] variantAns = {  {4, 7, 8, 5},
									{6, 0, 3},
									{1, 7, 4, 2},
									{11, 6, 2, 9} };
	private int[] correctAns = { 3, 1, 3, 4 };
	private int[] studentAns = new int[correctAns.length];
	private int result = 0; 
		
	
	public void showWelcomeMsg() {
		System.out.println(welcomeMsg);
	}
	public int getQuestionsQuantity() {
		return questions.length;
	}
	public void showQuestions (int a) {
		System.out.println(questions[a]);
		for (int i = 0; i < variantAns[a].length; i++) {
			int count = i + 1;
			System.out.print(count + ". ");
			System.out.println(variantAns[a][i]);
		}
	}
	public void takeStudentAns(int a) {
		
		scan.reset();
		while (!scan.hasNextInt()) {
			System.out.println("Введите номер правильного ответа.");
			scan.next();
		}
		do {
			studentAns[a] = scan.nextInt();
		} while (studentAns[a] < 1 | studentAns[a] > variantAns[a].length);

	
	}
	public void calculateResult() {
		for (int i = 0; i < correctAns.length; i++) {
		if (studentAns[i] == correctAns[i]) result += 1;}
	}
	public void showResult() {
		System.out.println("Правильных ответов: " + result + " из " + correctAns.length);
	}
	public void showResultDetails() {
		for (int i = 0; i < questions.length; i++) {
			int count = studentAns[i] - 1;
			System.out.println(questions[i]);
			System.out.print("Ваш ответ: " + variantAns[i][count]);
			if (studentAns[i] == correctAns[i]) {
				System.out.println(" - Верно");
			} else {
				System.out.println(" - Неверно");
				System.out.println("Правильный ответ: " + variantAns[i][(correctAns[i]-1)]);
			}
		}
		
	}
	

}

package HW.testing;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMaterials {
	Scanner scaner = new Scanner(System.in);
	ArrayList<Question> questions = new ArrayList<Question>();
	{
		questions.add(new Question("3 + 8 = ", new String[] {"10", "11", "15", "12"}, 2));
		questions.add(new Question("16 / 2 = ", new String[] {"8", "4", "7"}, 1));
		questions.add(new Question("2 * 3 = ", new String[] {"5", "8", "6","4"}, 3));
	}
	
	
	void testing () {
		int result = 0;
		String name = scaner.nextLine();		
		for (int i = 0; i < questions.size(); i++) {
			if (questions.get(i).isAnswerTheQuestionCorrect(scaner)) 
				result+=1;
		}
		String resultOfTotal = result + " of " + questions.size();
		System.out.println(name + ", you gave " + resultOfTotal + " correct answers.");
	}

}

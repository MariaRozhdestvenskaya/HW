
public class MathTestDemo {

	public static void main(String[] args) {
		MathTest test = new MathTest();
		test.showWelcomeMsg();
		for (int i = 0; i < test.getQuestionsQuantity(); i++) {
			test.showQuestions(i);
			test.takeStudentAns(i);
		}
		test.calculateResult();
		test.showResult();
		test.showResultDetails();

	}

}

import java.util.Random;
import java.util.*;

public class Bartender extends Person{
	private String q1 = "Can I get your number?";
	private String q2 = "Did it hurt? When you fell from heaven?";
	private String q3 = "Do you want to go on a date?";
	private String ans1 = "Yeah I live in my parents house but I pay rent.";
	private String ans2 = "No I don't have a criminal record, but the money here is good.";
	private String ans3 = "Hold on my ex is calling.";
	
	//private String[] questions = new String[3] {q1,q2,q3};
	private String[] questions = {q1, q2, q3};
	private String[] answers = {ans1, ans2, ans3};
	
	//TODO make it a truly random number generator for pizzaz
	Random random = new Random();
	
//	long seed = 95;
//	random.setSeed(seed);
	@Override
	void askQuestion() {
		// TODO Auto-generated method stub
		int x = random.nextInt() % 3;
		if(x == 0) {
			System.out.println(questions[0]);
		}
		else if(x == 1) {
			System.out.println(questions[1]);
		}
		else {
			System.out.println(questions[2]);
		}
	}

	@Override
	void answerQuestion() {
		// TODO Auto-generated method stub
		int x = random.nextInt() % 3;
		if(x == 0) {
			System.out.println(answers[0]);
		}
		else if(x == 1) {
			System.out.println(answers[1]);
		}
		else {
			System.out.println(answers[2]);
		}
		
	}
	
}

import java.util.Random;
import java.util.*;

public class Bartender extends Person{
	private String favDrink;
	public Bartender(String name, String occ, String favoriteDrink) {
		super(name, occ);
		favDrink = favoriteDrink;
		// TODO Auto-generated constructor stub
	}
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
	int randy = (int) Math.random();
	Random random = new Random(randy);

	//Ask a question with a randomly generated question pulled from an question bank
	@Override
	void askQuestion() {
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
	//answer a question with a randomly generated answer pulled from an answer bank
	@Override
	void answerQuestion() {
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

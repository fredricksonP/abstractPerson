import java.util.Random;
import java.util.*;

public class Clown extends Person{
	private String q1 = "Do you want me to blow you a balloon?";
	private String q2 = "Wanna squeak my clown nose? ;)";
	private String q3 = "Are you down to clown?";
	private String ans1 = "I love playing with kids.";
	private String ans2 = "Yes I graduated from clown college with an accredited degree.";
	private String ans3 = "I got kicked out of the circus so I changed my clown name to honky.";
	private int ansCounter = 0;
	private int qCounter = 0;
	//private String[] questions = new String[3] {q1,q2,q3};
	private String[] questions = {q1, q2, q3};
	private String[] answers = {ans1, ans2, ans3};
	//	long seed = 95;
	//	random.setSeed(seed);
	@Override
	void askQuestion() {
		if(qCounter > 2) {
			qCounter = 0;
		}
		System.out.println(questions[qCounter]);
		qCounter++;
	}

	@Override
	void answerQuestion() {
		// TODO Auto-generated method stub
		if(ansCounter > 2) {
			ansCounter = 0;
		}
		System.out.println(answers[ansCounter]);
		ansCounter++;
	}

}

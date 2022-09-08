import java.util.Random;
import java.util.*;

public class Clown extends Person{
	private String age;
	public Clown(String name, String occ, String age) {
		super(name, occ);
		age = age;
		// TODO Auto-generated constructor stub
	}
	private String q1 = "Do you want me to blow you a balloon?";
	private String q2 = "Wanna squeak my clown nose? ;)";
	private String q3 = "Are you down to clown?";
	private String ans1 = "I love playing with kids.";
	private String ans2 = "Yes I graduated from clown college with an accredited degree.";
	private String ans3 = "I got kicked out of the circus so I changed my clown name to honky.";
	private int ansCounter = 0;
	private int qCounter = 0;
	private String[] questions = {q1, q2, q3};
	private String[] answers = {ans1, ans2, ans3};
	
	//asks one of the three stored questions
	@Override
	void askQuestion() {
		if(qCounter > 2) {
			qCounter = 0;
		}
		System.out.println(questions[qCounter]);
		qCounter++;
	}
	//Answers the a questions with one of the three stored answers
	@Override
	void answerQuestion() {
		if(ansCounter > 2) {
			ansCounter = 0;
		}
		System.out.println(answers[ansCounter]);
		ansCounter++;
	}
}

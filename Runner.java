
public class Runner extends Person {
	
public Runner(String name, String occ) {
		super(name, occ);
		// TODO Auto-generated constructor stub
	}

//	public Runner() {
//		super();
//		// TODO Auto-generated constructor stub
//		occupation = "Runner";
//	}
	

	@Override
	void askQuestion() {
		// TODO Auto-generated method stub
		System.out.println("Do you even run bro?");
	}

	@Override
	void answerQuestion() {
		// TODO Auto-generated method stub
		System.out.println("I ran a full marathon before sun up today!");
	}
	@Override
	void whatIDo() {
		System.out.println("I am a " + occupation);
		System.out.println("I love myself a good run");
	}
	
}

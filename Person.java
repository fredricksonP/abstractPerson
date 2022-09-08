
abstract class Person {
	protected String myName;
	protected String occupation;
		
	public Person(String name, String occ) {
		myName = name;
		occupation = occ;
	}
	
	public void askName() {
		System.out.println("what is your name? ");
	}
	//print our persons name
	public void giveName() {
		System.out.println("My name is " + myName);
	}
	//print out person occupation
	void whatIDo() {
		System.out.println("I am a " + occupation);
	}
	
	abstract void askQuestion();
	abstract void answerQuestion();
}

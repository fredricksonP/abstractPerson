
abstract class Person {
	private String myName;
	private String occupation;
	
	public void askName() {
		System.out.println("what is your name? ");
	}
	//print our persons name
	public void giveName() {
		System.out.println("My name is " + myName);
	}
	//print out person occupation
	public void whatIDo() {
		System.out.println("I am a " + occupation);
	}
	abstract void askQuestion();
	abstract void answerQuestion();
}

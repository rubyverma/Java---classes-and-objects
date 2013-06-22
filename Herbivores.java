// child class herbivores inherited from animal
public class Herbivores extends Animal {

	@Override
	public void see() {
		System.out.println("Herbivorus animals can see.");
	}

	public void eat() {
		System.out.println("Herbivorus animals eat grass.");
	}

}

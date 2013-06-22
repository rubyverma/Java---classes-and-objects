// child class carnivorus inherited from parent animal
public class Carnivores extends Animal {

	@Override
	public void see() {
		System.out.println("Carnivorus animals can see.");
	}

	public void eat() {
		System.out.println("Carnivorus animals eat flesh.");
	}
}

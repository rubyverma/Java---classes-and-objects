public class Program4 {
	/*
	 * 4. Create a class animal and extend it to different kind of animals
	 * herbivorus, carnivorus etc.
	 */
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.see();
		System.out.println();

		Herbivores herb1 = new Herbivores();
		herb1.see();
		herb1.eat();
		System.out.println();

		Carnivores carn1 = new Carnivores();
		carn1.see();
		carn1.eat();

	}

}

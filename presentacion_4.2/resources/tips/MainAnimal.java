class MainAnimal {
	public static void main(String [] args) {
		Animal [] a = {new Animal(), new Dog(), new Animal() };
		for(Animal animal : a) {
			animal.makeNoise();
			if(animal instanceof Dog) {
				//animal.playDead(); // ¿que pasa si descomento esto?
				Dog d = (Dog) animal;
				d.playDead();
			}
		}
	}
}

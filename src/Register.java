
/* Julia Imner, juim3678, gr 287*/
import java.util.ArrayList;

public class Register {

	private ArrayList<Dog> dogArrayList;

	public Register() {
		dogArrayList = new ArrayList<Dog>();
	}

	public void loadInitialDogsIntoRegister() {
		Dog dog1 = new Dog("Peanut", "Bulldog", 4, 12);
		Dog dog2 = new Dog("Roxy", "Pug", 8, 5);
		Dog dog3 = new Dog("Sunny", "Poodle", 2, 20);
		Dog dog4 = new Dog("Fernardo", "Labrador", 10, 18);
		Dog dog5 = new Dog("Voldemort", "Tax", 5, 7);

		dogArrayList = new ArrayList<Dog>();
		dogArrayList.add(dog1);
		dogArrayList.add(dog2);
		dogArrayList.add(dog3);
		dogArrayList.add(dog4);
		dogArrayList.add(dog5);

	}

	public void addDog(Dog newDog) {
		dogArrayList.add(newDog);

	}

	public void increaseAgeOfDog(String name, int increaseAgeWith) {

		System.out.println("Find dog with name: " + name + " and increase age with " + increaseAgeWith);

		for (int i = 0; i < dogArrayList.size(); i++) {
			Dog agingDog = dogArrayList.get(i);
			if (agingDog.getName().equalsIgnoreCase(name)) {
				System.out.println("The dog is found");
				agingDog.increaseAgeOfDog(increaseAgeWith);
				return;

			}

		}
		System.out.println("error! The dog with the specified name is not found in the register");
	}

	public void removeDogFromRegister(String name) {
		// System.out.println("Removing dog with name " + name + " from register");

		for (int i = 0; i < dogArrayList.size(); i++) {
			Dog dogToRemove = dogArrayList.get(i);
			if (dogToRemove.getName().equalsIgnoreCase(name)) {
				System.out.println("The dog with the specicfied name is removed");
				dogArrayList.remove(i);
				return;
			}

		}
		System.out.println("error! the dog is not found");
	}

	public void printRegister(int tailLength) {

		System.out.println("Find dog with tail lenght greater than: " + tailLength);

		for (int i = 0; i < dogArrayList.size(); i++) {
			Dog myDog = dogArrayList.get(i);
			if (myDog.getTailLength() > tailLength) {
				System.out.println(myDog);
			}

		}
	}
}

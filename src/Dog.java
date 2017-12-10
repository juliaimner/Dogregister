/* Julia Imner, juim3678, gr 287*/

public class Dog {

	private String name;
	private String breed;
	private int age;
	private double weight;

	public Dog(String newName, String newBreed, int newAge, double newWeight) {
		name = newName;
		breed = newBreed;
		age = newAge;
		weight = newWeight;
	}

	public String getName() {
		return name;
	}

	public double getTailLength() {
		double length;
		if (breed.equalsIgnoreCase("Tax") || breed.equalsIgnoreCase("dachshund")) {
			length = 3.7;
		} else {
			length = ((age * weight) / 10);
		}
		return length;

	}

	public int getAge() {
		return age;

	}

	public double getWeight() {
		return weight;
	}

	public String getBreed() {
		return breed;

	}

	public void increaseAgeOfDog(int numberOfYears) {
		age = age + numberOfYears;
	}

	//
	public String toString() {
		return "Name: " + name + ", Breed: " + breed + ", Age:" + age + ", Weight: " + weight + ", Tail Length: "
				+ getTailLength();
	}
}

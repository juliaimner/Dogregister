
/* Julia Imner, juim3678, gr 287*/
import java.util.Scanner;

public class MainProgram {

	private Register register;
	private Scanner scan;

	public static void main(String[] args) {

		MainProgram mainProgram = new MainProgram();
		mainProgram.startMainProgram();

	}

	public MainProgram() {
		scan = new Scanner(System.in);
		register = new Register();
		register.loadInitialDogsIntoRegister();

	}

	public void startMainProgram() {

		System.out.print(
				"\n1. register new dog \n2. increase age  \n3. list dogs \n4. remove dog \n5. exit \nEnter the activity you want to do: ");
		String choice = scan.nextLine();

		switch (choice) {
		case "register new dog":
			readDogInformationAndAddToRegister();
			break;
		case "increase age": // increase age
			increaseAgeOfDog();
			break;

		case "list dogs":
			printRegister();

			break;

		case "remove dog":
			removeDogFromRegister();

			break;

		case "exit": // avsluta programmet
			System.exit(1);
			break;
		default:

			System.out.println("error! You have not entered a valid choice");
			break;

		}
		this.startMainProgram();
	}

	public void printRegister() {
		System.out.print("Enter a tail length: ");
		String tailLengthAsString = "" + scan.nextLine();
		int tailLenghtAsInt = Integer.valueOf(tailLengthAsString);

		register.printRegister(tailLenghtAsInt);
		
	}

	public void increaseAgeOfDog() {
		System.out.print("Enter a name of the dog to increase age: ");
		String name = scan.nextLine();

		register.increaseAgeOfDog(name, 1);
	}

	public void removeDogFromRegister() {
		System.out.print("Enter a dog name to remove: ");
		String name = scan.nextLine();

		register.removeDogFromRegister(name);
	}

	public void readDogInformationAndAddToRegister() {
		System.out.print("Enter a name: ");
		String name = scan.nextLine();

		System.out.print("Enter a breed: ");
		String breed = scan.nextLine();

		System.out.print("Enter age: ");
		String ageAsString = scan.nextLine();
		int age = Integer.valueOf(ageAsString);

		System.out.print("Enter weight: ");
		String weightAsString = scan.nextLine();
		float weight = Float.valueOf(weightAsString);

		Dog newDog = new Dog(name, breed, age, weight);

		register.addDog(newDog);

		System.out.print("The dog is registered");
		
	}

}

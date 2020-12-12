package _01_intro_to_static;

import java.util.Random;

public class Athlete {

	//static Random rn = new Random();
	//int answer = rn.nextInt(10) + 1;
	
	static Random nextBibNumber0 = new Random();
	int nextBibNumber = nextBibNumber0.nextInt(500) + 1;
	static String raceLocation = "New York";
	static String raceStartTime = "9.00am";
	
	String name;
	int speed;
	int bibNumber;

	Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	public static void main(String[] args) {
		// create two athletes
		// print their names, bibNumbers, and the location of their race.
		
		
		Athlete John = new Athlete("John", 10);
		Athlete Ray = new Athlete("Ray", 10);
		
		System.out.println(John.name);
		System.out.println(John.nextBibNumber);
		System.out.println(John.raceLocation);
		
		System.out.println("");
		
		System.out.println(Ray.name);
		System.out.println(Ray.nextBibNumber);
		System.out.println(Ray.raceLocation);
	
		
	}

}

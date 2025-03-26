package suncoastChapter4;

import java.util.Random;

public class Die {
	private final int MIN_FACES = 4;
	private static Random generator = new Random();
	private int numFaces; // number of sides on the die
	private int faceValue; // current face value showing
	
	// no-arg constructor
	public Die() {
		numFaces = 6;
	}
	
	public Die(int faces) {
	
		if (faces < MIN_FACES) {
			numFaces = 6;
		} else {
			numFaces = faces;
		}
		faceValue = roll();
	}
	
	public int roll() {
		faceValue = generator.nextInt(numFaces) + 1;
		return faceValue;
	}

}

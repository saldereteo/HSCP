package suncoastChapter4;

// represents a Coin with 2 sides that can be flipped
public class Coin {
	private final int HEADS = 0;
	private final int TAILS = 1;
	private int face;
	
	// Constructor
	public Coin() {
		flip();
	}
	
	// Flips the coin by randomly choosing a value  using Math.random()
	// becomes either 0 or 1 when converting to an int
	public void flip() {
		face = (int) (Math.random() * 2);
	}
	
	// Returns true if heads, false if tails
	public boolean isHeads() {
		return(face == HEADS);
	}
	
	public String toString() {
		if (isHeads()) {
			return "Heads";
		} else {
			return "Tails";
		}
	}
}

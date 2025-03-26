package suncoastChapter4;
// this class's sole purpose is to demonstrate the use of the Coin class
// By counting the number of heads and tails flipped
public class CountFlips {
	
	public static void main(String[] args) {
		final int NUM_FLIPS = 1000;
		int heads = 0;
		int tails = 0;
		
		// Create an instance of the Coin class
		Coin myCoin = new Coin();
		for(int i = 0; i < NUM_FLIPS; i++) {
			myCoin.flip();
			if (myCoin.isHeads()) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("The number of coin flips = " + NUM_FLIPS);
		System.out.println("Number of heads = " + heads);
		System.out.println("Number of talis = " + tails);;
	}

}

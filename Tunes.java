package suncoastChapter6Textbook;

//Listing 6.7

public class Tunes {

	public static void main(String[] args) {
		
		CDCollection music = new CDCollection();
		music.addCD("By the way",  "Red Hot Chili Peppers",  14.95,  10);
		music.addCD("Soundtrack",  "The Producers",  17.95,  33);
		
		System.out.println(music);
	}
}

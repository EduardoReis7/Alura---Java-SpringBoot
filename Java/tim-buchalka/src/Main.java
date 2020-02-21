 
public class Main {
	
	public static void main(String[] args) {
		
		displayHighScorePosition("Eduardo", calculateHighScorePosition(1500));
		
		displayHighScorePosition("Vivian", calculateHighScorePosition(900));
		
		displayHighScorePosition("Felipe" , calculateHighScorePosition(400));
		
		displayHighScorePosition("Karen" , calculateHighScorePosition(50));
	}
		

	public static void displayHighScorePosition(String name, int scorePosition) {
		System.out.println(name + " managed to get into position " + scorePosition + " on the high score table");
	}
	
	public static int calculateHighScorePosition(int score) {
		
		if ( score >= 1000) {
			return 1;
		} else if ( score >= 500 && score <= 1000 ) {
			return 2;
		} else if ( score >= 100 && score <= 500 ) {
			return 3;
		} else {
			return 4;
		}
	}
}
  
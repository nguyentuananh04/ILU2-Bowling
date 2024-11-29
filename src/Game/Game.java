package Game;

public class Game {
	private int rolls[] = new int[20];
	private int currentRoll = 0;
	private int score = 0;
	
	void roll(int nbQuilles) {
		rolls[currentRoll] = nbQuilles;
		currentRoll++;
	}
	
	int score() {
		for (int i = 0; i < rolls.length; i++) {
			score += rolls[i];
		}
		return score;
	}
}

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
			if(i % 2 == 1) { // les rolls de numéro pair
				if((rolls[i] + rolls[i - 1]) == 10) {
					score += rolls[i + 1];
				}
				score += rolls[i];
			}
			else {
				score += rolls[i];
			}
		}
		return score;
	}
}

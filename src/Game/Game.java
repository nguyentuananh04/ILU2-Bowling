package Game;

public class Game {
	private int rolls[] = new int[21];
	private int currentRoll = 0;
	private int score = 0;
	
	void roll(int nbQuilles) {
		rolls[currentRoll] = nbQuilles;		
		if (currentRoll % 2 == 0 && nbQuilles == 10) {
			rolls[++currentRoll] = 0;
		}
		currentRoll += 1;
	}
	
	int score() {
		int rollIndex = 0;
		for (int i = 0; i < 10; i++) {
			if(rolls[rollIndex] == 10) {
				score += 10 + rolls[rollIndex + 2] + rolls[rollIndex + 3];
			}
			
			else if(rolls[rollIndex] + rolls[rollIndex + 1] == 10) {
				score += 10 + rolls[rollIndex + 2];
			}
			else {
				score += rolls[rollIndex] + rolls[rollIndex + 1];
			}
			rollIndex += 2;
		}
		return score;
	}
}

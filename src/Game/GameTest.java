package Game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class GameTest {
	Game game;
	int score;
	@BeforeEach
	void initGame() {
		game = new Game();
		score = 0;
	}
	
	@Test
	void rollVide() {
		assertEquals(game.score(), 0);
		System.out.println("Entrée : vide\nScore attendu: 0\n");
	}

}

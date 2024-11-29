package Game;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

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
	
	@Test
	void roll20fois0() {
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		assertEquals(game.score(), 0);
		System.out.println("Entrée : On roll 20 fois 0\nScore attendu: 0\n");
	}
}

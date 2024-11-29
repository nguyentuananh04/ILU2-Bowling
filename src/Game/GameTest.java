package Game;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class GameTest {
	Game game;
	@BeforeEach
	void initGame() {
		game = new Game();
	}
	
	@Test
	void testLevel1Cas1() {
		assertEquals(game.score(), 0);
		System.out.println("Entrée : vide\nScore attendu: 0\n");
	}
	
	@Test
	void testLevel1Cas2() {
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		assertEquals(game.score(), 0);
		System.out.println("Entrée : On roll 20 fois 0\nScore attendu: 0\n");
	}
	
	@Test
	void testLevel1Cas3() {
		for (int i = 0; i < 20; i++) {
			game.roll(1);
		}
		assertEquals(game.score(), 20);
		System.out.println("Entrée : On roll 20 fois 1\nScore attendu: 20\n");
	}
}

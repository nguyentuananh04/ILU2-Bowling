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
	
	@Test
	void testLevel1Cas4() {
		for (int i = 0; i < 10; i++) {
			game.roll(1);
		}
		for (int i = 0; i < 10; i++) {
			game.roll(2);
		}
		assertEquals(game.score(), 30);
		System.out.println("Entrée : On roll 20 fois 1 et 10 fois 2\nScore attendu: 30\n");
	}
	
	@Test
	void testLevel2() {
		game.roll(7);
		game.roll(3);
		game.roll(4);
		for (int i = 0; i < 17; i++) {
			game.roll(0);
		}
		assertEquals(game.score(), 18);
		System.out.println("Entrée : On roll 7, 3 puis 4 et 17 fois 0\nScore attendu: 18\n");
	}
}

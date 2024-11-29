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
		System.out.println("Entrée : vide\nScore attendu: 0\n" + "Score obtenu : " + game.score() + "\n");
	}
	
	@Test
	void testLevel1Cas2() {
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		assertEquals(game.score(), 0);
		System.out.println("Entrée : On roll 20 fois 0\nScore attendu: 0\n" + "Score obtenu : " + game.score() + "\n");
	}
	
	@Test
	void testLevel1Cas3() {
		for (int i = 0; i < 20; i++) {
			game.roll(1);
		}
		int score = game.score();
		assertEquals(score, 20);
		System.out.println("Entrée : On roll 20 fois 1\nScore attendu: 20\n" + "Score obtenu : " + score + "\n");
	}
	
	@Test
	void testLevel1Cas4() {
		for (int i = 0; i < 10; i++) {
			game.roll(1);
		}
		for (int i = 0; i < 10; i++) {
			game.roll(2);
		}
		int score = game.score();
		System.out.println("Entrée : On roll 20 fois 1 et 10 fois 2\nScore attendu: 30\n" + "Score obtenu : " + score + "\n");
		assertEquals(score, 30);
	}
	
	@Test
	void testLevel2() {
		game.roll(7);
		game.roll(3);
		game.roll(4);
		for (int i = 0; i < 17; i++) {
			game.roll(0);
		}
		int score = game.score();
		System.out.println("Entrée : On roll 7, 3 puis 4 et 17 fois 0\nScore attendu: 18\n" + "Score obtenu : " + score + "\n");
		assertEquals(score, 18);
	}
	
	@Test
	void testLevel3() {
		game.roll(10);
		game.roll(3);
		game.roll(4);
		for (int i = 0; i < 16; i++) {
			game.roll(0);
		}
		int score = game.score();
		System.out.println("Entrée : On roll 10, 3 puis 4 et 16 fois 0\nScore attendu: 24\n" + "Score obtenu : " + score + "\n");
		assertEquals(score, 24);
	}
	
	@Test
	void testLevel4() {
		game.roll(1);
		game.roll(2);
		game.roll(10);
		game.roll(0);
		game.roll(10);
		game.roll(4);
		game.roll(2);
		game.roll(0);
		game.roll(10);
		game.roll(6);
		game.roll(2);
		game.roll(0);
		game.roll(10);
		game.roll(6);
		game.roll(4);
		game.roll(8);
		game.roll(2);
		game.roll(2);
		game.roll(7);
		int score = game.score();
		System.out.println("Entrée : On roll 10, 3 puis 4 et 16 fois 0\nScore attendu: 122\n" + "Score obtenu : " + score + "\n");
		assertEquals(score, 122);
	}
}

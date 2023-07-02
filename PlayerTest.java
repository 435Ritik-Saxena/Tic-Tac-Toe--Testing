package com.techlabs.TicTacToe2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {

	Player player1;
	Player player2;
	
	@BeforeEach
	void init() {
		player1 = new Player("Player 1", MarkType.X);
		player2= new Player("Player 2", MarkType.O);
	}
	@Test
	void testGetName() {
		//player1 = new Player("Player 1", MarkType.X);
        assertEquals("Player 1", player1.getName());
	}

	@Test
	void testGetMark() {
		//player2= new Player("Player 2", MarkType.O);
		assertNotEquals("Player 2",player2.getMark());
	}

}

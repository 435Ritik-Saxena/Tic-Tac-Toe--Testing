package com.techlabs.TicTacToe2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class CellTest {
	Cell cell;
	@BeforeEach
	void init() {
		cell = new Cell();
	}

	@Test
	void testGetMark() {
		assertNotEquals(MarkType.X, cell.getMark());
	}
	
	@Test
	void testSetMark() {
		cell.setMark(MarkType.X);
		assertNotEquals(MarkType.O,cell.getMark());
	}

	@Test
	void testIsEmpty() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				 cell.setMark(MarkType.X);
			}
		}
		assertFalse(cell.isEmpty());
	}

	

}

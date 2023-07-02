package com.techlabs.TicTacToe2;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
	
	Board board ;
	
	@BeforeEach
	void init() {
		board= new Board();
	}

	@Test
	void testIsBoardFull() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				Cell cells= board.getCell(i, j);
				cells.setMark(MarkType.X);
			}
		}
		assertTrue(board.isBoardFull());
	}
	
	@Test
	void testSetCellMark() throws CellAlreadyMarkedException, InvalidLocationException{
		assertThrows(InvalidLocationException.class, ()->board.setCellMark(4, 0, MarkType.X));
		
		board.setCellMark(1,0, MarkType.X);
	    assertThrows(CellAlreadyMarkedException.class, () ->board.setCellMark(1, 0, MarkType.X));
            
		
	}

}

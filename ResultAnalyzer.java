package com.techlabs.TicTacToe2;

public class ResultAnalyzer {
	private static final int[][] WINNING_COMBINATIONS = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Rows
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columns
            {0, 4, 8}, {2, 4, 6} // Diagonals
    };
	public boolean checkWin(Board board, MarkType mark) {
        for (int[] combination : WINNING_COMBINATIONS) {
            int row1 = combination[0] / Board.BOARD_SIZE;
            int col1 = combination[0] % Board.BOARD_SIZE;
            int row2 = combination[1] / Board.BOARD_SIZE;
            int col2 = combination[1] % Board.BOARD_SIZE;
            int row3 = combination[2] / Board.BOARD_SIZE;
            int col3 = combination[2] % Board.BOARD_SIZE;

            Cell cell1 = board.getCell(row1, col1);
            Cell cell2 = board.getCell(row2, col2);
            Cell cell3 = board.getCell(row3, col3);

            if (cell1.getMark() == mark && cell2.getMark() == mark && cell3.getMark() == mark) {
                return true;
            }
        }
        return false;
    }

}

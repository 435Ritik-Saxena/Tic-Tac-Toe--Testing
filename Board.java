package com.techlabs.TicTacToe2;

public class Board {
	public static final int BOARD_SIZE = 3;

    private Cell[][] cells;
    public Board() {
        cells = new Cell[BOARD_SIZE][BOARD_SIZE];
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                cells[row][col] = new Cell();
            }
        }
    }
    public void setCellMark(int row, int col, MarkType mark) throws CellAlreadyMarkedException, InvalidLocationException {
        if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE) {
            throw new InvalidLocationException("Invalid cell location!");
        }
        Cell cell = cells[row][col];
        if (!cell.isEmpty()) {
            throw new CellAlreadyMarkedException("Cell already marked!");
        }
        cell.setMark(mark);
    }
    public Cell getCell(int row, int col) {
        return cells[row][col];
    }
    public boolean isBoardFull() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (cells[row][col].isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                sb.append(cells[row][col].getMark());
                if (col < BOARD_SIZE - 1) {
                    sb.append(" | ");
                }
            }
            sb.append("\n");
            if (row < BOARD_SIZE - 1) {
                sb.append("---------\n");
            }
        }
        return sb.toString();
    }

}

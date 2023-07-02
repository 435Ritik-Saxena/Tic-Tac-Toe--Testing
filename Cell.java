package com.techlabs.TicTacToe2;

public class Cell {
	private MarkType mark;

    public Cell() {
        mark = MarkType.EMPTY;
    }
    public boolean isEmpty() {
        return mark == MarkType.EMPTY;
    }
    public MarkType getMark() {
        return mark;
    }
    public void setMark(MarkType mark) {
        this.mark = mark;
    }

}

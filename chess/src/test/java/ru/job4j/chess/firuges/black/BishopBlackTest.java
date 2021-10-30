package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {
    @Test
    public void whenPositionIsTrue() {
        Cell ps = Cell.C8;
        Figure bishopBlack1 = new BishopBlack(ps);
        Cell expected = bishopBlack1.position();
        Assert.assertEquals(ps, expected);
    }

    @Test
    public void whenCopy() {
        Figure bishopBlack1 = new BishopBlack(Cell.C8);
        Cell move = Cell.D7;
        Figure expected = bishopBlack1.copy(Cell.D7);
        Assert.assertEquals(move, expected.position());
    }

    @Test
    public void whenMove() {
        Figure bishopBlackLeft = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlackLeft.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(expected, result);
    }
}
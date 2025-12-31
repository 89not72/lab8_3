import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest {

    @Test
    public void testXWinsRow() {
        TicTacToe game = new TicTacToe();
        game.set(0, 0, 'X'); game.set(1, 0, 'O');
        game.set(0, 1, 'X'); game.set(1, 1, 'O');
        game.set(0, 2, 'X');
        assertEquals("X wins", game.evaluate());
    }

    @Test
    public void testOWinsColumn() {
        TicTacToe game = new TicTacToe();
        game.set(0, 0, 'O'); game.set(0, 1, 'X');
        game.set(1, 0, 'O'); game.set(1, 1, 'X');
        game.set(2, 0, 'O');
        assertEquals("O wins", game.evaluate());
    }

    @Test
    public void testDraw() {
        TicTacToe game = new TicTacToe();
        game.set(0, 0, 'X'); game.set(0, 1, 'O'); game.set(0, 2, 'X');
        game.set(1, 0, 'X'); game.set(1, 1, 'O'); game.set(1, 2, 'O');
        game.set(2, 0, 'O'); game.set(2, 1, 'X'); game.set(2, 2, 'X');
        assertEquals("Draw", game.evaluate());
    }
}

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by sabbas on 5/19/17.
 */
public class BoardTest {

    @Test
    public void aBoardIsInitializedWIthNoLivingCells() {
        Board board = new Board();
        assertEquals(board.numberOfLivingCells(), 0);
    }

    @Test
    public void youCanAddOneCellToABoard() {
        Board board = new Board();
        board.bringToLife(1,5);
        assertEquals(board.numberOfLivingCells(), 1);
    }

    @Test
    public void youCanAddManyCellsToABoard() {
        Board board = new Board();
        board.bringToLife(1,5);
        board.bringToLife(1,8);
        board.bringToLife(2,5);
        board.bringToLife(10,56);
        assertEquals(board.numberOfLivingCells(), 4);
    }

    @Test
    public void anEmptyBoardStaysEmptyAfterOneGeneration() {
        Board board = new Board();
        Board nextBoard = board.calculateNextGeneration();
        assertEquals(nextBoard.numberOfLivingCells(), 0);
    }

    @Test
    public void blockPatternOnTheBoard() {
        Board board = new Board();
        board.bringToLife(0,0);
        board.bringToLife(1,0);
        board.bringToLife(0,1);
        board.bringToLife(1,1);
        Board nextBoard = board.calculateNextGeneration();
        assertEquals(nextBoard.numberOfLivingCells(), 4);
    }





    @Test
    public void twoEmptyBoardsAreEqual() {
        Board board1 = new Board();
        Board board2 = new Board();
        assertTrue(board1.isEqualTo(board2));
    }

    @Test
    public void twoUnequalBoards() {
        Board board1 = new Board();
        Board board2 = new Board();
        board1.bringToLife(1,1);
        board2.bringToLife(5,7);
        assertFalse(board1.isEqualTo(board2));
    }


}
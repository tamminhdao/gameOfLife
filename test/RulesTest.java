import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


public class RulesTest {


    @Test
    public void aDeadCellStaysDeadIfItHasNoLivingNeighbors() {
        Rules rules = new Rules();
        boolean status = rules.isAlive(false, 0);
        assertFalse(status);
    }

    @Test
    public void aDeadCellStaysDeadIfItHasOneLivingNeighbor() {
        Rules rules = new Rules();
        boolean status = rules.isAlive(false, 1);
        assertFalse(status);
    }

    @Test
    public void aDeadCellStaysDeadIfItHasTwoLivingNeighbors() {
        Rules rules = new Rules();
        boolean status = rules.isAlive(false, 2);
        assertFalse(status);
    }

    @Test
    public void aDeadCellComesToLifeIfItHasThreeNeighbors() {
        Rules rules = new Rules();
        boolean status = rules.isAlive(false, 3);
        assertTrue(status);
    }

    @Test
    public void aDeadCellComesToLifeIfItHasFourNeighbors() {
        Rules rules = new Rules();
        boolean status = rules.isAlive(false, 4);
        assertFalse(status);
    }

    @Test
    public void aLivingCellDiesIfItHasNoNeighbors() {
        Rules rules = new Rules();
        boolean status = rules.isAlive(true, 0);
        assertFalse(status);
    }

    @Test
    public void aLivingCellStaysAliveIfItHasTwoNeighbors() {
        Rules rules = new Rules();
        boolean status = rules.isAlive(true, 2);
        assertTrue(status);
    }

    @Test
    public void aLivingCellStaysAliveIfItHasThreeNeighbors() {
        Rules rules = new Rules();
        boolean status = rules.isAlive(true, 3);
        assertTrue(status);
    }

}

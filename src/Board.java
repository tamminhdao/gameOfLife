import java.util.ArrayList;

public class Board {

    public boolean isEqualTo(Board board2) {
        if (coordinatesOfLivingCells.size() == 0) {
            return true;
        } else{
            return false;
        }
    }


    public ArrayList<Point> coordinatesOfLivingCells = new ArrayList<>();

    public int numberOfLivingCells() {
        return coordinatesOfLivingCells.size();
    }

    public void bringToLife(int x, int y) {
        coordinatesOfLivingCells.add(new Point(x,y));
    }

    private void bringToLife(Point p) {
        coordinatesOfLivingCells.add(p);
    }

    public Board calculateNextGeneration() {
        Board newBoard = new Board();
        for (int i = 0; i < coordinatesOfLivingCells.size(); i++) {
            newBoard.bringToLife(coordinatesOfLivingCells.get(i));
        }
        return newBoard;
    }
}

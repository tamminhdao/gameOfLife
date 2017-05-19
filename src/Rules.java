/**
 * Created by sabbas on 5/19/17.
 */
public class Rules {

    public boolean isAlive(boolean initialState, int numberOfNeighbors) {
        if (!initialState) {
            return numberOfNeighbors == 3;
        } else {
            return numberOfNeighbors == 2 || numberOfNeighbors == 3;
        }
    }
}

/* (C)2024 */
import java.util.List;
import mocks.CallCostObject;
import mocks.CardWinner;
import mocks.TotalSummary;

public class ChallengeStream {

    /**
     * One stack containing five numbered cards from 0-9 are given to both players. Calculate which hand has winning number.
     * The winning number is calculated by which hard produces the highest two-digit number.
     *
     * calculateWinningHand([2, 5, 2, 6, 9], [3, 7, 3, 1, 2]) ➞ true
     *  P1 can make the number 96
     *  P2 can make the number 73
     *  P1 win the round since 96 > 73
     *
     * The function must return which player hand is the winner and the two-digit number produced. The solution must contain streams.
     *
     * @param player1  hand, player2 hand
     */
    public CardWinner calculateWinningHand(List<Integer> player1, List<Integer> player2) {
        // YOUR CODE HERE...
        return new CardWinner();
    }

    /**
     * Design a solution to calculate what to pay for a set of phone calls. The function must receive an
     * array of objects that will contain the identifier, type and duration attributes. For the type attribute,
     * the only valid values are: National, International and Local
     *
     * The criteria for calculating the cost of each call is as follows:
     *
     * International: first 3 minutes $ 7.56 -> $ 3.03 for each additional minute
     * National: first 3 minutes $ 1.20 -> $ 0.48 per additional minute
     * Local: $ 0.2 per minute.
     *
     * The function must return the total calls, the details of each call (the detail received + the cost of the call)
     * and the total to pay taking into account all calls. The solution must be done only using streams.
     *
     * @param {Call[]} calls - Call's information to be processed
     *
     * @returns {CallsResponse}  - Processed information
     */
    public TotalSummary calculateCost(List<CallCostObject> costObjectList) {
        // YOUR CODE HERE...
        return new TotalSummary();
    }
}

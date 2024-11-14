/* (C)2024 */
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.jupiter.api.Assertions.assertEquals;

import mocks.CallCostMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ChallengeStreamTest {
    ChallengeStream challengeStream;
    CallCostMock callCostMock;

    @BeforeEach
    void setUp() {
        challengeStream = new ChallengeStream();
        callCostMock = new CallCostMock();
    }

    @Test
    @Order(1)
    public void callCost() {
        assertEquals(5, challengeStream.calculateCost(callCostMock.calls).getTotalCalls());
        assertEquals(65.74, challengeStream.calculateCost(callCostMock.calls).getTotalCost());
        assertThat(challengeStream.calculateCost(callCostMock.calls), hasProperty("totalCost"));
        assertThat(
                challengeStream.calculateCost(callCostMock.calls).getCalls(),
                everyItem(hasProperty("totalCost")));
    }

    @Test
    @Order(2)
    public void calculateWinningHand() {
        assertEquals("P1", challengeStream.calculateWinningHand(Arrays.asList(2, 5, 2, 6, 9), Arrays.asList(3, 7, 3, 1, 2)).getWinner());
        assertEquals(96, challengeStream.calculateWinningHand(Arrays.asList(2, 5, 2, 6, 9), Arrays.asList(3, 7, 3, 1, 2)).getWinTotal());

        assertEquals("P2", challengeStream.calculateWinningHand(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(9, 8, 7, 6, 5)).getWinner());
        assertEquals(98, challengeStream.calculateWinningHand(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(9, 8, 7, 6, 5)).getWinTotal());

        assertEquals("TIE", challengeStream.calculateWinningHand(Arrays.asList(4, 3, 4, 4, 5), Arrays.asList(3, 2, 5, 4, 1)).getWinner());
        assertEquals(54, challengeStream.calculateWinningHand(Arrays.asList(4, 3, 4, 4, 5), Arrays.asList(3, 2, 5, 4, 1)).getWinTotal());

    }
}

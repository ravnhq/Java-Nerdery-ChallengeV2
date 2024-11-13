/* (C)2024 */
package mocks; /* (C)2024 */


public class CardWinner {
    String winner;
    Integer winTotal;

    public CardWinner(){}
    public CardWinner(String winner, Integer winTotal) {
        this.winner = winner;
        this.winTotal = winTotal;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public Integer getWinTotal() {
        return winTotal;
    }

    public void setWinTotal(Integer winTotal) {
        this.winTotal = winTotal;
    }
}

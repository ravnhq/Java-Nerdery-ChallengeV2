/* (C)2024 */
package mocks; /* (C)2024 */

import java.util.List;

public class TotalSummary {
    public List<CallSummary> getCalls() {
        return calls;
    }

    public void setCalls(List<CallSummary> calls) {
        this.calls = calls;
    }

    public Integer getTotalCalls() {
        return totalCalls;
    }

    public void setTotalCalls(Integer totalCalls) {
        this.totalCalls = totalCalls;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    List<CallSummary> calls;
    Integer totalCalls;
    Double totalCost;

    public TotalSummary(){}
    public TotalSummary(List<CallSummary> calls, Integer totalCalls, Double totalCost) {
        this.calls = calls;
        this.totalCalls = totalCalls;
        this.totalCost = totalCost;
    }
}

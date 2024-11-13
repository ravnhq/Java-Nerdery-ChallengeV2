/* (C)2024 */
package mocks; /* (C)2024 */

public class CallSummary {
    public CallSummary(CallCostObject callCostObject, Double totalCost) {
        this.callCostObject = callCostObject;
        this.totalCost = totalCost;
    }

    public CallCostObject getCallCostObject() {
        return callCostObject;
    }

    public void setCallCostObject(CallCostObject callCostObject) {
        this.callCostObject = callCostObject;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    CallCostObject callCostObject;
    Double totalCost;
}

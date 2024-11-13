/* (C)2024 */
package mocks; /* (C)2024 */

import java.util.ArrayList;

public class CallCostMock {
    public final ArrayList<CallCostObject> calls =
            new ArrayList<CallCostObject>() {
                {
                    add(new CallCostObject("NT-1", "National", 3));
                    add(new CallCostObject("NT-2", "National", 5));
                    add(new CallCostObject("INT-1", "International", 2));
                    add(new CallCostObject("INT-2", "International", 9));
                    add(new CallCostObject("LO-1", "Intern", 8));
                    add(new CallCostObject("IN-1", "Intern", 8));
                    add(new CallCostObject("LO-1", "Local", 8));
                }
            };
}

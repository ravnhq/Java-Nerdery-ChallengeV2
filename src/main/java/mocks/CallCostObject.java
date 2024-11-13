/* (C)2024 */
package mocks; /* (C)2024 */

public class CallCostObject {

    public CallCostObject(String identifier, String type, int duration) {
        this.identifier = identifier;
        this.type = type;
        this.duration = duration;
    }

    private String identifier;
    private String type;
    private int duration;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

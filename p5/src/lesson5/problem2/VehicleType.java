package lesson5.problem2;

public class VehicleType {
    protected String attribute;

    public VehicleType(String attribute) {
        this.attribute = attribute;
    }

    public String getAttributeOfType() {
        return attribute;
    }
    public String getTypeName() {
        return "Some vehicle type name";
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute (String attribute) {
        this.attribute = attribute;
    }
}

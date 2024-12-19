package lesson5.problem2;

public class VehicleTypeByFuelType extends VehicleType {
    public VehicleTypeByFuelType() {
        super("Vehicle type by fuel type");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByFuelType that = (VehicleTypeByFuelType) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}
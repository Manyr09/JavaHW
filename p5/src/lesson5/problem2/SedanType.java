package lesson5.problem2;

public class SedanType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}


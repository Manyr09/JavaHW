package lesson5.problem2;

public class TruckType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}

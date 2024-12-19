package lesson5.problem2;

public class DieselType extends VehicleTypeByFuelType {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
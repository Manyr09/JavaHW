package lesson5.problem2;

public class ElectricType extends VehicleTypeByFuelType{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}
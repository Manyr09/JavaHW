package lesson5.problem2;

public class HybridType extends VehicleTypeByFuelType {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}
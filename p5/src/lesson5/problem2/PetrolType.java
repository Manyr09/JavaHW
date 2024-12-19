package lesson5.problem2;

public class PetrolType extends VehicleTypeByFuelType {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
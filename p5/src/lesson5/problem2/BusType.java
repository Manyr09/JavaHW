package lesson5.problem2;

public class BusType extends VehicleTypeByBodyTypes{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}

package lesson5.problem2;

public class PassengerType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }
}

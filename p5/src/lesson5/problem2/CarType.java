package lesson5.problem2;

public class CarType extends VehicleTypeByPurpose{
  @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
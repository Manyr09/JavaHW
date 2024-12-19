package lesson5.problem2;

public class Practice {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());
        adsService.setAdList(new VehicleAd[]{volvoAd, kamazAd});

        System.out.println("Фильтр по типу автомобиля (Purpose)");
        adsService.filterByVehicleTypeByPurpose(new PassengerType());
        System.out.println();

        System.out.println("Фильтр по типу кузова");
        adsService.filterByVehicleTypeByBodyTypes(new SedanType());
        System.out.println();

        System.out.println("Фильтр по типу топлива");
        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
    }
}

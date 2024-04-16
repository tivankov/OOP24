package pckg_agregation;

public class Test {

    public static void main(String[] args) {
        FleetVehicles vehicles = new FleetVehicles("Big Company");
        Vehicle veh1 = new Vehicle("model1");
        Vehicle veh2 = new Vehicle("model2");
        Vehicle veh3 = new Vehicle("model3");

        vehicles.addNewVehicel(veh1);
        vehicles.addNewVehicel(veh2);
        vehicles.addNewVehicel(veh3);
        vehicles.removeVehicle(veh3);
    }
}

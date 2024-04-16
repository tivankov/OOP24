package pckg_agregation;

import pckg_uml_vj.Vihacle;

import java.util.ArrayList;

public class FleetVehicles {

    private String company;
    private int companiID;
    private static int cntID = 300;
    private final ArrayList<Vehicle> vehicles;

    public FleetVehicles(String company) {
        this.company = company;
        this.companiID = cntID++;
        this.vehicles = new ArrayList<>();
    }

    public void addNewVehicel(Vehicle vehicle){
        if (vehicles.contains(vehicle)){
            System.out.println("This vehicle is already in the Fleet!");
        } else {
            vehicles.add(vehicle);
            System.out.println("New vehacle added to the Fleet!");
        }
    }

    public void removeVehicle(Vehicle vehicle){
        if (vehicles.contains(vehicle)){
            vehicles.remove(vehicle);
            System.out.println("Vehicle: " + vehicle + " removed from the Fleet!");
        }else{
            System.out.println("Can+t remove the vehicle - not in the Fleet");
        }
    }

    public Vehicle getVehicleFromFleet(int indPos){
        Vehicle vehicle = null;
        if(indPos < 0 || indPos > vehicles.size()){
            System.out.println("Index out of bounds - size is: " + vehicles.size());
        }else {
            vehicle = vehicles.get(indPos);
        }
        return null;
    }

    public Vehicle getVehicle(Vehicle vehicle){
        Vehicle vehicle1 = null;
        if(!vehicles.contains(vehicle)){
            System.out.println("Vehicle is not in the Fleet");
        }else {
            int pos = vehicles.indexOf(vehicle);
            vehicle = vehicles.get(pos);
        }
        return null;
    }

    public void listAllVehicles(){
        for (Vehicle veh: vehicles) {
            System.out.println(veh);
        }
    }
}

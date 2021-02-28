package Task2;

import java.util.Arrays;

public class Garage {
    Vehicle [] garage;
    int currentVehicleNum;

    public Garage(){
        garage = new Vehicle[0];
    }
    public  Garage (int vehicleNum){
        garage = new Vehicle[vehicleNum];

        for (int i = 0; i < garage.length ; i++) {
            garage[i] = new Vehicle(0,0,0);
        }
        currentVehicleNum = 0;
    }
    public void addVehicle(Vehicle vehicle){
        Vehicle [] temp = Arrays.copyOf(garage,garage.length+1);
        temp [garage.length] = vehicle;
        this.garage = temp;
    }

    @Override
    public String toString() {
        String result = System.lineSeparator();
        for (Vehicle vehicle: garage)
            result += vehicle.toString() + System.lineSeparator();

        return  result;
    }

    public void addVehicle(Vehicle vehicle, int position){
        if (position < garage.length)
            garage[position] = vehicle;
    }

}

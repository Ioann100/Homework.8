package Task2;

public class Plane extends Vehicle{
    public int  height;
    public  int passengerCapacity;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Plane:" + super.toString() +
                " Height = " + height +
                " Passenger capacity = " + passengerCapacity ;
    }

    public Plane(int prise, int speed, int yearOfIssue, int height, int passengerCapacity) {
        super(prise, speed, yearOfIssue);
        this.height = height;
        this.passengerCapacity = passengerCapacity;
    }
}

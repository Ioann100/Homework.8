package Task2;

public class Ship extends Vehicle {
    public int passengerCapacity;
    public String homePort;

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getHomePort() {
        return homePort;
    }

    public void setHomePort(String homePort) {
        this.homePort = homePort;
    }

    @Override
    public String toString() {
        return "Ship:" + super.toString() +
                " PassengerCapacity = " + passengerCapacity +
                " HomePort = " + homePort + '\'' +
                " Prise = " + prise +
                " Speed = " + speed +
                " Year of issue = " + yearOfIssue ;
    }

    public Ship(int prise, int speed, int yearOfIssue, int passengerCapacity, String homePort) {
        super(prise, speed, yearOfIssue);
        this.passengerCapacity = passengerCapacity;
        this.homePort = homePort;
    }
}

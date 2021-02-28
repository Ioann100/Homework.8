package Task2;

public class Car extends Vehicle {
    private int carrying;

    @Override
    public String toString() {
        return "Car: " + super.toString() +
                " Carrying = " + carrying;
    }

    public Car(int prise, int speed, int yearOfIssue, int carrying) {
        super(prise, speed, yearOfIssue);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}

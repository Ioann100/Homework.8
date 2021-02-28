package Task2;

public class Vehicle {
public int prise;
public int speed;
public int yearOfIssue;

    public Vehicle(int prise, int speed, int yearOfIssue) {
        this.prise = prise;
        this.speed = speed;
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return  " Prise = " + prise +
                " Speed = " + speed +
                " Year of issue = " + yearOfIssue ;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}

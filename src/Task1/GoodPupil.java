package Task1;

public class GoodPupil extends Pupil {
    @Override
    public String toString() {
        return super.relax() + "good";
    }

    public GoodPupil(String name, int age) {
        super(name, age);
        this.characteristics = "good";
    }
}

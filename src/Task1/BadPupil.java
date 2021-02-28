package Task1;

public class BadPupil extends Pupil{
    public BadPupil(String name, int age) {
        super(name, age);
        this.characteristics = "bad";
    }

    @Override
    public String toString() {
     return super.relax() + "excellent";
    }
}

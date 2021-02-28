package Task1;

public class DefoultPupil extends Pupil{
    public DefoultPupil(String name, int age) {
        super(name, age);
        this.characteristics = "defoul";
    }

    @Override
    public String toString() {
        return super.relax() + "defoult";
    }
}

package Task1;

public class ClassRoom {
    Pupil pupil;
    ExcelentPupil excelentPupil;
    GoodPupil goodPupil;
    BadPupil badPupil;
    DefoultPupil defoultPupil;

    public ClassRoom() {
        pupil = new Pupil("", 0);
        excelentPupil = new ExcelentPupil("Ivan", 16);
        goodPupil = new GoodPupil("Dima", 11);
        badPupil = new BadPupil("Vitalik", 17);
        defoultPupil = new DefoultPupil("Aleh",7);
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "pupil=" + pupil +
                ", excelentPupil=" + excelentPupil +
                ", goodPupil=" + goodPupil +
                ", badPupil=" + badPupil +
                '}';
    }
}

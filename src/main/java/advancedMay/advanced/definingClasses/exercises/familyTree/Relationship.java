package advancedMay.advanced.definingClasses.exercises.familyTree;

public class Relationship {
    private final String firstPersonDetail;
    private final String secondPersonDetail;

    public Relationship(String firstPersonDetail, String secondPersonDetail) {
        this.firstPersonDetail = firstPersonDetail;
        this.secondPersonDetail = secondPersonDetail;
    }

    public String getFirstPersonDetail() {
        return firstPersonDetail;
    }

    public String getSecondPersonDetail() {
        return secondPersonDetail;
    }
}

package lab.activity;

public class Covered extends Activity {
    public Covered(String objectName, String characteristic){
        super(objectName,characteristic);
    }

    public Covered() {

    }

    @Override
    protected String createMainPart() {
        return "покрыт";
    }

    @Override
    public String getActivityName() {
        return "Covered";
    }
}

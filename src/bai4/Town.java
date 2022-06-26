package bai4;

import java.util.ArrayList;

public class Town {
    private ArrayList<bai4.Family> families;

    public Town() {
    }

    public Town(ArrayList<bai4.Family> families) {
        this.families = families;
    }

    public ArrayList<bai4.Family> getFamilies() {
        return families;
    }

    public void setFamilies(ArrayList<bai4.Family> families) {
        this.families = families;
    }

    @Override
    public String toString() {
        return "Town{" +
                "families=" + families +
                '}';
    }
}

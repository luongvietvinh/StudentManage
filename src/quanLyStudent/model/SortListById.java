package quanLyStudent.model;

import java.util.Comparator;

public class SortListById implements Comparator<Studen> {
    @Override
    public int compare(Studen o1, Studen o2) {
        if (o1.getId() > o2.getId()){
            return 1;
        }
        return -1;
    }
}

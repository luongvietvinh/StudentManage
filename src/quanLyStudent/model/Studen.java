package quanLyStudent.model;

public class Studen extends Human{
    private double workingDay;

    public Studen(double workingDay) {
        this.workingDay = workingDay;
    }


    public Studen( int id,String name, int age, String gender, double workingDay) {
        super(id, name, age, gender);
        this.workingDay = workingDay;
    }

    public double getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(double workingDay) {
        this.workingDay = workingDay;
    }

    @Override
    public String toString() {
        return super.toString() + " , " + workingDay;

    }
}

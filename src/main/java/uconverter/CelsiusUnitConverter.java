package uconverter;

/**
 * Created by JavaCourses on 19.04.2017..
 */
public class CelsiusUnitConverter extends UnitConverter {


    @Override
    public double toSI(double value) {
        return (value + 273);
    }

    @Override
    public double fromSI(double siValue) {
        return (siValue - 273);
    }

    @Override
    public String getName() {
        return "Celsius";
    }
}

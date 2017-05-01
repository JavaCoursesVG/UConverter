package uconverter;

/**
 * Created by JavaCourses on 19.04.2017..m
 */
public class CelsiusUnitConverter extends UnitConverter {


    @Override
    public double toSI(double value) {
        return (value + 273.15);
    }

    @Override
    public double fromSI(double siValue) {
        return (siValue - 273.15);
    }

    @Override
    public String getMeasure() {
        return "Celsius";
    }
}

package uconverter;

/**
 * Created by Vadims on 25-Apr-17.
 */
public class FootInSecondUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value * 0.3048;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue / 0.3048;
    }

    @Override
    public String getMeasure() {
        return "foot/s";
    }

}

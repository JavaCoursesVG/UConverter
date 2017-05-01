package uconverter;

/**
 * Created by Vadims on 25-Apr-17.
 */
public class MileUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value * 1609;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue / 1609;
    }

    @Override
    public String getMeasure() {
        return "mile";
    }

}

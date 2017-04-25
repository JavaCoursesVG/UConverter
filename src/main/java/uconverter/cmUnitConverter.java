package uconverter;

/**
 * Created by Vadims on 25-Apr-17.
 */
public class cmUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value / 100;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue * 100;
    }

    @Override
    public String getMeasure() {
        return "cm";
    }

}

package uconverter;

/**
 * Created by Vadims on 25-Apr-17.
 */
public class InchUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value / 39.37;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue * 39.37;
    }

    @Override
    public String getMeasure() {
        return "inch";
    }

}

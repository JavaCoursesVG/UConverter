package uconverter;

/**
 * Created by Vadims on 25-Apr-17.
 */
public class ounceUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value / 35.2733;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue * 35.2733;
    }

    @Override
    public String getMeasure() {
        return "ounce";
    }

}

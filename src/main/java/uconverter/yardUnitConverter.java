package uconverter;

/**
 * Created by Vadims on 25-Apr-17.
 */
public class yardUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value / 0.91;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue * 0.91;
    }

    @Override
    public String getMeasure() {
        return "yard";
    }

}

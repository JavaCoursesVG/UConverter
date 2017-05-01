package uconverter;

/**
 * Created by Vadims on 25-Apr-17.
 */
public class FootUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value / 3.2786;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue * 3.2786;
    }

    @Override
    public String getMeasure() {
        return "foot";
    }

}

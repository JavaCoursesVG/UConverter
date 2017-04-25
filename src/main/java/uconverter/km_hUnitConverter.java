package uconverter;

/**
 * Created by Vadims on 25-Apr-17.
 */
public class km_hUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value * 0.277778;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue / 0.277778;
    }

    @Override
    public String getMeasure() {
        return "K/h";
    }

}

package uconverter;

/**
 * Created by Vadims on 25-Apr-17.
 */
public class mile_hUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value * 0.44704;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue / 0.44704;
    }

    @Override
    public String getMeasure() {
        return "mile/h";
    }

}

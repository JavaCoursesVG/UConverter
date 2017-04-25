package uconverter;

/**
 * Created by Vadims on 25-Apr-17.
 */
public class gallonUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value * 4.54 ;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue / 4.54 ;
    }

    @Override
    public String getMeasure() {
        return "gallon";
    }

}

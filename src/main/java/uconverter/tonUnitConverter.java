package uconverter;

/**
 * Created by Vadims on 25-Apr-17.
 */
public class tonUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value * 1000 ;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue / 1000;
    }

    @Override
    public String getMeasure() {
        return "ton";
    }

}

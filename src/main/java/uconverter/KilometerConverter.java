package uconverter;

/**
 * Created by mebo on 25.04.2017..
 */
public class KilometerConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value * 1000;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue / 1000;
    }

    @Override
    public String getMeasure() {
        return "Kilometers";
    }

}

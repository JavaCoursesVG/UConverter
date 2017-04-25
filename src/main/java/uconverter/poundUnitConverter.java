package uconverter;

/**
 * Created by Vadims on 25-Apr-17.
 */
public class poundUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value / 2.2026;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue * 2.2026;
    }

    @Override
    public String getMeasure() {
        return "pound";
    }


}

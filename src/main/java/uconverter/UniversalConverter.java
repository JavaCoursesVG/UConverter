package uconverter;

import asg.cliche.Command;

import java.util.Arrays;
import java.util.List;

/**
 * Created by JavaCourses on 19.04.2017..
 */
public class UniversalConverter {

    private final List<UnitConverter> converters = Arrays.asList(
            new CelsiusUnitConverter(),
            new FahrenheitUnitConverter(),
            new KelvinUnitConverter(),
            new MeterUnitConverter(),
            new KilometerUnitConverter(),
            new CentimeterUnitConverter(),
            new MilimeterUnitConverter(),
            new InchUnitConverter(),
            new FootUnitConverter(),
            new YardUnitConverter(),
            new MileUnitConverter(),
            new KiligramUnitConverter(),
            new GramUnitConverter(),
            new TonUnitConverter(),
            new OunceUnitConverter(),
            new PoundUnitConverter(),
            new LiterUnitConverter(),
            new GallonImperialUnitConverter(),
            new MeterInSecondUnitConverter(),
            new KilometerInHourUnitConverter(),
            new FootInSecondUnitConverter(),
            new MileInHourUnitConverter()
    );

    private UnitConverter sourceConverter;
    private UnitConverter targetConverter;

    @Command
    public void list() {
        //for (initialization; terminator; increment)//
        for (int i = 0; i < converters.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, converters.get(i));
        }
    }

    public List<UnitConverter> getConverters() {
        return converters;
    }

    @Command
    public void source(int idx) {
        sourceConverter = converters.get(idx - 1);
    }

    @Command
    public void target(int idx) {
        targetConverter = converters.get(idx - 1);
    }

    public UnitConverter getSourceConverter() {return sourceConverter; }

    public UnitConverter getTargetConverter() {return  targetConverter; }

    @Command
    public double convert(double value) {
        UnitConverter src = getSourceConverter();
        UnitConverter trg = getTargetConverter();
        if (src == null && trg == null) {
            throw new IllegalStateException("Source and Target converters are not set");
        }
        if (src == null) {
            throw new IllegalStateException("Source converter is not set");
        }
        if (trg == null) {
            throw new IllegalStateException("Target converter is not set");
        }
        double siValue = src.toSI(value);
        return trg.fromSI(siValue);
    }

}

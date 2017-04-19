package uconverter;

import asg.cliche.Command;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by JavaCourses on 19.04.2017..
 */
public class UniversalConverter {

    private List<UnitConverter> converters = Arrays.asList(
        new CelsiusUnitConverter(),
        new FahrenheitUnitConverter(),
        new KelvinUnitConverter()
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
    /* How cliche shows commands?*/
    @Command
    public void source (int idx) {
        sourceConverter = converters.get(idx - 1);
    }

    //testtest
    @Command
    public void target (int idx) {
        targetConverter = converters.get(idx -1);
    }

    @Command
    public double convert (double value) {
        double siValue = sourceConverter.toSI(value);
        double targetValue = targetConverter.fromSI(siValue);
        return targetValue;
    }

}

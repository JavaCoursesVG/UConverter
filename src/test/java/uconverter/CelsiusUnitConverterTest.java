package uconverter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by JavaCourses on 26.04.2017..
 */

//tyetdsgdfgrtyry
@RunWith(Parameterized.class)
public class CelsiusUnitConverterTest {

    private CelsiusUnitConverter converter = new CelsiusUnitConverter();
    @Parameterized.Parameter(0)
    public double srcCelsius;
    @Parameterized.Parameter(1)
    public double trgCelsius;


    @Parameterized.Parameters
    public static Collection<Object> data() {
        return Arrays.asList(new Object[][] {
                {10.0, 10.0 + 273.15},
                {100.0, 100.0 + 273.15},
                {150.0, 150.0 + 273.15}
        });

    }

    @Test
    public void toSI() throws Exception {
        assertEquals(trgCelsius, converter.toSI(srcCelsius), 0.00001);

    }

    @Test
    public void fromSI() throws Exception {

        assertEquals(srcCelsius, converter.fromSI(trgCelsius), 0.00001);

    }

    @Test
    public void getMeasure() throws Exception {

        assertEquals("Celsius", converter.getMeasure());

    }

}
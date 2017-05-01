package uconverter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JavaCourses on 26.04.2017..
 */
public class FahrenheitUnitConverterTest {

    FahrenheitUnitConverter converter = new FahrenheitUnitConverter();

    @Test
    public void toSI() throws Exception {
        assertEquals((10.0 + 459.67) * 5.0/9.0, converter.toSI(10.0), 0.00001);
    }

    @Test
    public void fromSI() throws Exception {
        assertEquals(((10.0 * 9.0/5.0) - 459.67), converter.fromSI(10.0), 0.00001);
    }

    @Test
    public void getMeasure() throws Exception {

        assertEquals("Fahrenheit", converter.getMeasure());

    }

}
package uconverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mebo on 09.05.2017..
 */
public class LiterUnitConverterTest {

    private LiterUnitConverter converter = new LiterUnitConverter();

    @Test
    public void toSI() throws Exception {
        assertEquals(0, converter.toSI(0), 0.00001);
    }

    @Test
    public void fromSI() throws Exception {
        assertEquals(0, converter.fromSI(0), 0.00001);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Liter", converter.getMeasure());
    }

}

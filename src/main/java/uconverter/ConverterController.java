package uconverter;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import com.sun.xml.internal.fastinfoset.algorithm.DoubleEncodingAlgorithm;
import com.sun.xml.internal.ws.org.objectweb.asm.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.List;

/**
 * Created by JavaCourses on 10.05.2017..
 */
public class ConverterController {

    public ComboBox<UnitConverter> srcUnit;
    public ComboBox<UnitConverter> trgUnit;
    public TextField srcValue;
    public TextField result;


    UniversalConverter converter = new UniversalConverter();


    public void initialize() {
        List<UnitConverter> units = converter.getConverters();
        srcUnit.getItems().setAll(units);
        trgUnit.getItems().setAll(units);
    }

    public void convert(ActionEvent actionEvent) {
        String s = srcValue.getText();
        double val = Double.parseDouble(s);
        UnitConverter src = srcUnit.getValue();
        UnitConverter trg = trgUnit.getValue();

        double res = src.toSI(val);
        double value = trg.fromSI(res);

        result.setText(Double.toString(value));
    }

}

package zhang.springframework.gof.adapter.source;

import zhang.springframework.gof.adapter.adaptee.CsvFormattable;
import zhang.springframework.gof.adapter.adaptee.CsvFormatter;
import zhang.springframework.gof.adapter.csvadapter.CsvAdapterImpl;
import zhang.springframework.gof.adapter.source.NewLineFormatter;
import zhang.springframework.gof.adapter.source.TextFormattable;

import org.junit.Test;

import static org.junit.Assert.*;


public class NewLineFormatterTest {
    @Test
    public void testFormatText() throws Exception {

            String testString=" Formatting line 1. Formatting line 2. Formatting line 3.";
            TextFormattable newLineFormatter=new NewLineFormatter();
            String resultString = newLineFormatter.formatText(testString);
            System.out.println(resultString);

            CsvFormattable csvFormatter=new CsvFormatter();
            TextFormattable csvAdapter=new CsvAdapterImpl(csvFormatter);
            String resultCsvString=csvAdapter.formatText(testString);
            System.out.println(resultCsvString);
    }
}
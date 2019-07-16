package structural.bridge.example3.printer;

import structural.bridge.example3.beans.Detail;
import structural.bridge.example3.formatter.Formatter;

import java.util.List;

public abstract class Printer {

    public String print(Formatter formatter){
        return formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();
    abstract protected String getHeader();
}

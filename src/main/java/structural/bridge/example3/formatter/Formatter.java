package structural.bridge.example3.formatter;

import structural.bridge.example3.beans.Detail;

import java.util.List;

public interface Formatter {
    String format(String headder, List<Detail> detailList);
}

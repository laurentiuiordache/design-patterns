package structural.bridge.example3.formatter;

import structural.bridge.example3.beans.Detail;

import java.util.List;

public class PrintFormatter implements Formatter {

    @Override
    public String format(String headder, List<Detail> detailList) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(headder + "\n");

        detailList.forEach(detail ->
                stringBuilder.append(detail.getLabel() + ": " + detail.getValue() + "\n"));

        return stringBuilder.toString();
    }
}

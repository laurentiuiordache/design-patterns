package structural.bridge.example3.formatter;

import structural.bridge.example3.beans.Detail;

import java.util.List;

public class HtmlPrintFormatter implements Formatter{

    @Override
    public String format(String headder, List<Detail> detailList) {
        StringBuilder builder = new StringBuilder();

        builder.append("<table>");
        builder.append("<th>");
        builder.append("<table>");
        builder.append("Classification");
        builder.append("</th>");
        builder.append("<th>");
        builder.append(headder);
        builder.append("</th>");

        for(Detail detail: detailList){
            builder.append("<tr><td>");
            builder.append(detail.getLabel());
            builder.append("<tr><td>");
            builder.append(detail.getValue());
        }
        builder.append("</table>");

        return builder.toString();
    }
}

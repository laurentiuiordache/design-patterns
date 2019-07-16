package structural.bridge.example3.beans;

public class Detail {
    private String label;
    private String value;

    public Detail() {
    }

    public Detail(String label, String price) {
        this.label = label;
        this.value = price;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

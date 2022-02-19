package fr.achillebourgault.achtml.core.stylesheet;

public class StyleValue {

    private String raw;
    private StyleValueType type;

    public StyleValue(StyleValueType type, String raw) {
        this.type = type;
        this.raw = raw;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String value) {
        this.raw = value;
    }
}

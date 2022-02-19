package fr.achillebourgault.achtml.core.stylesheet;

public class StyleRule {

    private StyleAttribute attribute;
    private StyleValue value;

    public StyleRule() {
        this.attribute = null;
        this.value = null;
    }

    public StyleRule(StyleAttribute attribute, StyleValue value) {
        this.attribute = null;
        this.value = null;
    }

    public StyleAttribute getAttribute() {
        return attribute;
    }

    public void setAttribute(StyleAttribute attribute) {
        this.attribute = attribute;
    }

    public StyleValue getValue() {
        return value;
    }

    public void setValue(StyleValue value) {
        this.value = value;
    }

}

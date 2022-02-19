package fr.achillebourgault.achtml.core.stylesheet;

public enum StyleAttribute {
    FONT_SIZE("font-size"),
    COLOR("color"),
    BACKGROUND_COLOR("background-color");

    public final String label;

    private StyleAttribute(String label) {
        this.label = label;
    }
}

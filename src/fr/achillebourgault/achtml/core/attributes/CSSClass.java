package fr.achillebourgault.achtml.core.attributes;

import fr.achillebourgault.achtml.core.stylesheet.StyleRule;

import java.util.ArrayList;

public class CSSClass extends Attribute {

    private ArrayList<StyleRule> rules = new ArrayList<>();
    private String raw;

    public CSSClass() { }

    public CSSClass(String raw) {
        this.raw = raw;
        //TODO: Parse raw to fill in rules
    }
}

package fr.achillebourgault.achtml.core.attributes;

import fr.achillebourgault.achtml.core.stylesheet.StyleRule;

import java.util.ArrayList;

public class CSSClass {

    private ArrayList<StyleRule> rules = new ArrayList<>();

    public CSSClass() { }

    public CSSClass(String raw) {
        //TODO: Parse raw to fill in rules
    }
}

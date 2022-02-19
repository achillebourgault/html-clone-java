package fr.achillebourgault.achtml.core.elements;

import fr.achillebourgault.achtml.core.attributes.Attribute;
import fr.achillebourgault.achtml.core.stylesheet.Stylesheet;

import java.util.ArrayList;
import java.util.HashMap;

public class Element {

    private Stylesheet style;
    private ArrayList<Attribute> attributes = new ArrayList<>();
    private ArrayList<Element> content = new ArrayList<>();

    public Element() { this.style = new Stylesheet(); }

    public Element(Stylesheet style, ArrayList<Attribute> attributes, ArrayList<Element> content) {
        this.style = style;
        this.attributes = attributes;
        this.content = content;
    }

    public Stylesheet getStyle() {
        return style;
    }

    public void setStyle(Stylesheet style) {
        this.style = style;
    }

    public ArrayList<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<Attribute> attributes) {
        this.attributes = attributes;
    }

    public ArrayList<Element> getContent() {
        return content;
    }

    public void setContent(ArrayList<Element> content) {
        this.content = content;
    }
}

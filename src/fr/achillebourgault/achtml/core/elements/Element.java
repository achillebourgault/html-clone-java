package fr.achillebourgault.achtml.core.elements;

import fr.achillebourgault.achtml.core.attributes.Attribute;
import fr.achillebourgault.achtml.core.attributes.CSSClass;
import fr.achillebourgault.achtml.core.stylesheet.Stylesheet;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Element {

    private String id = "";
    private Stylesheet style = null;
    private ArrayList<Attribute> attributes = new ArrayList<>();
    private ArrayList<Element> content = new ArrayList<>();

    private ArrayList<CSSClass> classes;

    public Element(String id, ArrayList<CSSClass> classes, ArrayList<Attribute> attributes, ArrayList<Element> content) {
        this.attributes = attributes;
        this.content = content;
        this.classes = classes;

        if (id != null)
            this.id = id;
    }

    public void put(Element element) {
        content.add(element);
    }

    public void setId(String id) { this.id = id; }

    public String getId() { return id; }

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

    public ArrayList<CSSClass> getClasses() { return classes; }

    public void setClasses(ArrayList<CSSClass> classes) { this.classes = classes; }

}

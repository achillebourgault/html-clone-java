package fr.achillebourgault.achtml.core.elements;

import fr.achillebourgault.achtml.core.attributes.Attribute;
import fr.achillebourgault.achtml.core.attributes.CSSClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class div extends Element {

    public div(String id, ArrayList<CSSClass> classes, ArrayList<Attribute> attributes, ArrayList<Element> content) {
        super(id, classes, attributes, content);
    }

}

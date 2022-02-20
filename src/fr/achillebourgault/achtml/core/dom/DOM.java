package fr.achillebourgault.achtml.core.dom;

import fr.achillebourgault.achtml.core.elements.Element;

import java.util.HashMap;

//for the family
public class DOM {

    public static HashMap<Integer, Element> elements = new HashMap<>();

    //Get element in the DOM
    public static Element getElementById(String id) {
        Element element = null;

        for (Element tmp : elements.values()) {
            if (id.equals(tmp.getId())) {
                element = tmp;
                break;
            }
        }
        return element;
    }

    //Add element to the DOM
    public static void addToDOM(Element element, int zIndex) {
        elements.put(zIndex, element);
    }

    public void render() {
        for (Element elem : elements.values()) {

        }
    }
}

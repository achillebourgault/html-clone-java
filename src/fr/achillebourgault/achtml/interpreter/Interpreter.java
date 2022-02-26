package fr.achillebourgault.achtml.interpreter;

import fr.achillebourgault.achtml.core.attributes.CSSClass;
import fr.achillebourgault.achtml.core.dom.DOM;
import fr.achillebourgault.achtml.core.elements.Element;
import fr.achillebourgault.achtml.core.elements.ElementType;
import fr.achillebourgault.achtml.core.elements.div;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interpreter {

    private Element body = null;

    public Interpreter(String raw) {
        this.body = build(raw);
    }

    private ArrayList<CSSClass> buildClasses(String raw) {
        ArrayList<CSSClass> classes = new ArrayList<>();
        int endParameterIndex = raw.indexOf(">");

        if (raw.contains("class=\"")) {
            int idxStart = raw.indexOf("class=\"") + ("class=\"".length());
            int idxEnd = raw.indexOf('"', raw.indexOf('"') + 1);

            if (idxEnd == -1) {
                //TODO: Throw an error
            }
            String _class = raw.substring(idxStart, idxEnd);
            String[] tmpClasses = _class.split("\\s+");

            for (String tmpClass : tmpClasses) {
                if (tmpClass.contains(" ") || tmpClass.isEmpty())
                    continue;
                classes.add(new CSSClass(tmpClass));
                System.out.println("-> Found [" + tmpClass + "]");
            }

        }
        return classes;
    }

    private Element build(String raw) {
        Element body = null;
        if (raw.startsWith("<div") && raw.endsWith("</div>")) {
            ArrayList<CSSClass> classes = buildClasses(raw);
            body = buildElement(ElementType.DIV, classes);
            String attributes = raw.substring(4, raw.indexOf('>'));

            if (attributes.length() > 0) {
                body = parseAttributes(body, attributes);
            }
            //DOM.addToDOM(newDiv, 0);
        }
        return body;
    }

    private Element buildElement(ElementType div, ArrayList<CSSClass> classes) {
        Element elem;

        elem = new div("testDiv", classes, null, null);

        return elem;
    }

    private Element parseAttributes(Element elem, String attributes) {

        return elem;
    }

    public Element getBody() {
        return body;
    }
}

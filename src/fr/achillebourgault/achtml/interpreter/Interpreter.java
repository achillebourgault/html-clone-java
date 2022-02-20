package fr.achillebourgault.achtml.interpreter;

import fr.achillebourgault.achtml.core.attributes.CSSClass;
import fr.achillebourgault.achtml.core.elements.Element;
import fr.achillebourgault.achtml.core.elements.ElementType;
import fr.achillebourgault.achtml.core.elements.div;

import java.util.Arrays;
import java.util.List;

public class Interpreter {


    public Interpreter(String raw) {
        build(raw);

    }

    private Element build(String raw) {
        Element body = null;
        if (raw.startsWith("<div") && raw.endsWith("</div>")) {
            body = buildElement(ElementType.DIV);
            String attributes = raw.substring(4, raw.indexOf('>'));

            if (attributes.length() > 0) {
                body = parseAttributes(body, attributes);
            }

            List<CSSClass> classes = Arrays.asList(new CSSClass(), new CSSClass());
            div newDiv = new div(classes);
        }
        return body;
    }

    private Element buildElement(ElementType div) {
        List<CSSClass> classes = Arrays.asList(new CSSClass(), new CSSClass());
        Element elem;

        elem = new div(classes);

        return elem;
    }

    private Element parseAttributes(Element elem, String attributes) {

        return elem;
    }
}

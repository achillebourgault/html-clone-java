package fr.achillebourgault.achtml.core.attributes;

import fr.achillebourgault.achtml.core.stylesheet.Stylesheet;

public class CSSLambda {

    private String raw;
    private Stylesheet style;

    public CSSLambda(String raw) {
        this.raw = raw;
        //TODO: generate stylesheet from raw css
    }
}

package fr.achillebourgault.achtml.core.stylesheet;

import java.util.HashMap;

public class Stylesheet {

    public HashMap<String, StyleRule> tags = new HashMap<>();

    public Stylesheet() {

    }

    //Create Stylesheet object from .css file
    public Stylesheet(String filepath) {
        //TODO:
    }

    public HashMap<String, StyleRule> getTags() {
        return tags;
    }

    public void setTags(HashMap<String, StyleRule> tags) {
        this.tags = tags;
    }


}

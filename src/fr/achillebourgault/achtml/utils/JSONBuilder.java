package fr.achillebourgault.achtml.utils;

import java.util.HashMap;
import java.util.Map;

public class JSONBuilder {
    private HashMap<String, Object> params;

    public JSONBuilder(Object mapToConvert) {
        this.params = new HashMap<>();

        if (mapToConvert instanceof Map) {
            for (String dataParam : ((Map<String, ?>) mapToConvert).keySet())
                this.params.put(dataParam, ((Map<String, ?>) mapToConvert).get(dataParam));
        } else {
            TermConsole.print(TermLevel.ERROR, "Object isn't a Map<String, ?>.");
        }
    }

    Object parseValue(Object value) {
        Object res = null;

        if (value instanceof String) {
            String tmp = "\"" + value + "\"";
            res = tmp;
        } else if (value instanceof Integer) {
            int tmp = (int) value;
            res = tmp;
        } else if (value instanceof Float) {
            float tmp = (float) value;
            res = tmp;
        } else if (value instanceof Double) {
            double tmp = (double) value;
            res = tmp;
        } else if (value instanceof Boolean) {
            boolean tmp = (boolean) value;
            res = tmp;
        } else if (value instanceof Map) {
            if (((Map<String, ?>) value).size() == 0) {
                return null;
            } else {
                res = new JSONBuilder(value).export();
            }
        } else {
            if (value != null)
                TermConsole.print(TermLevel.ERROR, "[JSONBuilder] parseError: Unsupported parameter type of " + value + ".");
            else
                TermConsole.print(TermLevel.ERROR, "[JSONBuilder] parseError: Object is null.");
        }
        return res;
    }

    public String export() {
        int buff = 0;
        String res = "{";

        for (String param : params.keySet()) {
            Object value = parseValue(params.get(param));
            buff++;
            if (value == null)
                continue;
            res += "\"" + param + "\":" + value;
            if (buff != params.size())
                res += ",";
        }
        res += "}";
        return res;
    }
}

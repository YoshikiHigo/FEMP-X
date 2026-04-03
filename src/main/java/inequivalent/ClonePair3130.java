package inequivalent;

import java.util.Locale;

public class ClonePair3130 {

    Locale method1(String localeStr) {
        if (localeStr == null || "".equals(localeStr)) {
            return null;
        }
        String[] parts = localeStr.split("_");
        if (parts.length <= 0) {
            return null;
        } else if (parts.length == 1) {
            return new Locale(parts[0]);
        } else if (parts.length == 2) {
            return new Locale(parts[0], parts[1]);
        }
        return new Locale(parts[0], parts[1], parts[2]);
    }

    Locale method2(String localeStr) {
        if ((localeStr == null) || (localeStr.trim().length() == 0) || (localeStr.equals("_"))) {
            return null;
        }
        int index = localeStr.indexOf('_');
        if (index < 0) {
            return new Locale(localeStr);
        }
        String language = localeStr.substring(0, index);
        if (index == localeStr.length()) {
            return new Locale(language);
        }
        localeStr = localeStr.substring(index + 1);
        index = localeStr.indexOf('_');
        if (index < 0) {
            return new Locale(language, localeStr);
        }
        String country = localeStr.substring(0, index);
        if (index == localeStr.length()) {
            return new Locale(language, country);
        }
        localeStr = localeStr.substring(index + 1);
        return new Locale(language, country, localeStr);
    }
}

package equivalent;

import java.util.Locale;
import java.util.StringTokenizer;

public class ClonePair3093 {
    Locale method1(String language) {
        if ((language == null) || (language.length() == 0)) {
            return null;
        }
        final StringTokenizer stt = new StringTokenizer(language, "_", true);
        final String lang = stt.nextToken();
        if (stt.hasMoreTokens()) {
            stt.nextToken();
        }
        if (!stt.hasMoreTokens()) {
            return new Locale(lang);
        }
        String country = stt.nextToken();
        if (country.equals("_")) {
            country = "";
        } else if (stt.hasMoreTokens()) {
            stt.nextToken();
        }
        if (!stt.hasMoreTokens()) {
            return new Locale(lang, country);
        }
        final String variant = stt.nextToken();
        return new Locale(lang, country, variant);
    }

    Locale method2(String localeString) {
        if (localeString != null) {
            String language;
            String country;
            if (localeString.length() == 0) return null;
            int pos = localeString.indexOf('_');
            if (pos == -1) return new Locale(localeString, "", "");
            language = localeString.substring(0, pos);
            localeString = localeString.substring(pos + 1);
            pos = localeString.indexOf('_');
            if (pos == -1) return new Locale(language, localeString, "");
            country = localeString.substring(0, pos);
            localeString = localeString.substring(pos + 1);
            return new Locale(language, country, localeString);
        } else return null;
    }
}

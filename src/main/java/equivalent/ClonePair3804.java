package equivalent;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ClonePair3804 {
    List<Locale> method1(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        List<Locale> locales = new ArrayList<Locale>(4);
        if (variant.length() > 0) {
            locales.add(locale);
        }
        if (country.length() > 0) {
            locales.add(locales.size() == 0 ? locale : new Locale(language, country, ""));
        }
        if (language.length() > 0) {
            locales.add(locales.size() == 0 ? locale : new Locale(language, "", ""));
        }
        return locales;
    }

    List<Locale> method2(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        List<Locale> locales = new ArrayList<Locale>(3);
        if (variant.length() > 0) {
            locales.add(locale);
        }
        if (country.length() > 0) {
            locales.add((locales.size() == 0) ? locale : new Locale(language, country, ""));
        }
        if (language.length() > 0) {
            locales.add((locales.size() == 0) ? locale : new Locale(language, "", ""));
        }
        return locales;
    }
}

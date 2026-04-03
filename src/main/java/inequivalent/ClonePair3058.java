package inequivalent;

public class ClonePair3058 {

    String[] method1(String theParseString, String theSeparator) {
        String[] array = null;
        if (theParseString != null && theSeparator != null) {
            int i = theParseString.lastIndexOf(theSeparator);
            if (i < 0) {
                array = new String[]{theParseString};
            } else {
                array = new String[]{theParseString.substring(0, i), theParseString.substring(i + theSeparator.length())};
            }
        }
        return array;
    }

    String[] method2(String theParseString, String theSeparator) {
        String[] array = null;
        if (theParseString != null && theSeparator != null) {
            int i = theParseString.indexOf(theSeparator);
            if (i < 0) {
                array = new String[]{theParseString};
            } else {
                array = new String[]{theParseString.substring(0, i), theParseString.substring(i + theSeparator.length())};
            }
        }
        return array;
    }
}

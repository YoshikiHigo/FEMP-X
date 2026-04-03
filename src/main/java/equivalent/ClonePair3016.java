package equivalent;

public class ClonePair3016 {
    String[] method1(String str, String delimiter) {
        if (str == null || delimiter == null) return null;
        return str.split(delimiter);
    }

    String[] method2(String strToParse, String seperator) {
        if (strToParse != null && seperator != null) {
            return strToParse.split(seperator);
        }
        return null;
    }
}

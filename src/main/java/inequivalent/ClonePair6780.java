package inequivalent;

public class ClonePair6780 {

    boolean method1(String string1, String string2) {
        if (string1 == null || string1.trim().equals("")) return true;
        return string2 == null || string2.trim().equals("");
    }

    boolean method2(String a1, String a2) {
        if (a1 == null || a2 == null || a1.length() == 0 || a2.length() == 0) {
            return true;
        }
        String stripped_title1 = a1.replaceAll("[\\s,.\\-]", "").toUpperCase();
        String stripped_title2 = a2.replaceAll("[\\s,.\\-]", "").toUpperCase();
        return stripped_title1.equals(stripped_title2);
    }
}

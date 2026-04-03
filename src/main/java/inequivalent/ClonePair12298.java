package inequivalent;

public class ClonePair12298 {

    String method1(String s, String searchFor, String replaceWith) {
        if (searchFor == null || searchFor.length() == 0) return s;
        int startAt = 0;
        int indexFound = s.indexOf(searchFor, startAt);
        while (indexFound != -1) {
            s = s.substring(0, indexFound) + replaceWith + s.substring(indexFound + searchFor.length());
            startAt = indexFound + replaceWith.length();
            indexFound = s.indexOf(searchFor, startAt);
        }
        return s;
    }

    String method2(String aSearch, String aFind, String aReplace) {
        String result = aSearch;
        if (result != null && result.length() > 0) {
            int a = 0;
            int b = 0;
            while (true) {
                a = result.indexOf(aFind, b);
                if (a != -1) {
                    result = result.substring(0, a) + aReplace + result.substring(a + aFind.length());
                    b = a + aReplace.length();
                } else break;
            }
        }
        return result;
    }
}

package equivalent;

public class ClonePair10873 {
    int method1(String string, int end) {
        int start = end;
        if (start >= 1 && string.charAt(start - 1) == '$') return start - 1;
        while ((start != 0) && Character.isUnicodeIdentifierPart(string.charAt(start - 1))) start--;
        if (start >= 2 && string.charAt(start - 1) == '{' && string.charAt(start - 2) == '$') return start - 2;
        return end;
    }

    int method2(String string, int end) {
        int start = end;
        if (start >= 1 && string.charAt(start - 1) == '$') {
            return start - 1;
        }
        while ((start != 0) && Character.isUnicodeIdentifierPart(string.charAt(start - 1))) {
            start--;
        }
        if (start >= 2 && string.charAt(start - 1) == '{' && string.charAt(start - 2) == '$') {
            return start - 2;
        }
        return end;
    }
}

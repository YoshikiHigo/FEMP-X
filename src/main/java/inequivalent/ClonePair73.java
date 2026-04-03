package inequivalent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClonePair73 {

    List<String> method1(String query) {
        List<String> tokens = new LinkedList<String>();
        StringBuffer buffer = new StringBuffer();
        int len = query.length();
        int pos = 0;
        char c;
        while (pos < len) {
            while (pos < len && ((c = query.charAt(pos)) == ' ' || c == '　')) {
                pos++;
            }
            while (pos < len && (c = query.charAt(pos)) != ' ' && c != '　') {
                buffer.append(c);
                pos++;
                if (c == '"' || c == '“') {
                    boolean ok = false;
                    while (!ok) {
                        while (pos < len && (c = query.charAt(pos)) != '"' && c != '”') {
                            buffer.append(c);
                            pos++;
                        }
                        if (pos < len) {
                            buffer.append(c);
                            pos++;
                        }
                        ok = pos >= len || (c = query.charAt(pos)) == ' ' || c == '　';
                    }
                }
            }
            if (buffer.length() > 0) {
                tokens.add(buffer.toString());
                buffer.setLength(0);
            }
        }
        return tokens;
    }

    List<String> method2(String query) {
        boolean inQuote = false;
        int firstNonSpace = query.length() + 1;
        int i = 0;
        ArrayList<String> results = new ArrayList<String>();
        while (i < query.length()) {
            for (; i < query.length(); i++) {
                char c = query.charAt(i);
                if (Character.isSpaceChar(c)) {
                    if (!inQuote) {
                        if (firstNonSpace < i) {
                            String term = query.substring(firstNonSpace, i);
                            results.add(term);
                        }
                        firstNonSpace = query.length() + 1;
                    }
                } else if (c == '"') {
                    firstNonSpace = Math.min(firstNonSpace, i);
                    inQuote = !inQuote;
                } else {
                    firstNonSpace = Math.min(firstNonSpace, i);
                }
            }
        }
        if (firstNonSpace < query.length()) {
            results.add(query.substring(firstNonSpace));
        }
        return results;
    }
}

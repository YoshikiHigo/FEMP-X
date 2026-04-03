package inequivalent;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ClonePair7282 {

    Set<String> method1(String delimited, String delimiter) {
        if (delimited == null || delimited.trim().equals("")) {
            return null;
        }
        Set<String> values = new HashSet<String>();
        String[] rolenamesArray = delimited.split(delimiter);
        for (String s : rolenamesArray) {
            String trimmed = s.trim();
            if (trimmed.length() > 0) {
                values.add(trimmed);
            }
        }
        return values;
    }

    Set<String> method2(String pDataStr, String pDelimiter) {
        Set<String> tokenSet = null;
        if (null != pDataStr && !pDataStr.trim().isEmpty()) {
            String[] tokens = pDataStr.split(pDelimiter);
            tokenSet = new TreeSet<String>();
            for (int i = 0; i < tokens.length; i++) {
                String token = tokens[i].trim();
                if (!token.isEmpty()) {
                    tokenSet.add(token);
                }
            }
        }
        return tokenSet;
    }
}

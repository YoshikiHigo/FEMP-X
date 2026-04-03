package inequivalent;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ClonePair13250 {

    String[] method1(String cmdline) {
        if (cmdline == null) {
            return new String[0];
        }
        char[] chars = cmdline.toCharArray();
        boolean inquote = false;
        ArrayList args = new ArrayList();
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '\"') {
                if (!inquote) {
                    inquote = true;
                    continue;
                } else {
                    args.add(buf.toString());
                    buf = new StringBuffer();
                    inquote = false;
                    continue;
                }
            }
            if (c == ' ' && !inquote) {
                if (buf.length() == 0) continue;
                else {
                    args.add(buf.toString());
                    buf = new StringBuffer();
                    continue;
                }
            }
            buf.append(c);
        }
        if (buf.length() != 0) {
            args.add(buf.toString());
        }
        return (String[]) args.toArray(new String[args.size()]);
    }

    String[] method2(String input) {
        if (input == null || "".equals(input)) {
            return new String[0];
        }
        List<String> tokenList = new ArrayList<String>();
        StringTokenizer tokenizer = new StringTokenizer(input, " ");
        while (tokenizer.hasMoreElements()) {
            boolean quotedToken = false;
            String tokenString = tokenizer.nextToken();
            if (tokenString.startsWith("\"")) {
                quotedToken = true;
                tokenString = tokenString.substring(1);
                if (tokenString.endsWith("\"") && !tokenString.endsWith("\\\"")) {
                    quotedToken = false;
                    tokenString = tokenString.substring(0, tokenString.length() - 1);
                }
            }
            if (quotedToken) {
                boolean getNext = true;
                StringBuffer token = new StringBuffer(tokenString);
                while (getNext) {
                    try {
                        token.append(tokenizer.nextToken("\""));
                        if (!token.toString().endsWith("\\\"")) {
                            getNext = false;
                        }
                    } catch (NoSuchElementException e) {
                        break;
                    }
                }
                tokenString = token.toString();
            }
            tokenList.add(tokenString);
        }
        String[] stringArray = tokenList.toArray(new String[]{});
        return stringArray;
    }
}

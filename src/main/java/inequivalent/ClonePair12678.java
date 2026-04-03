package inequivalent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class ClonePair12678 {

    Collection method1(String searchTerm) {
        ArrayList subterms = new ArrayList();
        StringBuffer subterm = new StringBuffer();
        int len = searchTerm.length();
        char myChar;
        char previousChar = 'a';
        boolean withinQuotes = false;
        for (int i = 0; i < len; ++i) {
            myChar = searchTerm.charAt(i);
            if (myChar == ' ' && withinQuotes) {
                subterm.append(myChar);
            } else if ((myChar == ' ' && !withinQuotes)) {
                subterms.add(subterm.toString());
                subterm.setLength(0);
            } else if (myChar == '"' && i > 0 && i < len - 1 && searchTerm.charAt(i - 1) != ' ' && searchTerm.charAt(i + 1) != ' ') {
                subterm.append(myChar);
            } else if (myChar == '"' && withinQuotes) {
                withinQuotes = false;
            } else if (myChar == '"' && !withinQuotes) {
                withinQuotes = true;
            } else {
                subterm.append(myChar);
            }
            previousChar = myChar;
        }
        subterms.add(subterm.toString());
        return subterms;
    }

    Collection method2(String arg) {
        ArrayList ret = new ArrayList();
        arg = arg.replaceAll("\\s+", " ");
        arg = arg.replaceAll(" =", "=");
        arg = arg.replaceAll(" <", "<");
        arg = arg.replaceAll(" >", ">");
        arg = arg.replaceAll("= ", "=");
        arg = arg.replaceAll("< ", "<");
        arg = arg.replaceAll("> ", ">");
        Vector v = new Vector();
        int pos, p;
        while (true) {
            if ((pos = arg.indexOf(" ")) == -1) pos = arg.length();
            String set = arg.substring(0, pos);
            if ((set.indexOf("/") == -1) && (set.indexOf("=") == -1) && (set.indexOf("<") == -1) && (set.indexOf(">") == -1))
                v.add(set);
            else {
                Vector k = new Vector();
                Vector pt = new Vector();
                while ((p = set.indexOf("/")) != -1) {
                    pt.add(set.substring(0, p));
                    set = set.substring(p + 1);
                }
                int opp;
                String op = "=";
                if ((opp = set.indexOf("=")) != -1) op = "=";
                else if ((opp = set.indexOf("<")) != -1) op = "<";
                else if ((opp = set.indexOf(">")) != -1) op = ">";
                else op = null;
                if (op != null) {
                    pt.add(set.substring(0, set.indexOf(op)));
                    set = set.substring(set.indexOf(op) + 1);
                    k.add(pt);
                    k.add(op);
                    k.add(set);
                    v.add(k);
                } else {
                    pt.add(set);
                    v.addAll(pt);
                }
            }
            if (pos == arg.length()) break;
            arg = arg.substring(pos + 1);
        }
        return v;
    }
}

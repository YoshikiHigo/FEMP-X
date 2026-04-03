package inequivalent;

import java.util.StringTokenizer;

public class ClonePair5689 {

    boolean method1(String value, String compareString, boolean ignoreCase) {
        if (value == null || value.trim().length() == 0) return false;
        if (compareString == null || compareString.trim().length() == 0) return false;
        if (ignoreCase) return value.toLowerCase().indexOf(compareString.toLowerCase()) != -1;
        return value.indexOf(compareString) != -1;
    }

    boolean method2(String answer, String check, boolean checkCase) {
        if (answer == null || answer.length() == 0 || check == null || check.length() == 0) return false;
        StringTokenizer st = new StringTokenizer(check, "|");
        while (st.hasMoreTokens()) {
            if (checkCase ? st.nextToken().equals(answer) : st.nextToken().equalsIgnoreCase(answer)) return true;
        }
        return false;
    }
}

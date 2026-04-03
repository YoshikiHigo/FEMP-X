package inequivalent;

import java.util.StringTokenizer;

public class ClonePair10943 {

    int method1(String name1, String name2) {
        StringTokenizer st1, st2;
        int k = 0;
        if (name1 == null || name2 == null) {
            return 0;
        }
        st1 = new StringTokenizer(name1, ".");
        st2 = new StringTokenizer(name2, ".");
        while (st1.hasMoreTokens() && st2.hasMoreTokens()) {
            if (st1.nextToken().equalsIgnoreCase(st2.nextToken())) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }

    int method2(String source, String match) {
        int count = 0;
        if (source != null && match != null && match.length() > 0) {
            int currPos = 0;
            while (source.length() >= currPos && (currPos = source.indexOf(match, currPos)) > -1) {
                currPos++;
                count++;
            }
        }
        return count;
    }
}

package inequivalent;

import java.util.HashSet;

public class ClonePair7854 {

    boolean method1(String numStr, int numBit_n) {
        if (numStr != null) {
            if (!"".equals(numStr) && numBit_n > 0) {
                return numStr.matches("\\d{" + numBit_n + "}");
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    boolean method2(String pats, int order) {
        if (pats == null) {
            return false;
        }
        String[] tokens = pats.split("-");
        HashSet<String> all = new HashSet<String>();
        int max = 0;
        int min = order * 3;
        for (String t : tokens) {
            if (t.trim().length() == 0) {
                continue;
            }
            String[] numbers = t.split(" ");
            for (String n : numbers) {
                if (n.trim().length() == 0) {
                    continue;
                }
                if (n.trim().equals(",")) {
                    continue;
                }
                all.add(n.trim());
                try {
                    int no = Integer.parseInt(n.trim());
                    if (min > no) {
                        min = no;
                    }
                    if (max < no) {
                        max = no;
                    }
                } catch (Exception e) {
                    return false;
                }
            }
        }
        if (all.size() != order * 3) {
            return false;
        }
        if (min == 0) {
            if (max + 1 != order * 3) {
                return false;
            }
        }
        if (min == 1) {
            return max == order * 3;
        } else {
            return false;
        }
    }
}

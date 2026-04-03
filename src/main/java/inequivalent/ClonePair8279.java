package inequivalent;

import java.util.Arrays;

public class ClonePair8279 {

    boolean method1(String a, String b) {
        if (a == b) return true;
        String aw = a.split(" ", 1)[0];
        String bw = b.split(" ", 1)[0];
        return aw.compareTo(bw) == 0;
    }

    boolean method2(String a, String b) {
        String[] partsA = a.split(", *");
        Arrays.sort(partsA);
        String[] partsB = b.split(", *");
        Arrays.sort(partsB);
        if (partsA.length != partsB.length) {
            return false;
        }
        for (int i = 0; i < partsA.length; i++) {
            if (!partsA[i].equals(partsB[i])) {
                return false;
            }
        }
        return true;
    }
}

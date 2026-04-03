package inequivalent;

import java.util.Vector;

public class ClonePair12919 {

    boolean method1(String fileName, Vector v) {
        for (int i = 0; i < v.size(); i++) {
            String test = (String) v.elementAt(i);
            if (test.compareTo(fileName) == 0) {
                return (true);
            }
        }
        return (false);
    }

    boolean method2(String val, Vector v) {
        System.out.println("isIn val = " + val);
        for (int i = 0; i < v.size(); i++) {
            String nextv = (String) v.elementAt(i);
            if (val.compareTo(nextv) == 0) {
                return true;
            }
        }
        System.out.println("NOT FOUND.");
        return false;
    }
}

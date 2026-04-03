package inequivalent;

import java.util.Comparator;

public class ClonePair139 {

    Double method1(Double[] ar, Comparator<Double> c) {
        int i;
        Double m;
        m = ar[0];
        for (i = 1; i < ar.length; ++i) {
            if (c.compare(m, ar[i]) < 0) m = ar[i];
        }
        return m;
    }

    Double method2(Double[] ar, Comparator<Double> c) {
        int i;
        Double m;
        m = ar[0];
        for (i = 1; i < ar.length; ++i) {
            if (c.compare(m, ar[i]) > 0) m = ar[i];
        }
        return m;
    }
}

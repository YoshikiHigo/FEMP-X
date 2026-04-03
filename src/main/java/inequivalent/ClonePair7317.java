package inequivalent;

import java.util.Iterator;
import java.util.Vector;

public class ClonePair7317 {

    double method1(Vector samples) {
        double mean = 0;
        for (Iterator itr = samples.iterator(); itr.hasNext(); ) {
            double sample = ((Double) itr.next()).doubleValue();
            mean += sample;
        }
        mean /= samples.size();
        return mean;
    }

    double method2(Vector v) {
        if (v.isEmpty()) return Double.NaN;
        double tot = 0.0D;
        for (Object aV : v) {
            tot += (Double) aV;
        }
        return tot;
    }
}

package equivalent;

import java.util.ArrayList;

public class ClonePair8774 {
    double method1(ArrayList<Double> l) {
        double accum = 0d;
        for (int i = 0; i < l.size(); i++) {
            accum += l.get(i);
        }
        return accum / l.size();
    }

    double method2(ArrayList<Double> arr) {
        double total = 0;
        double size = arr.size();
        double mean;
        for (int i = 0; i < arr.size(); i++) {
            total += arr.get(i);
        }
        mean = total / size;
        return (mean);
    }
}

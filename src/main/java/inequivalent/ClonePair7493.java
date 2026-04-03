package inequivalent;

import java.util.List;

public class ClonePair7493 {

    double method1(List<Double> values) {
        if (values == null || values.size() == 0) return 0.0;
        double mean = 0.0;
        for (Double v : values) {
            mean += v;
        }
        if (values.size() > 0) mean /= values.size();
        return mean;
    }

    double method2(List<Double> values) {
        if (values == null || values.size() == 0) return 0.0;
        double max = values.get(0);
        for (Double v : values) {
            max = Math.max(v, max);
        }
        return max;
    }
}

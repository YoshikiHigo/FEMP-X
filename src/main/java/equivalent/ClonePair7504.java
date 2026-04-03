package equivalent;

import java.util.Collections;
import java.util.List;

public class ClonePair7504 {
    double method1(List<Double> values) {
        if (values.size() == 0) return 0.0;
        Collections.sort(values);
        if (values.size() % 2 == 1) {
            return values.get((values.size() + 1) / 2 - 1);
        } else {
            double lower = values.get(values.size() / 2 - 1);
            double upper = values.get(values.size() / 2);
            return (lower + upper) / 2.0;
        }
    }

    double method2(List<Double> values) {
        if (values.size() == 0) return 0.0;
        Collections.sort(values);
        if (values.size() % 2 != 0) {
            return values.get((values.size() + 1) / 2 - 1);
        } else {
            double lower = values.get(values.size() / 2 - 1);
            double upper = values.get(values.size() / 2);
            return (lower + upper) / 2.0;
        }
    }
}

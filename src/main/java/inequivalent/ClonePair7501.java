package inequivalent;

import java.util.List;

public class ClonePair7501 {

    double method1(List<Double> values) {
        double sum = 0.0;
        int cnt = 0;
        if (values.size() == 0) return 0.0;
        for (Double value : values) {
            sum += value;
            cnt++;
        }
        return sum / cnt;
    }

    double method2(List<Double> list) {
        double avg = 0;
        if (list.size() == 0) return 0;
        for (int i = 0; i < list.size(); i++) {
            if (!Double.isNaN(list.get(i)) && !Double.isInfinite(list.get(i))) avg += list.get(i);
        }
        return avg / list.size();
    }
}

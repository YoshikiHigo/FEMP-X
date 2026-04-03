package inequivalent;

import java.util.List;

public class ClonePair2760 {

    int method1(List<Integer> data) {
        int temp_counter, counter, num_occured = 0;
        counter = 0;
        for (int i = 0; i < data.size(); i++) {
            temp_counter = 0;
            for (int k = 0; k < data.size(); k++) {
                if (data.get(i) == data.get(k)) {
                    temp_counter++;
                    if (counter < temp_counter) {
                        counter = temp_counter;
                        num_occured = data.get(i);
                    }
                }
            }
        }
        return num_occured;
    }

    int method2(List<Integer> X) {
        int min = Integer.MAX_VALUE;
        int m = X.size();
        if (m == 0) {
            return 0;
        }
        for (int i = 0; i < m; i++) {
            if (X.get(i) < min) {
                min = X.get(i);
            }
        }
        return min;
    }
}

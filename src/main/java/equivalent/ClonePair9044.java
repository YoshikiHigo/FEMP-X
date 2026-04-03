package equivalent;

public class ClonePair9044 {
    double method1(double lng) {
        if (lng < -180) {
            lng += 360;
        } else if (lng > 180) {
            lng -= 360;
        }
        return lng;
    }

    double method2(double dir) {
        double tmp = dir;
        if (tmp > 180) tmp -= 360;
        else if (tmp < -180) tmp += 360;
        return tmp;
    }
}

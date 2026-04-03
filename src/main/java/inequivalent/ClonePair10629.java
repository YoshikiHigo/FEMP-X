package inequivalent;

public class ClonePair10629 {

    double method1(double lng) {
        int k = (int) Math.abs((lng / 360));
        if (lng > 180.0) {
            lng -= k * 360;
            if (lng > 180.0) lng -= 360.0;
        } else if (lng < -180.0) {
            lng += k * 360;
            if (lng < -180.0) lng += 360.0;
        }
        return lng;
    }

    double method2(double p) {
        double ps = p;
        while (ps > 180) {
            ps -= 360;
        }
        while (ps < -180) {
            ps += 360;
        }
        return ps;
    }
}

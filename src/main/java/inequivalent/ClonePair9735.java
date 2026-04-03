package inequivalent;

public class ClonePair9735 {

    double method1(double p) {
        while (p > Math.PI) p = p - 2. * Math.PI;
        while (p < -Math.PI) p = p + 2. * Math.PI;
        return p;
    }

    double method2(double angle) {
        if (angle < -Math.PI) {
            int _180s = ((int) (-angle / (Math.PI)));
            if (_180s % 2 == 1) {
                _180s++;
            }
            double remove = _180s * (Math.PI);
            return angle + remove;
        } else if (angle > Math.PI) {
            int _180s = ((int) (angle / (Math.PI)));
            if (_180s % 2 == 1) {
                _180s++;
            }
            double remove = _180s * (Math.PI);
            return angle - remove;
        } else {
            return angle;
        }
    }
}

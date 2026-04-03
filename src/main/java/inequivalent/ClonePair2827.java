package inequivalent;

public class ClonePair2827 {

    double method1(String _data) {
        double t = 0D;
        String data = _data;
        if (data.indexOf('d') > 0) {
            data = _data.replace('d', 'E');
        }
        if (data.indexOf('D') > 0) {
            data = _data.replace('D', 'E');
        }
        try {
            t = Double.parseDouble(data);
        } catch (final NumberFormatException e) {
        }
        return t;
    }

    double method2(String s) {
        int p = s.indexOf(".");
        if (p >= 0) {
            p = s.indexOf(".", p + 1);
        }
        if (p >= 0) {
            s = s.substring(0, p);
        }
        double d = 0.0;
        try {
            d = Double.parseDouble(s);
        } catch (NumberFormatException e) {
        }
        return d;
    }
}

package inequivalent;

public class ClonePair2697 {

    double method1(String s) {
        if (s == null || s.length() == 0) return 0;
        else return Double.valueOf(s).doubleValue();
    }

    double method2(String e) {
        if (e == null || e.length() == 0) return 0.0;
        if (e.charAt(0) == 'e' || e.charAt(0) == 'E') return Double.parseDouble("1" + e);
        else return Double.parseDouble(e);
    }
}

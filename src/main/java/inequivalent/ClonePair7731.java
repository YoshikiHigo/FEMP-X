package inequivalent;

import java.util.Date;

public class ClonePair7731 {

    boolean method1(Object value_frm, Object value_db) {
        if (value_frm == value_db) return true;
        if (value_frm == null) return false;
        if ((value_frm instanceof Date d1) && (value_db instanceof Date d2)) {
            return (d1.getTime() / 1000) == (d2.getTime() / 1000);
        }
        return value_frm.equals(value_db);
    }

    boolean method2(Object a, Object b) {
        if (a == b) return true;
        if (a == null || b == null) return false;
        if (a instanceof Number aa && b instanceof Number bb) {
            double diff = Math.abs(aa.doubleValue() - bb.doubleValue());
            return diff < 0.00001;
        }
        return a.equals(b);
    }
}

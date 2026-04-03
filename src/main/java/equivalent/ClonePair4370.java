package equivalent;

import java.util.Date;

public class ClonePair4370 {
    boolean method1(Date d1, Date d2) {
        if (d1 != null && d2 == null) {
            return false;
        }
        if (d1 == null && d2 != null) {
            return false;
        }
        if (d1 != null) {
            if (d2 == null) {
                return false;
            }
            return (d1.compareTo(d2) == 0);
        }
        return true;
    }

    boolean method2(Date data1, Date data2) {
        if (data1 == null && data2 == null) return true;
        if ((data1 != null && data2 == null) || (data1 == null && data2 != null)) return false;
        return (data1.compareTo(data2) == 0);
    }
}

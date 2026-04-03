package inequivalent;

public class ClonePair9828 {

    int method1(String va, String vb) {
        int i, na, nb;
        int a_i, b_i;
        String a_s, b_s;
        String[] a, b;
        if (va == null && vb == null) return 0;
        if (va == null) return -1;
        if (vb == null) return 1;
        a = va.split("\\.");
        b = vb.split("\\.");
        na = a.length;
        nb = b.length;
        if (na < nb) {
            String[] y = new String[nb];
            String zero = "0";
            i = 0;
            for (; i < na; ++i) y[i] = a[i];
            for (; i < nb; ++i) y[i] = zero;
            a = y;
        }
        if (nb < na) {
            String[] y = new String[na];
            String zero = "0";
            i = 0;
            for (; i < nb; ++i) y[i] = b[i];
            for (; i < na; ++i) y[i] = zero;
            b = y;
        }
        na = a.length;
        nb = b.length;
        for (i = 0; i < na; ++i) {
            a_s = a[i];
            b_s = b[i];
            try {
                a_i = Integer.parseInt(a_s);
                b_i = Integer.parseInt(b_s);
                if (a_i < b_i) {
                    return -(i + 1);
                }
                if (a_i > b_i) {
                    return (i + 1);
                }
            } catch (Exception e) {
                int c = a_s.compareTo(b_s);
                if (c < 0) {
                    return -(i + 1);
                }
                if (c > 0) {
                    return (i + 1);
                }
            }
        }
        return 0;
    }

    int method2(String str1, String str2) {
        int result = 0;
        if ((str1 != null) & (str2 != null)) {
            result = str1.compareTo(str2);
            if (result > 0) {
                result = 1;
            } else if (result < 0) {
                result = -1;
            }
        } else {
            if ((str1 == null) & (str2 == null)) {
                result = 0;
            } else {
                if (str1 == null) {
                    result = -1;
                } else {
                    result = 1;
                }
            }
        }
        return result;
    }
}

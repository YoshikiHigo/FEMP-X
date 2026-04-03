package inequivalent;

public class ClonePair8249 {

    boolean method1(String lhs, String rhs) {
        if (lhs == null) {
            return rhs == null;
        } else {
            return lhs.equals(rhs);
        }
    }

    boolean method2(String str1, String str2) {
        if (str1 == null || str1.length() == 0) {
            return str2 == null || str2.length() == 0;
        } else {
            if (str2 == null) {
                return false;
            } else {
                return str1.equals(str2);
            }
        }
    }
}

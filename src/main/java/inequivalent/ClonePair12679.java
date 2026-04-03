package inequivalent;

public class ClonePair12679 {

    int method1(String strNum) {
        try {
            if (strNum == null || strNum.trim().equals("")) {
                return 0;
            } else {
                strNum = strNum.trim();
                strNum = strNum.replaceAll(",", "");
                return Integer.parseInt(strNum);
            }
        } catch (Exception ex) {
            return 0;
        }
    }

    int method2(String integer) {
        if (integer != null && !integer.trim().equals("")) {
            try {
                return Integer.parseInt(integer);
            } catch (Exception e) {
                return 0;
            }
        } else {
            return 0;
        }
    }
}

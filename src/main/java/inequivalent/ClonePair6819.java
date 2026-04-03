package inequivalent;

import java.util.Vector;

public class ClonePair6819 {

    int[] method1(String yyyy_mm_dd) {
        try {
            final int ye = yyyy_mm_dd.indexOf('-');
            if (ye < 0) {
                return null;
            }
            int yyyy = Integer.parseInt(yyyy_mm_dd.substring(0, ye));
            final int ms = ye + 1;
            final int me = yyyy_mm_dd.indexOf('-', ms);
            if (me < 0) {
                return null;
            }
            final int mm = Integer.parseInt(yyyy_mm_dd.substring(ms, me));
            final int ds = me + 1;
            int de = yyyy_mm_dd.length();
            if (yyyy_mm_dd.endsWith("BC")) {
                de -= 2;
                yyyy = -yyyy;
            } else if (yyyy_mm_dd.endsWith("AD")) {
                de -= 2;
            }
            final int dd = Integer.parseInt(yyyy_mm_dd.substring(ds, de));
            return new int[]{yyyy, mm, dd};
        } catch (NumberFormatException e) {
            return null;
        }
    }

    int[] method2(String perm) {
        int state = 0;
        StringBuffer numBuf = new StringBuffer();
        Vector mapping = new Vector();
        Integer firstNum = null;
        Integer prevNum = null;
        Integer num = null;
        for (int i = 0; i < perm.length(); i++) {
            switch (perm.charAt(i)) {
                case ' ':
                case ',':
                case '\t':
                    if (state == 2) {
                        state = 1;
                        num = Integer.valueOf(numBuf.toString());
                        if (num.intValue() == 0) {
                            return null;
                        }
                        if ((mapping.size() >= num.intValue() && mapping.elementAt(num.intValue() - 1) != null) || num.equals(prevNum)) {
                            return null;
                        }
                        if (prevNum != null) {
                            if (mapping.size() < prevNum.intValue()) {
                                mapping.setSize(prevNum.intValue());
                            }
                            mapping.setElementAt(num, prevNum.intValue() - 1);
                        } else {
                            firstNum = num;
                        }
                        prevNum = num;
                        numBuf.setLength(0);
                    }
                    break;
                case '(':
                    if (state == 0) {
                        state = 1;
                    } else if (state == 4) {
                        state = 5;
                    } else {
                        return null;
                    }
                    break;
                case ')':
                    if (state == 1) {
                        state = 6;
                    } else if (state == 2) {
                        state = 4;
                        num = Integer.valueOf(numBuf.toString());
                        if (num.intValue() == 0) {
                            return null;
                        }
                        if ((mapping.size() >= num.intValue() && mapping.elementAt(num.intValue() - 1) != null) || num.equals(prevNum)) {
                            return null;
                        }
                        if (prevNum != null) {
                            if (mapping.size() < prevNum.intValue()) {
                                mapping.setSize(prevNum.intValue());
                            }
                            mapping.setElementAt(num, prevNum.intValue() - 1);
                        } else {
                            firstNum = num;
                        }
                        if (mapping.size() < num.intValue()) {
                            mapping.setSize(num.intValue());
                        }
                        mapping.setElementAt(firstNum, num.intValue() - 1);
                        firstNum = null;
                        prevNum = null;
                        numBuf.setLength(0);
                    } else if (state == 3) {
                        state = 4;
                    } else {
                        return null;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    if (state == 1 || state == 2 || state == 3 || state == 5) {
                        state = 2;
                        numBuf.append(perm.charAt(i));
                    } else {
                        return null;
                    }
                    break;
                default:
                    return null;
            }
        }
        if (state == 4 || state == 6) {
            int[] retval = new int[mapping.size()];
            for (int i = 0; i < mapping.size(); i++) {
                Integer image = (Integer) mapping.elementAt(i);
                if (image == null) {
                    retval[i] = i + 1;
                } else {
                    retval[i] = image.intValue();
                }
            }
            return retval;
        }
        return null;
    }
}

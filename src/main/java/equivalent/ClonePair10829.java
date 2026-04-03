package equivalent;

public class ClonePair10829 {
    String method1(int n, boolean upperCase) {
        StringBuffer buf = new StringBuffer();
        while (n >= 1000) {
            buf.append("M");
            n -= 1000;
        }
        if (n >= 900) {
            buf.append("CM");
            n -= 900;
        }
        if (n >= 500) {
            buf.append("D");
            while (n >= 600) {
                buf.append("C");
                n -= 100;
            }
            n -= 500;
        }
        if (n >= 400) {
            buf.append("CD");
            n -= 400;
        }
        while (n >= 100) {
            buf.append("C");
            n -= 100;
        }
        if (n >= 90) {
            buf.append("XC");
            n -= 90;
        }
        if (n >= 50) {
            buf.append("L");
            while (n >= 60) {
                buf.append("X");
                n -= 10;
            }
            n -= 50;
        }
        if (n >= 40) {
            buf.append("XL");
            n -= 40;
        }
        while (n >= 10) {
            buf.append("X");
            n -= 10;
        }
        switch (n) {
            case 1:
                buf.append("I");
                break;
            case 2:
                buf.append("II");
                break;
            case 3:
                buf.append("III");
                break;
            case 4:
                buf.append("IV");
                break;
            case 5:
                buf.append("V");
                break;
            case 6:
                buf.append("VI");
                break;
            case 7:
                buf.append("VII");
                break;
            case 8:
                buf.append("VIII");
                break;
            case 9:
                buf.append("IX");
                break;
        }
        String val = buf.toString();
        if (upperCase) {
            return val;
        } else {
            return val.toLowerCase();
        }
    }

    String method2(int value, boolean isUpperCase) {
        char[] fiveLetterUpper = {'V', 'L', 'D'};
        char[] unitLetterUpper = {'I', 'X', 'C', 'M'};
        char[] fiveLetterLower = {'v', 'l', 'd'};
        char[] unitLetterLower = {'i', 'x', 'c', 'm'};
        char[] fiveLetter = isUpperCase ? fiveLetterUpper : fiveLetterLower;
        char[] unitLetter = isUpperCase ? unitLetterUpper : unitLetterLower;
        int[] divisor = {10, 10, 10, 1000000};
        String s = "";
        for (int group = 0; value > 0; group++) {
            int remdr = value % divisor[group];
            value = value / divisor[group];
            StringBuilder t;
            if (group == 3) {
                t = new StringBuilder(remdr);
                for (int j = 0; j < remdr; j++) {
                    t.append(unitLetter[group]);
                }
            } else {
                t = new StringBuilder(3);
                switch (remdr) {
                    case 0:
                        break;
                    case 1:
                        t.append(unitLetter[group]);
                        break;
                    case 2:
                        t.append(unitLetter[group]);
                        t.append(unitLetter[group]);
                        break;
                    case 3:
                        t.append(unitLetter[group]);
                        t.append(unitLetter[group]);
                        t.append(unitLetter[group]);
                        break;
                    case 4:
                        t.append(unitLetter[group]);
                        t.append(fiveLetter[group]);
                        break;
                    case 5:
                        t.append(fiveLetter[group]);
                        break;
                    case 6:
                        t.append(fiveLetter[group]);
                        t.append(unitLetter[group]);
                        break;
                    case 7:
                        t.append(fiveLetter[group]);
                        t.append(unitLetter[group]);
                        t.append(unitLetter[group]);
                        break;
                    case 8:
                        t.append(fiveLetter[group]);
                        t.append(unitLetter[group]);
                        t.append(unitLetter[group]);
                        t.append(unitLetter[group]);
                        break;
                    case 9:
                        t.append(unitLetter[group]);
                        t.append(unitLetter[group + 1]);
                        break;
                }
            }
            s = t + s;
        }
        return s;
    }
}

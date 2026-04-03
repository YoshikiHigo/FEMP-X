package equivalent;

public class ClonePair8937 {
    int method1(String s, String match, int minChars, boolean acceptTrailing) {
        if (s.charAt(0) != match.charAt(0)) return -1;
        if (minChars == -1) minChars = match.length();
        int sSz = s.length();
        if (sSz < minChars) return -1;
        int mSz = match.length();
        int sIx = 0;
        for (int mIx = 0; mIx < mSz; sIx++, mIx++) {
            while (sIx < sSz && (s.charAt(sIx) == ' ' || s.charAt(sIx) == '_')) sIx++;
            if (sIx >= sSz || s.charAt(sIx) != match.charAt(mIx))
                return mIx >= minChars && (acceptTrailing || sIx >= sSz) && (sIx >= sSz || s.charAt(sIx - 1) == ' ') ? sIx : -1;
        }
        return sIx >= sSz || acceptTrailing || s.charAt(sIx) == ' ' ? sIx : -1;
    }

    int method2(String s, String match, int minChars, boolean acceptTrailing) {
        if (s.charAt(0) != match.charAt(0)) {
            return -1;
        }
        if (minChars == -1) {
            minChars = match.length();
        }
        final int sSz = s.length();
        if (sSz < minChars) {
            return -1;
        }
        final int mSz = match.length();
        int sIx = 0;
        for (int mIx = 0; mIx < mSz; sIx++, mIx++) {
            while (sIx < sSz && (s.charAt(sIx) == ' ' || s.charAt(sIx) == '_')) {
                sIx++;
            }
            if (sIx >= sSz || s.charAt(sIx) != match.charAt(mIx)) {
                return mIx >= minChars && (acceptTrailing || sIx >= sSz) && (sIx >= sSz || s.charAt(sIx - 1) == ' ') ? sIx : -1;
            }
        }
        return sIx >= sSz || acceptTrailing || s.charAt(sIx) == ' ' ? sIx : -1;
    }
}

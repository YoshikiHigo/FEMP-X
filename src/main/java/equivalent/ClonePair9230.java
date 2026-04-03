package equivalent;

public class ClonePair9230 {
    int method1(String pString, int pStartIndex, String pChars) {
        int i = pStartIndex;
        while (i < pString.length() && pChars.indexOf(pString.charAt(i)) >= 0) {
            i++;
        }
        return i;
    }

    int method2(String s_, int currentPos_, String delim_) {
        int len_ = s_.length();
        while (currentPos_ < len_ && delim_.indexOf(s_.charAt(currentPos_)) >= 0) currentPos_++;
        return currentPos_;
    }
}

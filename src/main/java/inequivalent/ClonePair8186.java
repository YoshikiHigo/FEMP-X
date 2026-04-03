package inequivalent;

public class ClonePair8186 {

    int method1(String text, int textlen, int ind) {
        int c;
        while (ind < textlen && ((c = text.charAt(ind)) == ' ' || c == '\t')) ind++;
        return ind;
    }

    int method2(String sx, int len, int current) {
        while (current < len) {
            char c = sx.charAt(current);
            if (c <= 32) current++;
            else break;
        }
        return current;
    }
}

package equivalent;

public class ClonePair4052 {
    char method1(String str) {
        char ch;
        int state = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            switch (state) {
                case 0:
                    if (ch == '&') state = 1;
                    break;
                case 1:
                    if (ch != '&') return ch;
                    state = 0;
                    break;
            }
        }
        return '$';
    }

    char method2(String string) {
        int index = 0;
        final int length = string.length();
        do {
            while ((index < length) && (string.charAt(index) != '&')) {
                index++;
            }
            if (++index >= length) {
                return '\0';
            }
            if (string.charAt(index) != '&') {
                return string.charAt(index);
            }
            index++;
        }
        while (index < length);
        return '\0';
    }
}

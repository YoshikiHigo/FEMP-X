package equivalent;

public class ClonePair6688 {
    int method1(int ch) {
        if ((ch >= 'A') && (ch <= 'Z')) {
            return ch - 'A';
        } else if ((ch >= 'a') && (ch <= 'z')) {
            return ch - 'a' + 26;
        } else if ((ch >= '0') && (ch <= '9')) {
            return ch - '0' + 52;
        } else {
            switch (ch) {
                case '=':
                    return 65;
                case '+':
                    return 62;
                case '/':
                    return 63;
                default:
                    return -1;
            }
        }
    }

    int method2(int octet) {
        if (octet >= 'A' && octet <= 'Z') {
            octet = octet - 'A';
        } else if (octet >= 'a' && octet <= 'z') {
            octet = (octet - 'a') + 26;
        } else if (octet >= '0' && octet <= '9') {
            octet = (octet - '0') + 52;
        } else if (octet == '+') {
            octet = 62;
        } else if (octet == '/') {
            octet = 63;
        } else if (octet == '=') {
            octet = 65;
        } else {
            octet = -1;
        }
        return octet;
    }
}

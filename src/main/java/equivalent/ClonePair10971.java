package equivalent;

public class ClonePair10971 {
    byte method1(char ch) {
        switch (ch) {
            case '0':
                return 0x00;
            case '1':
                return 0x01;
            case '2':
                return 0x02;
            case '3':
                return 0x03;
            case '4':
                return 0x04;
            case '5':
                return 0x05;
            case '6':
                return 0x06;
            case '7':
                return 0x07;
            case '8':
                return 0x08;
            case '9':
                return 0x09;
            case 'a':
            case 'A':
                return 0x0A;
            case 'b':
            case 'B':
                return 0x0B;
            case 'c':
            case 'C':
                return 0x0C;
            case 'd':
            case 'D':
                return 0x0D;
            case 'e':
            case 'E':
                return 0x0E;
            case 'f':
            case 'F':
                return 0x0F;
        }
        return 0x00;
    }

    byte method2(char c) {
        if (c >= '0' && c <= '9') return (byte) (c - '0');
        if (c >= 'a' && c <= 'f') return (byte) ((c - 'a') + 10);
        if (c >= 'A' && c <= 'F') return (byte) ((c - 'A') + 10);
        return 0;
    }
}

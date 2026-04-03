package equivalent;

public class ClonePair8723 {
    char method1(int value) {
        value &= 0xf;
        switch (value) {
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            case 15:
                return 'F';
            default:
                return (char) ('0' + value);
        }
    }

    char method2(int b) {
        char rtnVal = ' ';
        switch ((byte) (b & 0x0F)) {
            case 0:
                rtnVal = '0';
                break;
            case 1:
                rtnVal = '1';
                break;
            case 2:
                rtnVal = '2';
                break;
            case 3:
                rtnVal = '3';
                break;
            case 4:
                rtnVal = '4';
                break;
            case 5:
                rtnVal = '5';
                break;
            case 6:
                rtnVal = '6';
                break;
            case 7:
                rtnVal = '7';
                break;
            case 8:
                rtnVal = '8';
                break;
            case 9:
                rtnVal = '9';
                break;
            case 10:
                rtnVal = 'A';
                break;
            case 11:
                rtnVal = 'B';
                break;
            case 12:
                rtnVal = 'C';
                break;
            case 13:
                rtnVal = 'D';
                break;
            case 14:
                rtnVal = 'E';
                break;
            case 15:
                rtnVal = 'F';
        }
        return rtnVal;
    }
}

package inequivalent;

public class ClonePair8115 {

    String method1(int singIndex, String expiression) {
        StringBuffer tempBuffer = new StringBuffer();
        for (int i = singIndex - 1; i > -1; i--) {
            char temp = expiression.charAt(i);
            if (Character.isDigit(temp) || temp == '.') {
                tempBuffer.insert(0, temp);
            } else {
                if (temp == '-' && (i == 0 || !Character.isDigit(expiression.charAt(i - 1)))) {
                    tempBuffer.insert(0, temp);
                } else {
                    break;
                }
            }
        }
        return tempBuffer.toString();
    }

    String method2(int singIndex, String expiression) {
        StringBuffer tempBuffer = new StringBuffer();
        for (int i = singIndex - 1; i > -1; i--) {
            char temp = expiression.charAt(i);
            if (temp == ' ') {
                continue;
            }
            if (Character.isDigit(temp) || temp == '.') {
                tempBuffer.insert(0, temp);
            } else {
                if (temp == '-' && (i == 0 || !Character.isDigit(expiression.charAt(i - 1)))) {
                    tempBuffer.insert(0, temp);
                } else {
                    break;
                }
            }
        }
        return tempBuffer.toString();
    }
}

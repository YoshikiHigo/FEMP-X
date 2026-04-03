package inequivalent;

public class ClonePair8085 {

    String method1(int singIndex, String expiression) {
        StringBuffer tempBuffer = new StringBuffer();
        for (int i = singIndex + 1; i < expiression.length(); i++) {
            char temp = expiression.charAt(i);
            if (temp == ' ') {
                continue;
            }
            if (i == singIndex + 1 && temp == '-') {
                tempBuffer.append(temp);
                continue;
            }
            if (Character.isDigit(temp) || temp == '.') {
                tempBuffer.append(temp);
            } else {
                break;
            }
        }
        return tempBuffer.toString();
    }

    String method2(int singIndex, String expiression) {
        StringBuffer tempBuffer = new StringBuffer();
        for (int i = singIndex + 1; i < expiression.length(); i++) {
            char temp = expiression.charAt(i);
            if (i == singIndex + 1 && temp == '-') {
                tempBuffer.append(temp);
                continue;
            }
            if (Character.isDigit(temp) || temp == '.') {
                tempBuffer.append(temp);
            } else {
                break;
            }
        }
        return tempBuffer.toString();
    }
}

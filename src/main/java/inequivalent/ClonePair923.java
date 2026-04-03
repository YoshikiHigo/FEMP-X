package inequivalent;

public class ClonePair923 {

    String method1(byte[] data, int dataIndex) {
        byte[] temp = new byte[dataIndex];
        System.arraycopy(data, 0, temp, 0, temp.length);
        int k = 0;
        for (int i = 0; i < temp.length; i++) {
            if ((temp[i] >= 32)) temp[k++] = temp[i];
        }
        return new String(temp, 0, k);
    }

    String method2(byte[] buffer, int length) {
        char[] formatBuffer = new char[length];
        int invalidChar = 0;
        for (int idx = 0; idx < length; idx++) {
            if ((buffer[idx] >= 48 && buffer[idx] <= 122) || (buffer[idx] == 32) || (buffer[idx] == 30)) {
                formatBuffer[idx - invalidChar] = (char) buffer[idx];
            } else invalidChar++;
        }
        String retStr = new String(formatBuffer, 0, (length - invalidChar));
        return retStr;
    }
}

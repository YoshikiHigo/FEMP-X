package equivalent;

public class ClonePair13122 {
    byte[] method1(String hexData) {
        byte[] result = new byte[(hexData.length() + 1) / 2];
        String hexNumber = null;
        int stringOffset = 0;
        int byteOffset = 0;
        while (stringOffset < hexData.length()) {
            hexNumber = hexData.substring(stringOffset, stringOffset + 2);
            stringOffset += 2;
            result[byteOffset++] = (byte) Integer.parseInt(hexNumber, 16);
        }
        return result;
    }

    byte[] method2(String digester) {
        byte[] ret = new byte[digester.length() / 2];
        int conta = 0;
        String app;
        for (int i = 0; i < digester.length(); ) {
            app = digester.substring(i, i + 2);
            int car = Integer.parseInt(app, 16);
            if (car >= 128) car -= 256;
            ret[conta] = (byte) car;
            i += 2;
            conta++;
        }
        return ret;
    }
}

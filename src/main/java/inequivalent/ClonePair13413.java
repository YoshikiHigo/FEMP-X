package inequivalent;

public class ClonePair13413 {

    byte[] method1(String csHex) {
        byte[] arrByteValue = new byte[csHex.length() / 2];
        for (int i = 0, j = 0; i < csHex.length(); j++) {
            String csDigit = "0x" + csHex.charAt(i++) + csHex.charAt(i++);
            int nVal = Integer.decode(csDigit).intValue();
            arrByteValue[j] = (byte) nVal;
        }
        return arrByteValue;
    }

    byte[] method2(String iStr) {
        byte[] outArr = new byte[iStr.length() / 2];
        for (int i = 0; i < iStr.length(); i += 2) {
            String hex = iStr.substring(i, i + 2);
            byte b = (byte) (Integer.parseInt(hex, 16) & 0xFF);
            outArr[i / 2] = b;
        }
        return outArr;
    }
}

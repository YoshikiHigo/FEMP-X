package equivalent;

public class ClonePair7531 {
    int method1(String sBinHex, byte[] data, int nSrcPos, int nDstPos, int nNumOfBytes) {
        int nStrLen = sBinHex.length();
        int nAvailBytes = (nStrLen - nSrcPos) >> 1;
        if (nAvailBytes < nNumOfBytes) nNumOfBytes = nAvailBytes;
        int nOutputCapacity = data.length - nDstPos;
        if (nNumOfBytes > nOutputCapacity) nNumOfBytes = nOutputCapacity;
        int nResult = 0;
        for (int nI = 0; nI < nNumOfBytes; nI++) {
            byte bActByte = 0;
            boolean blConvertOK = true;
            for (int nJ = 0; nJ < 2; nJ++) {
                bActByte <<= 4;
                char cActChar = sBinHex.charAt(nSrcPos++);
                if ((cActChar >= 'a') && (cActChar <= 'f')) bActByte |= (byte) (cActChar - 'a') + 10;
                else if ((cActChar >= '0') && (cActChar <= '9')) bActByte |= (byte) (cActChar - '0');
                else blConvertOK = false;
            }
            if (blConvertOK) {
                data[nDstPos++] = bActByte;
                nResult++;
            }
        }
        return nResult;
    }

    int method2(String hex, byte[] data, int srcofs, int dstofs, int len) {
        final int strlen = hex.length();
        int availBytes = (strlen - srcofs) >> 1;
        if (availBytes < len) {
            len = availBytes;
        }
        final int outputCapacity = data.length - dstofs;
        if (len > outputCapacity) {
            len = outputCapacity;
        }
        final int dstofsBak = dstofs;
        for (int i = 0; i < len; i++) {
            byte abyte = 0;
            boolean convertOK = true;
            for (int j = 0; j < 2; j++) {
                abyte <<= 4;
                char cActChar = hex.charAt(srcofs++);
                if ((cActChar >= 'a') && (cActChar <= 'f')) {
                    abyte |= (byte) (cActChar - 'a') + 10;
                } else {
                    if ((cActChar >= '0') && (cActChar <= '9')) {
                        abyte |= (byte) (cActChar - '0');
                    } else {
                        convertOK = false;
                    }
                }
            }
            if (convertOK) {
                data[dstofs++] = abyte;
            }
        }
        return (dstofs - dstofsBak);
    }
}

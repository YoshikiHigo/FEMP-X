package equivalent;

public class ClonePair10051 {
    int method1(byte[] arrbtData, int iStartPos, int iLength) {
        int iResult = 0;
        if (iLength > 4) {
            iLength = 4;
        }
        for (int iIdx = iStartPos + iLength - 1; iIdx >= iStartPos; iIdx--) {
            iResult = (iResult << 8) | (((int) arrbtData[iIdx]) & 0xFF);
        }
        return iResult;
    }

    int method2(byte[] byteArray, int offset, int len) {
        int val = 0;
        len = Math.min(len, 4);
        for (int i = (len - 1); i >= 0; i--) {
            val <<= 8;
            val |= (byteArray[offset + i] & 0x00FF);
        }
        return val;
    }
}

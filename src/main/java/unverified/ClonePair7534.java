package unverified;

public class ClonePair7534 {

    int method1(String sHex,byte[] data,int nSrcOfs,int nDstOfs,int nLen){
      int nI, nJ, nStrLen, nAvailBytes, nDstOfsBak;
      byte bActByte;
      boolean blConvertOK;
      nStrLen=sHex.length();
      nAvailBytes=(nStrLen - nSrcOfs) >> 1;
      if (nAvailBytes < nLen) {
        nLen=nAvailBytes;
      }
      int nOutputCapacity=data.length - nDstOfs;
      if (nLen > nOutputCapacity) {
        nLen=nOutputCapacity;
      }
      nDstOfsBak=nDstOfs;
      for (nI=0; nI < nLen; nI++) {
        bActByte=0;
        blConvertOK=true;
        for (nJ=0; nJ < 2; nJ++) {
          bActByte<<=4;
          char cActChar=sHex.charAt(nSrcOfs++);
          if ((cActChar >= 'a') && (cActChar <= 'f')) {
            bActByte|=(byte)(cActChar - 'a') + 10;
          }
     else {
            if ((cActChar >= '0') && (cActChar <= '9')) {
              bActByte|=(byte)(cActChar - '0');
            }
     else {
              blConvertOK=false;
            }
          }
        }
        if (blConvertOK) {
          data[nDstOfs++]=bActByte;
        }
      }
      return (nDstOfs - nDstOfsBak);
    }

    int method2(String hex,byte[] data,int srcofs,int dstofs,int len){
      final int strlen=hex.length();
      int availBytes=(strlen - srcofs) >> 1;
      if (availBytes < len) {
        len=availBytes;
      }
      final int outputCapacity=data.length - dstofs;
      if (len > outputCapacity) {
        len=outputCapacity;
      }
      final int dstofsBak=dstofs;
      for (int i=0; i < len; i++) {
        byte abyte=0;
        boolean convertOK=true;
        for (int j=0; j < 2; j++) {
          abyte<<=4;
          char cActChar=hex.charAt(srcofs++);
          if ((cActChar >= 'a') && (cActChar <= 'f')) {
            abyte|=(byte)(cActChar - 'a') + 10;
          }
     else {
            if ((cActChar >= '0') && (cActChar <= '9')) {
              abyte|=(byte)(cActChar - '0');
            }
     else {
              convertOK=false;
            }
          }
        }
        if (convertOK) {
          data[dstofs++]=abyte;
        }
      }
      return (dstofs - dstofsBak);
    }
}

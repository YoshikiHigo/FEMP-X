package all;

public class ClonePair1169 {

    String method1(byte[] buf){
      StringBuffer sbuff=new StringBuffer();
      for (int i=0; i < buf.length; i++) {
        int b=buf[i];
        if (b < 0)     b=b & 0xFF;
        if (b < 16)     sbuff.append("0");
        sbuff.append(Integer.toHexString(b).toUpperCase());
      }
      return sbuff.toString();
    }

    String method2(byte[] pHexBinary){
      StringBuffer result=new StringBuffer();
      for (int i=0; i < pHexBinary.length; i++) {
        byte b=pHexBinary[i];
        byte c=(byte)((b & 0xf0) >> 4);
        if (c <= 9) {
          result.append((char)('0' + c));
        }
     else {
          result.append((char)('A' + c - 10));
        }
        c=(byte)(b & 0x0f);
        if (c <= 9) {
          result.append((char)('0' + c));
        }
     else {
          result.append((char)('A' + c - 10));
        }
      }
      return result.toString();
    }
}
